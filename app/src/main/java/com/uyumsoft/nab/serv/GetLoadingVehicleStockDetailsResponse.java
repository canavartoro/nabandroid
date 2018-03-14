package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetLoadingVehicleStockDetailsResponse extends BaseObject {

    public ServiceResponseOfListOfLoadingVehicleStockDetail GetLoadingVehicleStockDetailsResult;


    public Object getProperty(int index)
    {

    	return GetLoadingVehicleStockDetailsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetLoadingVehicleStockDetailsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetLoadingVehicleStockDetailsResult = (ServiceResponseOfListOfLoadingVehicleStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetLoadingVehicleStockDetailsResult = new ServiceResponseOfListOfLoadingVehicleStockDetail();
		GetLoadingVehicleStockDetailsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetLoadingVehicleStockDetailsResponse", this.getClass());
        new ServiceResponseOfListOfLoadingVehicleStockDetail().register(envelope);
    }*/

}