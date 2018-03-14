package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetForeignPurchaseStockDetailResponse extends BaseObject {

    public ServiceResponseOfForeignPurchaseStockDetail GetForeignPurchaseStockDetailResult;


    public Object getProperty(int index)
    {

    	return GetForeignPurchaseStockDetailResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetForeignPurchaseStockDetailResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetForeignPurchaseStockDetailResult = (ServiceResponseOfForeignPurchaseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetForeignPurchaseStockDetailResult = new ServiceResponseOfForeignPurchaseStockDetail();
		GetForeignPurchaseStockDetailResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetForeignPurchaseStockDetailResponse", this.getClass());
        new ServiceResponseOfForeignPurchaseStockDetail().register(envelope);
    }*/

}