package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetLoadingVehicleStockDetailResponse extends BaseObject {

    public ServiceResponseOfLoadingVehicleStockDetail GetLoadingVehicleStockDetailResult;


    public Object getProperty(int index)
    {

    	return GetLoadingVehicleStockDetailResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetLoadingVehicleStockDetailResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetLoadingVehicleStockDetailResult = (ServiceResponseOfLoadingVehicleStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetLoadingVehicleStockDetailResult = new ServiceResponseOfLoadingVehicleStockDetail();
		GetLoadingVehicleStockDetailResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetLoadingVehicleStockDetailResponse", this.getClass());
        new ServiceResponseOfLoadingVehicleStockDetail().register(envelope);
    }*/

}