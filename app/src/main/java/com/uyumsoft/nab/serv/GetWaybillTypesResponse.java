package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetWaybillTypesResponse extends BaseObject {

    public ServiceResponseOfListOfNameContainer GetWaybillTypesResult;


    public Object getProperty(int index)
    {

    	return GetWaybillTypesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetWaybillTypesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetWaybillTypesResult = (ServiceResponseOfListOfNameContainer)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetWaybillTypesResult = new ServiceResponseOfListOfNameContainer();
		GetWaybillTypesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetWaybillTypesResponse", this.getClass());
        new ServiceResponseOfListOfNameContainer().register(envelope);
    }*/

}