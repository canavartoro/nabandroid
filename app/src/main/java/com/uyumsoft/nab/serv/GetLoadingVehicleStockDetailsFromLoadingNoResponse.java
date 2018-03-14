package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetLoadingVehicleStockDetailsFromLoadingNoResponse extends BaseObject {

    public ServiceResponseOfListOfLoadingVehicleStockDetail GetLoadingVehicleStockDetailsFromLoadingNoResult;


    public Object getProperty(int index)
    {

    	return GetLoadingVehicleStockDetailsFromLoadingNoResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetLoadingVehicleStockDetailsFromLoadingNoResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetLoadingVehicleStockDetailsFromLoadingNoResult = (ServiceResponseOfListOfLoadingVehicleStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetLoadingVehicleStockDetailsFromLoadingNoResult = new ServiceResponseOfListOfLoadingVehicleStockDetail();
		GetLoadingVehicleStockDetailsFromLoadingNoResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetLoadingVehicleStockDetailsFromLoadingNoResponse", this.getClass());
        new ServiceResponseOfListOfLoadingVehicleStockDetail().register(envelope);
    }*/

}