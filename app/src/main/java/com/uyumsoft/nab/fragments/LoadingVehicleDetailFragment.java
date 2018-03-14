package com.uyumsoft.nab.fragments;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.uyumsoft.nab.adapters.adapter_Yukeleme;
import com.uyumsoft.nab.adapters.adapter_YukelemeDetay;
import com.uyumsoft.nab.data.serviceTaskDetay;
import com.uyumsoft.nab.data.serviceTaskYukleme;
import com.uyumsoft.nab.interfaces.OnFragmentInteractionListener;
import com.uyumsoft.nab.interfaces.servisListener;
import com.uyumsoft.nab.nab.R;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleStockDetail;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.serv.LoadingVehicleStockDetail;
import com.uyumsoft.nab.util.screens;
import com.uyumsoft.nab.util.statics;

import java.util.List;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;
import me.dm7.barcodescanner.zbar.ZBarScannerView.ResultHandler;
import me.dm7.barcodescanner.zbar.sample.SimpleScannerActivity;


public class LoadingVehicleDetailFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final int ZBAR_CAMERA_PERMISSION = 1;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private LoadingVehicleInstruction loadingVehicleInstruction = null;
    private ListView list_yuklemedetay;
    private EditText txtbarkod;
    private LayoutInflater layoutInflater;
    private View containerView;
    private LoadingVehicleStockDetail selectedItem = null;

    private OnFragmentInteractionListener mListener;

    public LoadingVehicleDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoadingVehicleDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoadingVehicleDetailFragment newInstance(String param1, String param2, LoadingVehicleInstruction item) {
        LoadingVehicleDetailFragment fragment = new LoadingVehicleDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putSerializable(ARG_PARAM3, item);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            loadingVehicleInstruction = (LoadingVehicleInstruction) getArguments().getSerializable(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().setTitle("Yükleme Detaylari");
        layoutInflater = inflater;
        containerView = layoutInflater.inflate(R.layout.fragment_loadingvehicledetail, container, false);
        txtbarkod = (EditText) containerView.findViewById(R.id.txtbarkod);
        txtbarkod.setOnKeyListener(new View.OnKeyListener() {
                                       @Override
                                       public boolean onKey(View v, int keyCode, KeyEvent event) {
                                           if ((event.getAction() == KeyEvent.ACTION_UP) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                                               String str = txtbarkod.getText().toString().trim();
                                               txtbarkod.setText("");
                                               if (str.equals("")) return true;
                                           }
                                           return false;
                                       }
                                   }
        );


        ((Button) containerView.findViewById(R.id.btnBarkod)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(getActivity(),
                            new String[]{Manifest.permission.CAMERA}, ZBAR_CAMERA_PERMISSION);
                } else {
                    Intent intent = new Intent(getContext(), SimpleScannerActivity.class);
                    getActivity().startActivityForResult(intent, 2);
                }
            }
        });

        ArrayOfLoadingVehicleStockDetail searchResults = new ArrayOfLoadingVehicleStockDetail();
        adapter_YukelemeDetay istAdapter = new adapter_YukelemeDetay(getActivity(), searchResults);
        list_yuklemedetay = (ListView) containerView.findViewById(R.id.list_yuklemedetay);
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
        list_yuklemedetay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()

        {

            public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
                Object o = list_yuklemedetay.getItemAtPosition(position);
                ((adapter_YukelemeDetay) list_yuklemedetay.getAdapter()).setSelectedPosition(position);
                selectedItem = (LoadingVehicleStockDetail) o;
                if (selectedItem != null) {
                }
                return true;
            }
        });

        serviceTaskDetay task = new serviceTaskDetay(loadingVehicleInstruction);
        task.setListener(new

                                 servisListener() {
                                     @Override
                                     public void onEnd(Object sender, Object data) {
                                         if (data != null) {
                                             ArrayOfLoadingVehicleStockDetail searchResults = (ArrayOfLoadingVehicleStockDetail) data;
                                             adapter_YukelemeDetay istAdapter = new adapter_YukelemeDetay(getActivity(), searchResults);
                                             list_yuklemedetay.setAdapter(istAdapter);
                                         }
                                     }

                                     @Override
                                     public void onError(Object sender, String errorString) {
                                         screens.showAlert(errorString, "Hata");
                                     }
                                 });
        task.start();

        statics.setCurrentActivity(getActivity());

        return containerView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void setBarkod(Result rawResult) {
        if (rawResult != null) {
            txtbarkod.setText(rawResult.getContents());
        }
    }


    @Override
    public void onClick(View view) {

    }
}
