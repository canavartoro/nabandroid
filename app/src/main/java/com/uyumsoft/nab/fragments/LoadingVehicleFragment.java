package com.uyumsoft.nab.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.uyumsoft.nab.adapters.adapter_Yukeleme;
import com.uyumsoft.nab.data.DatabaseHandler;
import com.uyumsoft.nab.data.serviceTaskYukleme;
import com.uyumsoft.nab.interfaces.OnFragmentInteractionListener;
import com.uyumsoft.nab.interfaces.onSelectedItemListener;
import com.uyumsoft.nab.interfaces.servisListener;
import com.uyumsoft.nab.nab.DetayActivity;
import com.uyumsoft.nab.nab.MainActivity;
import com.uyumsoft.nab.nab.R;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.util.screens;
import com.uyumsoft.nab.util.statics;
import com.uyumsoft.nab.util.streamWriter;


public class LoadingVehicleFragment extends Fragment {

    private LayoutInflater layoutInflater;
    private View containerView;
    private ListView list_yukleme;
    private LoadingVehicleInstruction selectedItem = null;

    private int selectedItemIndex = -1;


    private OnFragmentInteractionListener mListener;

    public LoadingVehicleFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Yükleme Emirleri");
        layoutInflater = inflater;
        containerView = layoutInflater.inflate(R.layout.fragment_loadingvehicle, container, false);

        ArrayOfLoadingVehicleInstruction searchResults = statics.getDb().getAllLoadingVehicle();
        adapter_Yukeleme istAdapter = new adapter_Yukeleme(getActivity(), searchResults);
        list_yukleme = (ListView) containerView.findViewById(R.id.list_yukleme);
        list_yukleme.setAdapter(istAdapter);
        list_yukleme.setTextFilterEnabled(true);
        list_yukleme.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = list_yukleme.getItemAtPosition(position);
                ((adapter_Yukeleme) list_yukleme.getAdapter()).setSelectedPosition(position);
                selectedItem = (LoadingVehicleInstruction) o;
                if (selectedItem != null) {
                    selectedItemIndex = position;
                }
            }
        });
        list_yukleme.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
                Object o = list_yukleme.getItemAtPosition(position);
                ((adapter_Yukeleme) list_yukleme.getAdapter()).setSelectedPosition(position);
                selectedItem = (LoadingVehicleInstruction) o;
                if (selectedItem != null) {
                    selectedItemIndex = position;
                    Bundle bund = new Bundle();
                    bund.putSerializable("selectedItem", selectedItem);
                    Intent intent = new Intent(getActivity(), DetayActivity.class);
                    intent.putExtras(bund);
                    startActivity(intent);
                }
                return true;
            }
        });

        if (statics.getConfig().YuklemeOneri == false) {
            statics.setCurrentActivity(getActivity());
            statics.getConfig().YuklemeOneri = true;
            streamWriter.SerilizeObj(statics.getConfig(), MainActivity.SettingsFileName);
            screens.showText("Listeden bir elemena uzun basarak seçebilirsiniz!");
        }




        /*serviceTaskYukleme task = new serviceTaskYukleme();
        task.setListener(new servisListener() {
            @Override
            public void onEnd(Object sender, Object data) {
                if (data != null) {
                    ArrayOfLoadingVehicleInstruction searchResults =  (ArrayOfLoadingVehicleInstruction)data;
                    adapter_Yukeleme istAdapter = new adapter_Yukeleme(getActivity(), searchResults);
                    list_yukleme.setAdapter(istAdapter);
                }
            }

            @Override
            public void onError(Object sender, String errorString) {
                screens.showAlert(errorString, "Hata");
            }
        });
        task.start();*/
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


}
