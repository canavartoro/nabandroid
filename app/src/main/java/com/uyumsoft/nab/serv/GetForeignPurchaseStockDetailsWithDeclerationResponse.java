package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetForeignPurchaseStockDetailsWithDeclerationResponse extends BaseObject {

    public ServiceResponseOfListOfForeignPurchaseStockDetail GetForeignPurchaseStockDetailsWithDeclerationResult;


    public Object getProperty(int index)
    {

    	return GetForeignPurchaseStockDetailsWithDeclerationResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetForeignPurchaseStockDetailsWithDeclerationResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetForeignPurchaseStockDetailsWithDeclerationResult = (ServiceResponseOfListOfForeignPurchaseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetForeignPurchaseStockDetailsWithDeclerationResult = new ServiceResponseOfListOfForeignPurchaseStockDetail();
		GetForeignPurchaseStockDetailsWithDeclerationResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetForeignPurchaseStockDetailsWithDeclerationResponse", this.getClass());
        new ServiceResponseOfListOfForeignPurchaseStockDetail().register(envelope);
    }*/

}