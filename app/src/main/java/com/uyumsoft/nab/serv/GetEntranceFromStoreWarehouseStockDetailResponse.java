package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetEntranceFromStoreWarehouseStockDetailResponse extends BaseObject {

    public ServiceResponseOfEntranceFromStoreWarehouseStockDetail GetEntranceFromStoreWarehouseStockDetailResult;


    public Object getProperty(int index)
    {

    	return GetEntranceFromStoreWarehouseStockDetailResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetEntranceFromStoreWarehouseStockDetailResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetEntranceFromStoreWarehouseStockDetailResult = (ServiceResponseOfEntranceFromStoreWarehouseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetEntranceFromStoreWarehouseStockDetailResult = new ServiceResponseOfEntranceFromStoreWarehouseStockDetail();
		GetEntranceFromStoreWarehouseStockDetailResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetEntranceFromStoreWarehouseStockDetailResponse", this.getClass());
        new ServiceResponseOfEntranceFromStoreWarehouseStockDetail().register(envelope);
    }*/

}