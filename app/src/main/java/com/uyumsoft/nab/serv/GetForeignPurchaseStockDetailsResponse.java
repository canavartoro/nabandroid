package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetForeignPurchaseStockDetailsResponse extends BaseObject {

    public ServiceResponseOfListOfForeignPurchaseStockDetail GetForeignPurchaseStockDetailsResult;


    public Object getProperty(int index)
    {

    	return GetForeignPurchaseStockDetailsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetForeignPurchaseStockDetailsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetForeignPurchaseStockDetailsResult = (ServiceResponseOfListOfForeignPurchaseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetForeignPurchaseStockDetailsResult = new ServiceResponseOfListOfForeignPurchaseStockDetail();
		GetForeignPurchaseStockDetailsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetForeignPurchaseStockDetailsResponse", this.getClass());
        new ServiceResponseOfListOfForeignPurchaseStockDetail().register(envelope);
    }*/

}