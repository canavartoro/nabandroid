package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetDomesticPurchaseStockDetailResponse extends BaseObject {

    public ServiceResponseOfDomesticPurchaseStockDetail GetDomesticPurchaseStockDetailResult;


    public Object getProperty(int index)
    {

    	return GetDomesticPurchaseStockDetailResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetDomesticPurchaseStockDetailResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetDomesticPurchaseStockDetailResult = (ServiceResponseOfDomesticPurchaseStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetDomesticPurchaseStockDetailResult = new ServiceResponseOfDomesticPurchaseStockDetail();
		GetDomesticPurchaseStockDetailResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetDomesticPurchaseStockDetailResponse", this.getClass());
        new ServiceResponseOfDomesticPurchaseStockDetail().register(envelope);
    }*/

}