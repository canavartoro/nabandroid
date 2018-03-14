package com.uyumsoft.nab.data;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.uyumsoft.nab.adapters.adapter_Yukeleme;
import com.uyumsoft.nab.interfaces.servisListener;
import com.uyumsoft.nab.nab.MainActivity;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.GetLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.GetLoadingVehicleInstructionResponse;
import com.uyumsoft.nab.serv.GetLoadingVehicleStockDetails;
import com.uyumsoft.nab.serv.GetLoadingVehicleStockDetailsResponse;
import com.uyumsoft.nab.serv.LoadingVehicle;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.serv.LoadingVehicleStockDetail;
import com.uyumsoft.nab.serv.ServiceRequestOfLoadingVehicle;
import com.uyumsoft.nab.serv.ServiceRequestOfLoadingVehicleInstruction;
import com.uyumsoft.nab.util.statics;

/**
 * Created by huseyin.celik on 10.03.2018.
 */

public class serviceTaskYukleme extends Thread {

    final ProgressDialog dialog = ProgressDialog.show(statics.getCurrentActivity(), "Bekleyin", "Bilgiler yükleniyor ..", true);
    private servisListener listener;

    public void setListener(servisListener l) {
        listener = l;
    }


    public serviceTaskYukleme() {

    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            try {
                if (dialog != null)
                    dialog.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }

            int status = 0;
            String string = "";
            if (msg != null) {
                status = msg.getData().getInt("status");
                string = msg.getData().getString("mesaj");
                if (status == 1) {
                    ArrayOfLoadingVehicleInstruction items = (ArrayOfLoadingVehicleInstruction) msg.getData().getSerializable("items");
                    if (listener != null) listener.onEnd(this, items);
                } else {
                    if (listener != null) listener.onError(this, string);
                }
            } else {
                if (listener != null) listener.onError(this, "Sunucu yanıt vermedi!");
            }
        }
    };

    @Override
    public void run() {

        GetLoadingVehicleInstruction param = new GetLoadingVehicleInstruction();
        param.context = new ServiceRequestOfLoadingVehicleInstruction();
        param.context.FilterObject = new LoadingVehicleInstruction();
        param.context.LoginInformation = statics.getUser();

        try {
            statics.getDb().deleteAllVehicle();
            GetLoadingVehicleInstructionResponse resp = statics.getWebServ().GetLoadingVehicleInstruction(param);
            if (resp != null && resp.GetLoadingVehicleInstructionResult != null && resp.GetLoadingVehicleInstructionResult.Item != null) {
                for (int loop = 0; loop < resp.GetLoadingVehicleInstructionResult.Item.size(); loop++) {

                    LoadingVehicleInstruction item = resp.GetLoadingVehicleInstructionResult.Item.elementAt(loop);

                    statics.getDb().insertVehicle(item.Id, item.InstructionNo, item.InstructionDate, item.VehicleNo, item.Driver, item.ShippingType, item.ShipperInformation);

                    GetLoadingVehicleStockDetails param2 = new GetLoadingVehicleStockDetails();
                    param2.context = new ServiceRequestOfLoadingVehicle();
                    param2.context.LoginInformation = statics.getUser();
                    param2.context.FilterObject = new LoadingVehicle();
                    param2.context.FilterObject.Id = item.Id;
                    GetLoadingVehicleStockDetailsResponse resp2 = statics.getWebServ().GetLoadingVehicleStockDetails(param2);
                    if (resp2 != null && resp2.GetLoadingVehicleStockDetailsResult != null && resp2.GetLoadingVehicleStockDetailsResult.Item != null) {
                        for (int l = 0; l < resp2.GetLoadingVehicleStockDetailsResult.Item.size(); l++) {
                            LoadingVehicleStockDetail item2 = resp2.GetLoadingVehicleStockDetailsResult.Item.elementAt(l);
                            statics.getDb().deleteAllVehicleBarcode(item2.Id);
                            statics.getDb().insertVehicleDet(item2.Id, item.Id, item2.OrderId, item2.OrderNo, item2.StockId, item2.StockName, item2.DispatchTown, item2.DispatchCity, item2.DispatchAddress, item2.CurrentName, item2.CurrentCode, item2.CurrentId, item2.Amount, item2.DispatchOrderNo, item2.Property1);
                        }
                    }
                }
                //statics.setListOfLoadingVehicleInstruction(resp.GetLoadingVehicleInstructionResult.Item);
                handler.sendMessage(getMessage(1, "", resp.GetLoadingVehicleInstructionResult.Item));

            }

        } catch (Exception e) {
            e.printStackTrace();
            handler.sendMessage(getMessage(0, e.getMessage(), null));
        }

    }

    private Message getMessage(int status, String msg, ArrayOfLoadingVehicleInstruction items) {
        Message m = new Message();
        Bundle b = new Bundle();
        b.putInt("status", status);
        b.putString("mesaj", msg);
        b.putSerializable("items", items);
        m.setData(b);
        return m;
    }
}
