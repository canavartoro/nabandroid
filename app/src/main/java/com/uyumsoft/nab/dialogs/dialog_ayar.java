package com.uyumsoft.nab.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.uyumsoft.nab.data.config;
import com.uyumsoft.nab.nab.MainActivity;
import com.uyumsoft.nab.nab.R;
import com.uyumsoft.nab.serv.UserInformation;
import com.uyumsoft.nab.util.screens;
import com.uyumsoft.nab.util.statics;
import com.uyumsoft.nab.util.streamWriter;

/**
 * Created by huseyin.celik on 13.03.2018.
 */
public class dialog_ayar extends Dialog implements View.OnClickListener {

    EditText txtWebUrl;

    public dialog_ayar(Context context) {
        super(context);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_ayar);

        txtWebUrl = (EditText)findViewById(R.id.txtWebUrl);
        config cfg = (config) streamWriter.DeSerilizeObj(MainActivity.SettingsFileName);
        if (cfg != null) {
            txtWebUrl.setText(cfg.ServiceURL);
        }

        ((Button)findViewById(R.id.btnKapat)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnKaydet)).setOnClickListener(this);
    }

    @Override
    public void onClick(View V) {
        switch (V.getId()) {
            case R.id.btnKapat:
                dismiss();
                break;
            case R.id.btnKaydet:
                config cfg = new config();
                cfg.ServiceURL = txtWebUrl.getText().toString();
                streamWriter.SerilizeObj(cfg, MainActivity.SettingsFileName);
                statics.setConfig(cfg);
                screens.showText("Ayarlar kaydedildi programdan çıkıp girin.");
                dismiss();
                break;
            default:
                break;
        }

    }

}
