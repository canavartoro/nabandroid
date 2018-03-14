package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetServiceWarehouseStockDetailResponse extends BaseObject {

    public ServiceResponseOfServiceWarehouseStockDetail GetServiceWarehouseStockDetailResult;


    public Object getProperty(int index)
    {

    	return GetServiceWarehouseStockDetailResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetServiceWarehouseStockDetailResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetServiceWarehouseStockDetailResult = (ServiceResponseOfServiceWarehouseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetServiceWarehouseStockDetailResult = new ServiceResponseOfServiceWarehouseStockDetail();
		GetServiceWarehouseStockDetailResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetServiceWarehouseStockDetailResponse", this.getClass());
        new ServiceResponseOfServiceWarehouseStockDetail().register(envelope);
    }*/

}