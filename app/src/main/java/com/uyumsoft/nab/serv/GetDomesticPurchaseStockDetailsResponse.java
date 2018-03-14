package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetDomesticPurchaseStockDetailsResponse extends BaseObject {

    public ServiceResponseOfListOfDomesticPurchaseStockDetail GetDomesticPurchaseStockDetailsResult;


    public Object getProperty(int index)
    {

    	return GetDomesticPurchaseStockDetailsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetDomesticPurchaseStockDetailsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetDomesticPurchaseStockDetailsResult = (ServiceResponseOfListOfDomesticPurchaseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetDomesticPurchaseStockDetailsResult = new ServiceResponseOfListOfDomesticPurchaseStockDetail();
		GetDomesticPurchaseStockDetailsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetDomesticPurchaseStockDetailsResponse", this.getClass());
        new ServiceResponseOfListOfDomesticPurchaseStockDetail().register(envelope);
    }*/

}