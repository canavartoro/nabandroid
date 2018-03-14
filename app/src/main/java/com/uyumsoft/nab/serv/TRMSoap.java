package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import android.util.Log;

import org.ksoap2.SoapFault;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public final class TRMSoap {

    private Boolean debug = true;
    private String requestDump = "";
    private String responseDump = "";
    private String faultstring = "";

    public String Address;
    public boolean IsDotNet = false;
    public int TimeOut = 10000;
    protected static final String NAMESPACE = "http://tempuri.org/";

    public HelloWorldResponse HelloWorld(HelloWorld params) throws Exception {

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        envelope.addMapping(NAMESPACE, "HelloWorld", HelloWorld.class);

        new MarshalDecimal().register(envelope);
        new MarshalDouble().register(envelope);
        new MarshalDate().register(envelope);
        new MarshalFloat().register(envelope);


        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address, TimeOut);
        androidHttpTransport.debug = debug;

        try {
            androidHttpTransport.call(params.GetSoapAction(), envelope);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("HelloWorld", e.getMessage());
        }

        if (debug == true) {
            requestDump = androidHttpTransport.requestDump;
            responseDump = androidHttpTransport.responseDump;
        }

        HelloWorldResponse resp = null;
        SoapFault fault = getFault(envelope);
        if (fault == null) {
            //resp = HelloWorldResponse.class.cast(envelope.bodyIn);
            SoapObject response = (SoapObject) envelope.getResponse();
            if (response != null) {
                resp = new HelloWorldResponse();
                resp.loadSoapObject(response);
            }
        } else {
            Log.i(getClass().getSimpleName(), fault.faultstring);
            throw new Exception(fault.faultstring);
        }

        return resp;

    }

    public GetLoadingVehicleInstructionResponse GetLoadingVehicleInstruction(GetLoadingVehicleInstruction params) throws Exception {

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        envelope.addMapping(NAMESPACE, "GetLoadingVehicleInstruction", GetLoadingVehicleInstruction.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestBase", ServiceRequestBase.class);
        envelope.addMapping(NAMESPACE, "UserInformation", UserInformation.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestOfLoadingVehicleInstruction", ServiceRequestOfLoadingVehicleInstruction.class);
        envelope.addMapping(NAMESPACE, "IdContainer", IdContainer.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicleInstruction", LoadingVehicleInstruction.class);

        new MarshalDecimal().register(envelope);
        new MarshalDouble().register(envelope);
        new MarshalDate().register(envelope);
        new MarshalFloat().register(envelope);


        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address, TimeOut);
        androidHttpTransport.debug = debug;

        try {
            androidHttpTransport.call(params.GetSoapAction(), envelope);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("GetLoadingVehicleInstruction", e.getMessage());
        }

        if (debug == true) {
            requestDump = androidHttpTransport.requestDump;
            responseDump = androidHttpTransport.responseDump;
        }

        GetLoadingVehicleInstructionResponse resp = null;
        SoapFault fault = getFault(envelope);
        if (fault == null) {
            //resp = GetLoadingVehicleInstructionResponse.class.cast(envelope.bodyIn);
            SoapObject response = (SoapObject) envelope.getResponse();
            if (response != null) {
                resp = new GetLoadingVehicleInstructionResponse();
                resp.loadSoapObject(response);
            }
        } else {
            Log.i(getClass().getSimpleName(), fault.faultstring);
            throw new Exception(fault.faultstring);
        }

        return resp;

    }

    public GetLoadingVehicleStockDetailsResponse GetLoadingVehicleStockDetails(GetLoadingVehicleStockDetails params) throws Exception {

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        envelope.addMapping(NAMESPACE, "GetLoadingVehicleStockDetails", GetLoadingVehicleStockDetails.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestBase", ServiceRequestBase.class);
        envelope.addMapping(NAMESPACE, "UserInformation", UserInformation.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestOfLoadingVehicle", ServiceRequestOfLoadingVehicle.class);
        envelope.addMapping(NAMESPACE, "IdContainer", IdContainer.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicle", LoadingVehicle.class);
        envelope.addMapping(NAMESPACE, "ArrayOfLoadingVehicleStockDetail", ArrayOfLoadingVehicleStockDetail.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicleStockDetail", LoadingVehicleStockDetail.class);
        envelope.addMapping(NAMESPACE, "ArrayOfLoadingVehicleSerial", ArrayOfLoadingVehicleSerial.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicleSerial", LoadingVehicleSerial.class);

        new MarshalDecimal().register(envelope);
        new MarshalDouble().register(envelope);
        new MarshalDate().register(envelope);
        new MarshalFloat().register(envelope);


        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address, TimeOut);
        androidHttpTransport.debug = debug;

        try {
            androidHttpTransport.call(params.GetSoapAction(), envelope);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("GetLoadingVehicleStockDetails", e.getMessage());
        }

        if (debug == true) {
            requestDump = androidHttpTransport.requestDump;
            responseDump = androidHttpTransport.responseDump;
        }

        GetLoadingVehicleStockDetailsResponse resp = null;
        SoapFault fault = getFault(envelope);
        if (fault == null) {
            //resp = GetLoadingVehicleStockDetailsResponse.class.cast(envelope.bodyIn);
            SoapObject response = (SoapObject) envelope.getResponse();
            if (response != null) {
                resp = new GetLoadingVehicleStockDetailsResponse();
                resp.loadSoapObject(response);
            }
        } else {
            Log.i(getClass().getSimpleName(), fault.faultstring);
            throw new Exception(fault.faultstring);
        }

        return resp;

    }

    public LoginResponse Login(Login params) throws Exception {

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        envelope.addMapping(NAMESPACE, "Login", Login.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestBase", ServiceRequestBase.class);
        envelope.addMapping(NAMESPACE, "UserInformation", UserInformation.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestOfUser", ServiceRequestOfUser.class);
        envelope.addMapping(NAMESPACE, "IdContainer", IdContainer.class);
        envelope.addMapping(NAMESPACE, "User", User.class);

        new MarshalDecimal().register(envelope);
        new MarshalDouble().register(envelope);
        new MarshalDate().register(envelope);
        new MarshalFloat().register(envelope);


        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address, TimeOut);
        androidHttpTransport.debug = debug;

        try {
            androidHttpTransport.call(params.GetSoapAction(), envelope);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Login", e.getMessage());
        }

        if (debug == true) {
            requestDump = androidHttpTransport.requestDump;
            responseDump = androidHttpTransport.responseDump;
        }

        LoginResponse resp = null;
        SoapFault fault = getFault(envelope);
        if (fault == null) {
            //resp = LoginResponse.class.cast(envelope.bodyIn);
            SoapObject response = (SoapObject) envelope.getResponse();
            if (response != null) {
                resp = new LoginResponse();
                resp.loadSoapObject(response);
            }
        } else {
            Log.i(getClass().getSimpleName(), fault.faultstring);
            throw new Exception(fault.faultstring);
        }

        return resp;

    }

    public SaveLoadingVehicleResponse SaveLoadingVehicle(SaveLoadingVehicle params) throws Exception {

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        envelope.addMapping(NAMESPACE, "SaveLoadingVehicle", SaveLoadingVehicle.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestBase", ServiceRequestBase.class);
        envelope.addMapping(NAMESPACE, "UserInformation", UserInformation.class);
        envelope.addMapping(NAMESPACE, "ServiceRequestOfLoadingVehicle", ServiceRequestOfLoadingVehicle.class);
        envelope.addMapping(NAMESPACE, "IdContainer", IdContainer.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicle", LoadingVehicle.class);
        envelope.addMapping(NAMESPACE, "ArrayOfLoadingVehicleStockDetail", ArrayOfLoadingVehicleStockDetail.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicleStockDetail", LoadingVehicleStockDetail.class);
        envelope.addMapping(NAMESPACE, "ArrayOfLoadingVehicleSerial", ArrayOfLoadingVehicleSerial.class);
        envelope.addMapping(NAMESPACE, "LoadingVehicleSerial", LoadingVehicleSerial.class);

        new MarshalDecimal().register(envelope);
        new MarshalDouble().register(envelope);
        new MarshalDate().register(envelope);
        new MarshalFloat().register(envelope);


        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address, TimeOut);
        androidHttpTransport.debug = debug;

        try {
            androidHttpTransport.call(params.GetSoapAction(), envelope);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("SaveLoadingVehicle", e.getMessage());
        }

        if (debug == true) {
            requestDump = androidHttpTransport.requestDump;
            responseDump = androidHttpTransport.responseDump;
        }

        SaveLoadingVehicleResponse resp = null;
        SoapFault fault = getFault(envelope);
        if (fault == null) {
            //resp = SaveLoadingVehicleResponse.class.cast(envelope.bodyIn);
            SoapObject response = (SoapObject) envelope.getResponse();
            if (response != null) {
                resp = new SaveLoadingVehicleResponse();
                resp.loadSoapObject(response);
            }
        } else {
            Log.i(getClass().getSimpleName(), fault.faultstring);
            throw new Exception(fault.faultstring);
        }

        return resp;

    }


    public String getRequestDump() {
        return requestDump;
    }

    public String getResponseDump() {
        return responseDump;
    }

    public String getFaultString() {
        return faultstring;
    }

    public void setDebug(Boolean isdebug) {
        debug = isdebug;
    }

    private SoapFault getFault(SoapSerializationEnvelope envelope) {
        SoapFault fault = null;
        faultstring = "";
        try {
            fault = SoapFault.class.cast(envelope.bodyIn);
            Log.e(getClass().getSimpleName(), fault.faultstring);
            faultstring = fault.faultstring;
        } catch (final ClassCastException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fault;
    }

}