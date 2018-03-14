package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetShippingTypesResponse extends BaseObject {

    public ServiceResponseOfListOfNameContainer GetShippingTypesResult;


    public Object getProperty(int index)
    {

    	return GetShippingTypesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetShippingTypesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetShippingTypesResult = (ServiceResponseOfListOfNameContainer)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetShippingTypesResult = new ServiceResponseOfListOfNameContainer();
		GetShippingTypesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetShippingTypesResponse", this.getClass());
        new ServiceResponseOfListOfNameContainer().register(envelope);
    }*/

}