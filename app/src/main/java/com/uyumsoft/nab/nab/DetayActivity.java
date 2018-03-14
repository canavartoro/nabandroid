package com.uyumsoft.nab.nab;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.uyumsoft.nab.adapters.adapter_YukelemeDetay;
import com.uyumsoft.nab.data.serviceTaskDetay;
import com.uyumsoft.nab.data.serviceTaskSave;
import com.uyumsoft.nab.interfaces.onPositiveListener;
import com.uyumsoft.nab.interfaces.servisListener;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleSerial;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleStockDetail;
import com.uyumsoft.nab.serv.LoadingVehicle;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.serv.LoadingVehicleStockDetail;
import com.uyumsoft.nab.util.screens;
import com.uyumsoft.nab.util.statics;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;
import me.dm7.barcodescanner.zbar.sample.SimpleScannerActivity;

public class DetayActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int ZBAR_CAMERA_PERMISSION = 1;

    private LoadingVehicleInstruction loadingVehicleInstruction = null;
    private ListView list_yuklemedetay;
    private TextView textInfo;
    private Button btnKaydet;
    private EditText txtbarkod;
    private LayoutInflater layoutInflater;
    private View containerView;
    private LoadingVehicleStockDetail selectedItem = null;

    private ZBarScannerView mScannerView;
    private ZBarScannerView.ResultHandler resultHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            loadingVehicleInstruction = (LoadingVehicleInstruction) extra.getSerializable("selectedItem");
        }

        textInfo = (TextView) findViewById(R.id.textInfo);
        txtbarkod = (EditText) findViewById(R.id.txtbarkod);
        txtbarkod.setOnKeyListener(new View.OnKeyListener() {
                                       @Override
                                       public boolean onKey(View v, int keyCode, KeyEvent event) {
                                           if ((event.getAction() == KeyEvent.ACTION_UP) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                                               String str = txtbarkod.getText().toString().trim();
                                               txtbarkod.setText("");
                                               if (str.equals("") == false) {
                                                   statics.setCurrentActivity(DetayActivity.this);
                                                   if (selectedItem != null) {
                                                       statics.getDb().insertVehicleBar(selectedItem.Id, selectedItem.StockId, selectedItem.StockCode, str);
                                                       screens.showText(str + " Eklendi");
                                                   } else {
                                                       screens.showText("Detay satırını seçin!");
                                                   }
                                               }
                                               txtbarkod.requestFocus();
                                           }
                                           return false;
                                       }
                                   }
        );


        ((Button) findViewById(R.id.btnBarkod)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(DetayActivity.this, Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(DetayActivity.this,
                            new String[]{Manifest.permission.CAMERA}, ZBAR_CAMERA_PERMISSION);
                } else {
                    Intent intent = new Intent(DetayActivity.this, SimpleScannerActivity.class);
                    startActivityForResult(intent, 2);
                }
            }
        });

        btnKaydet = (Button) findViewById(R.id.btnKaydet);
        btnKaydet.setOnClickListener(this);
        ((Button) findViewById(R.id.btnCik)).setOnClickListener(this);

        ArrayOfLoadingVehicleStockDetail searchResults = null;
        if (loadingVehicleInstruction != null) {
            searchResults = statics.getDb().getAllLoadingDetVehicle(loadingVehicleInstruction.Id);
        } else {
            searchResults = new ArrayOfLoadingVehicleStockDetail();
        }
        textInfo.setText(searchResults.size() + " Satır");
        adapter_YukelemeDetay istAdapter = new adapter_YukelemeDetay(DetayActivity.this, searchResults);
        list_yuklemedetay = (ListView) findViewById(R.id.list_yuklemedetay);
        list_yuklemedetay.setAdapter(istAdapter);
        list_yuklemedetay.setTextFilterEnabled(true);
        list_yuklemedetay.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = list_yuklemedetay.getItemAtPosition(position);
                ((adapter_YukelemeDetay) list_yuklemedetay.getAdapter()).setSelectedPosition(position);
                selectedItem = (LoadingVehicleStockDetail) o;
                if (selectedItem != null) {

                }
            }
        });
        list_yuklemedetay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                Object o = list_yuklemedetay.getItemAtPosition(position);
                ((adapter_YukelemeDetay) list_yuklemedetay.getAdapter()).setSelectedPosition(position);
                selectedItem = (LoadingVehicleStockDetail) o;
                if (selectedItem != null) {
                }
                return true;
            }
        });

        statics.setCurrentActivity(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            String strBarkod = data.getExtras().getString("Barkod");
            if (strBarkod != null) {
                txtbarkod.setText(strBarkod);
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnKaydet) {
            if (loadingVehicleInstruction == null) return;

            statics.setCurrentActivity(this);

            screens.showAlert("Bilgiler kaydedilsin mi?", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    LoadingVehicle loadingVehicle = new LoadingVehicle();
                    loadingVehicle.InstructionId = loadingVehicleInstruction.Id;
                    loadingVehicle.DocNo = loadingVehicleInstruction.VehicleNo;
                    loadingVehicle.InstructionNo = loadingVehicleInstruction.InstructionNo;
                    loadingVehicle.DocDate = loadingVehicleInstruction.InstructionDate;
                    loadingVehicle.StockDetails = new ArrayOfLoadingVehicleStockDetail();
                    ArrayOfLoadingVehicleStockDetail stockDetails = statics.getDb().getAllLoadingDetVehicle(loadingVehicleInstruction.Id);
                    for (int loop = 0; loop < stockDetails.size(); loop++) {
                        LoadingVehicleStockDetail detail = stockDetails.elementAt(loop);
                        ArrayOfLoadingVehicleSerial vehicleSerials = statics.getDb().getAllLoadingBarcodeVehicle(detail.Id);
                        detail.LoadingVehicleSerials = vehicleSerials;
                        loadingVehicle.StockDetails.add(detail);
                    }

                    serviceTaskSave taskSave = new serviceTaskSave(loadingVehicle);
                    taskSave.setListener(new servisListener() {
                        @Override
                        public void onEnd(Object sender, Object data) {
                            screens.showText("Kaydedildi");
                            statics.getDb().deleteAllVehicle();
                        }

                        @Override
                        public void onError(Object sender, String errorString) {
                            screens.showAlert(errorString);
                        }
                    });
                    taskSave.start();

                    //test icin ....
                    /*Cursor cursor = statics.getDb().getData(1);
                    cursor.moveToFirst();
                    while (cursor.isAfterLast() == false) {
                        System.out.println(cursor.getInt(cursor.getColumnIndex("VehicleLoadingId")));
                        cursor.moveToNext();
                    }*/
                }
            }, true);
        } else if (view.getId() == R.id.btnCik) {
            finish();
        }
    }
}
