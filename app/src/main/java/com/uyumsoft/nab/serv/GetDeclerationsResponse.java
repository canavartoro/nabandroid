package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetDeclerationsResponse extends BaseObject {

    public ServiceResponseOfListOfDecleration GetDeclerationsResult;


    public Object getProperty(int index)
    {

    	return GetDeclerationsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetDeclerationsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetDeclerationsResult = (ServiceResponseOfListOfDecleration)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetDeclerationsResult = new ServiceResponseOfListOfDecleration();
		GetDeclerationsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetDeclerationsResponse", this.getClass());
        new ServiceResponseOfListOfDecleration().register(envelope);
    }*/

}