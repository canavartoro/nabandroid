package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetEntranceFromStoreWarehouseStockDetailsResponse extends BaseObject {

    public ServiceResponseOfListOfEntranceFromStoreWarehouseStockDetail GetEntranceFromStoreWarehouseStockDetailsResult;


    public Object getProperty(int index)
    {

    	return GetEntranceFromStoreWarehouseStockDetailsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetEntranceFromStoreWarehouseStockDetailsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetEntranceFromStoreWarehouseStockDetailsResult = (ServiceResponseOfListOfEntranceFromStoreWarehouseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetEntranceFromStoreWarehouseStockDetailsResult = new ServiceResponseOfListOfEntranceFromStoreWarehouseStockDetail();
		GetEntranceFromStoreWarehouseStockDetailsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetEntranceFromStoreWarehouseStockDetailsResponse", this.getClass());
        new ServiceResponseOfListOfEntranceFromStoreWarehouseStockDetail().register(envelope);
    }*/

}