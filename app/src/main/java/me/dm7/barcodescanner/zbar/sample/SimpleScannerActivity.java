package me.dm7.barcodescanner.zbar.sample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.Toast;

import com.uyumsoft.nab.fragments.LoadingVehicleDetailFragment;
import com.uyumsoft.nab.nab.R;
import com.uyumsoft.nab.util.statics;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;

public class SimpleScannerActivity extends BaseScannerActivity implements ZBarScannerView.ResultHandler {
    private ZBarScannerView mScannerView;
    private ZBarScannerView.ResultHandler resultHandler;

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_simple_scanner);
        setupToolbar();
        ViewGroup contentFrame = (ViewGroup) findViewById(R.id.content_frame);
        mScannerView = new ZBarScannerView(this);
        contentFrame.addView(mScannerView);
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    public void setResultHandler(ZBarScannerView.ResultHandler handler) {
        resultHandler = handler;
    }

    @Override
    public void handleResult(Result rawResult) {

        if (rawResult != null) {
            /*if (statics.getCurrentFragment() != null && statics.getCurrentFragment() instanceof LoadingVehicleDetailFragment) {
                ((LoadingVehicleDetailFragment)statics.getCurrentFragment()).setBarkod(rawResult);
            }*/

            Intent iData = new Intent();
            iData.putExtra("Barkod", rawResult.getContents());
            setResult(android.app.Activity.RESULT_OK, iData);

            finish();
        }

        /*Toast.makeText(this, "Contents = " + rawResult.getContents() +
                ", Format = " + rawResult.getBarcodeFormat().getName(), Toast.LENGTH_SHORT).show();
        // Note:
        // * Wait 2 seconds to resume the preview.
        // * On older devices continuously stopping and resuming camera preview can result in freezing the app.
        // * I don't know why this is the case but I don't have the time to figure out.
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mScannerView.resumeCameraPreview(SimpleScannerActivity.this);
            }
        }, 2000);*/
    }
}
