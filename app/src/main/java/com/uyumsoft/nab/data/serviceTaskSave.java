package com.uyumsoft.nab.data;

/**
 * Created by huseyin.celik on 13.03.2018.
 */

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
import com.uyumsoft.nab.serv.SaveLoadingVehicle;
import com.uyumsoft.nab.serv.SaveLoadingVehicleResponse;
import com.uyumsoft.nab.serv.ServiceRequestOfLoadingVehicle;
import com.uyumsoft.nab.util.statics;

public class serviceTaskSave extends Thread {

    final ProgressDialog dialog = ProgressDialog.show(statics.getCurrentActivity(), "Bekleyin", "Bilgiler yükleniyor ..", true);
    private servisListener listener;
    private LoadingVehicle loadingVehicle;

    public void setListener(servisListener l) {
        listener = l;
    }


    public serviceTaskSave(LoadingVehicle arg) {
        loadingVehicle = arg;
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
                    if (listener != null) listener.onEnd(this, null);
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

        if (loadingVehicle == null) {
            handler.sendMessage(getMessage(0, "Parametre eksik!"));
            return;
        }

        SaveLoadingVehicle param = new SaveLoadingVehicle();
        param.context = new ServiceRequestOfLoadingVehicle();
        param.context.LoginInformation = statics.getUser();
        param.context.FilterObject = new LoadingVehicle();
        param.context.FilterObject = loadingVehicle;

        try {
            SaveLoadingVehicleResponse resp = statics.getWebServ().SaveLoadingVehicle(param);
            if (resp != null && resp.SaveLoadingVehicleResult != null && resp.SaveLoadingVehicleResult.Errors != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int loop = 0; loop < resp.SaveLoadingVehicleResult.Errors.size(); loop++) {
                    stringBuilder.append(resp.SaveLoadingVehicleResult.Errors.elementAt(loop));
                }
                handler.sendMessage(getMessage(1, stringBuilder.toString()));
            }

        } catch (Exception e) {
            e.printStackTrace();
            handler.sendMessage(getMessage(0, e.getMessage()));
        }

    }

    private Message getMessage(int status, String msg) {
        Message m = new Message();
        Bundle b = new Bundle();
        b.putInt("status", status);
        b.putString("mesaj", msg);
        m.setData(b);
        return m;
    }
}