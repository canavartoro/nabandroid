package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetItemsResponse extends BaseObject {

    public ServiceResponseOfListOfItem GetItemsResult;


    public Object getProperty(int index)
    {

    	return GetItemsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetItemsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetItemsResult = (ServiceResponseOfListOfItem)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetItemsResult = new ServiceResponseOfListOfItem();
		GetItemsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetItemsResponse", this.getClass());
        new ServiceResponseOfListOfItem().register(envelope);
    }*/

}