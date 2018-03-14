package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetOrdersResponse extends BaseObject {

    public ServiceResponseOfListOfOrder GetOrdersResult;


    public Object getProperty(int index)
    {

    	return GetOrdersResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetOrdersResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetOrdersResult = (ServiceResponseOfListOfOrder)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetOrdersResult = new ServiceResponseOfListOfOrder();
		GetOrdersResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetOrdersResponse", this.getClass());
        new ServiceResponseOfListOfOrder().register(envelope);
    }*/

}