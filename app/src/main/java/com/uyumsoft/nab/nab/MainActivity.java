package com.uyumsoft.nab.nab;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.ProgressDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.telephony.TelephonyManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import com.uyumsoft.nab.adapters.adapter_Yukeleme;
import com.uyumsoft.nab.data.DatabaseHandler;
import com.uyumsoft.nab.data.config;
import com.uyumsoft.nab.data.serviceTaskYukleme;
import com.uyumsoft.nab.dialogs.dialog_ayar;
import com.uyumsoft.nab.fragments.LoadingVehicleDetailFragment;
import com.uyumsoft.nab.fragments.LoadingVehicleFragment;
import com.uyumsoft.nab.interfaces.OnFragmentInteractionListener;
import com.uyumsoft.nab.interfaces.onSelectedItemListener;
import com.uyumsoft.nab.interfaces.servisListener;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.GetLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.GetLoadingVehicleInstructionResponse;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ServiceRequestOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ServiceResponseOfListOfLoadingVehicleInstruction;

import com.uyumsoft.nab.serv.UserInformation;
import com.uyumsoft.nab.util.screens;
import com.uyumsoft.nab.util.statics;
import com.uyumsoft.nab.util.streamWriter;

import me.dm7.barcodescanner.zbar.sample.SimpleScannerActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnFragmentInteractionListener {

    public static final String UserInformationFileName = "UserInformation.dat";
    public static final String SettingsFileName = "ayar.dat";

    private LoadingVehicleInstruction selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        statics.setMainActivity(this);
        statics.setCurrentActivity(this);

        /*UserInformation param = new UserInformation();
        param.Password = "1";
        param.Username = "huseyinclk";
        param.CoId = 1;
        statics.setUser(param);
        Intent intent = new Intent(MainActivity.this, DetayActivity.class);
        startActivityForResult(intent, 300);*/


        config cfg = (config) streamWriter.DeSerilizeObj(MainActivity.SettingsFileName);
        if (cfg != null) {
            statics.setConfig(cfg);
        }
        else {
            cfg = new config();
            cfg.ServiceURL = "http://10.0.2.2:4444";
            streamWriter.SerilizeObj(cfg, MainActivity.SettingsFileName);
            statics.setConfig(cfg);
        }
        UserInformation param = (UserInformation) streamWriter.DeSerilizeObj(MainActivity.UserInformationFileName);
        if (param == null) {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivityForResult(loginIntent, 200);
        } else {
            statics.setUser(param);
            selectItem(R.id.nav_yuklemeler);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200) {
            if (resultCode != 200) {
                //System.exit(0);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            } else {
                selectItem(R.id.nav_yuklemeler);
            }
        }
        else if (requestCode == 300) {

        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            final dialog_ayar settings = new dialog_ayar(MainActivity.this);
            settings.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    dialog.dismiss();
                }
            });
            settings.setCancelable(false);
            settings.show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        return selectItem(item.getItemId());
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private Boolean selectItem(int id) {

        statics.setCurrentActivity(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.nav_yuklemedetay) {
            /*drawer.closeDrawer(GravityCompat.START);
            LoadingVehicleDetailFragment fragment = LoadingVehicleDetailFragment.newInstance("", "", selectedItem);
            statics.setCurrentFragment(fragment);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();*/
            return true;
        } else if (id == R.id.nav_sunucudanal) {
            serviceTaskYukleme taskYukleme = new serviceTaskYukleme();
            taskYukleme.setListener(new servisListener() {
                @Override
                public void onEnd(Object sender, Object data) {

                }

                @Override
                public void onError(Object sender, String errorString) {
                    screens.showAlert(errorString);
                }
            });
            taskYukleme.start();

        } else if (id == R.id.nav_sunucuyagonder) {

        } else {
            drawer.closeDrawer(GravityCompat.START);
            LoadingVehicleFragment fragment = new LoadingVehicleFragment();
            statics.setCurrentFragment(fragment);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public String findDeviceID() {

        String imeistring = null;
        String imsistring = null;

        TelephonyManager telephonyManager;

        try {
            telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                return "";
            }

            imeistring = telephonyManager.getDeviceId();

            imsistring = telephonyManager.getSubscriberId();

            //String android_id = Secure.getString(getApplicationContext().getContentResolver(), Secure.ANDROID_ID);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imsistring;
    }
}
