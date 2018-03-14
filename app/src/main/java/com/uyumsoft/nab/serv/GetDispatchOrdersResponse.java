package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetDispatchOrdersResponse extends BaseObject {

    public ServiceResponseOfListOfDispatchOrderStockDetail GetDispatchOrdersResult;


    public Object getProperty(int index)
    {

    	return GetDispatchOrdersResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetDispatchOrdersResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetDispatchOrdersResult = (ServiceResponseOfListOfDispatchOrderStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetDispatchOrdersResult = new ServiceResponseOfListOfDispatchOrderStockDetail();
		GetDispatchOrdersResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetDispatchOrdersResponse", this.getClass());
        new ServiceResponseOfListOfDispatchOrderStockDetail().register(envelope);
    }*/

}