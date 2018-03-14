package com.uyumsoft.nab.data;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.uyumsoft.nab.interfaces.servisListener;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleStockDetail;
import com.uyumsoft.nab.serv.GetLoadingVehicleStockDetails;
import com.uyumsoft.nab.serv.GetLoadingVehicleStockDetailsResponse;
import com.uyumsoft.nab.serv.LoadingVehicle;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.serv.LoadingVehicleStockDetail;
import com.uyumsoft.nab.serv.ServiceRequestOfLoadingVehicle;
import com.uyumsoft.nab.util.statics;

/**
 * Created by huseyin.celik on 12.03.2018.
 */

public class serviceTaskDetay extends Thread {

    final ProgressDialog dialog = ProgressDialog.show(statics.getCurrentActivity(), "Bekleyin", "Bilgiler yükleniyor ..", true);
    private servisListener listener;
    private LoadingVehicleInstruction loadingVehicleInstruction;

    public void setListener(servisListener l) {
        listener = l;
    }


    public serviceTaskDetay(LoadingVehicleInstruction arg) {
        loadingVehicleInstruction = arg;
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
                    ArrayOfLoadingVehicleStockDetail items = (ArrayOfLoadingVehicleStockDetail) msg.getData().getSerializable("items");
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

        if (loadingVehicleInstruction == null) {
            handler.sendMessage(getMessage(0, "Parametre eksik!",null));
            return;
        }

        GetLoadingVehicleStockDetails param = new GetLoadingVehicleStockDetails();
        param.context = new ServiceRequestOfLoadingVehicle();
        param.context.LoginInformation = statics.getUser();
        param.context.FilterObject = new LoadingVehicle();
        param.context.FilterObject.Id = loadingVehicleInstruction.Id;

        try {
            GetLoadingVehicleStockDetailsResponse resp = statics.getWebServ().GetLoadingVehicleStockDetails(param);
            if (resp != null && resp.GetLoadingVehicleStockDetailsResult != null && resp.GetLoadingVehicleStockDetailsResult.Item != null) {
                for (int loop = 0; loop < resp.GetLoadingVehicleStockDetailsResult.Item.size(); loop++) {
                    LoadingVehicleStockDetail item = resp.GetLoadingVehicleStockDetailsResult.Item.elementAt(loop);
                }
                handler.sendMessage(getMessage(1, "", resp.GetLoadingVehicleStockDetailsResult.Item));
            }

        } catch (Exception e) {
            e.printStackTrace();
            handler.sendMessage(getMessage(0, e.getMessage(), null));
        }

    }

    private Message getMessage(int status, String msg, ArrayOfLoadingVehicleStockDetail items) {
        Message m = new Message();
        Bundle b = new Bundle();
        b.putInt("status", status);
        b.putString("mesaj", msg);
        b.putSerializable("items", items);
        m.setData(b);
        return m;
    }
}