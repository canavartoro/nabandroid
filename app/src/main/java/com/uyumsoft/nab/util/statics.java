package com.uyumsoft.nab.util;

import android.app.Activity;

import com.uyumsoft.nab.data.DatabaseHandler;
import com.uyumsoft.nab.data.config;
import com.uyumsoft.nab.nab.MainActivity;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ServiceResponseOfListOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.TRMSoap;
import com.uyumsoft.nab.serv.UserInformation;

/**
 * Created by huseyin.celik on 5.02.2018.
 */

public class statics {

    private static UserInformation user = null;
    private static TRMSoap webserv = null;
    private static MainActivity mainActivity;
    private static Activity currentActivity;
    private static ArrayOfLoadingVehicleInstruction arrayLoadingVehicleInstruction;
    private static int currentFragmentIndex=0;
    private static android.support.v4.app.Fragment currentFragment;
    private static DatabaseHandler db;
    private static config cfg;

    public static  UserInformation getUser() {
        return  user;
    }

    public static void setUser(UserInformation u){
        user = u;
    }

    public static TRMSoap getWebServ() {
        if (webserv == null) {
            webserv = new TRMSoap();
            if (cfg != null) {
                webserv.Address = cfg.ServiceURL + "/WebService/TRM/trm.asmx";
            }
            else {
                screens.showText("Servis bağlantı bilgisi ayarlanmadı!");
            }
            webserv.IsDotNet = true;
            webserv.TimeOut = 9999;
        }
        return webserv;
    }

    public static void setMainActivity(MainActivity ac) {
        mainActivity = ac;
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setCurrentActivity(Activity ac) {
        currentActivity = ac;
    }

    public static Activity getCurrentActivity() {
        return currentActivity;
    }

    public static void setListOfLoadingVehicleInstruction(ArrayOfLoadingVehicleInstruction array) {
        arrayLoadingVehicleInstruction = array;
    }

    public static ArrayOfLoadingVehicleInstruction getListOfLoadingVehicleInstruction() {
        return arrayLoadingVehicleInstruction;
    }
    public static int getCurrentFragmentIndex() {
        return currentFragmentIndex;
    }

    public static void setCurrentFragmentIndex(int i) {
        statics.currentFragmentIndex = i;
    }

    public static android.support.v4.app.Fragment getCurrentFragment() {
        return currentFragment;
    }

    public static void setCurrentFragment(android.support.v4.app.Fragment fragment) {
        statics.currentFragment = fragment;
    }

    public static DatabaseHandler getDb() {
        if (db == null) {
            db = new DatabaseHandler(getMainActivity());
        }
        return db;
    }

    public static config getConfig() {
        return cfg;
    }

    public static void setConfig(config c) {
        webserv = null;
        cfg = c;
    }

}
