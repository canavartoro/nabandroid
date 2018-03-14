package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetFilesResponse extends BaseObject {

    public ServiceResponseOfListOfFile GetFilesResult;


    public Object getProperty(int index)
    {

    	return GetFilesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetFilesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetFilesResult = (ServiceResponseOfListOfFile)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetFilesResult = new ServiceResponseOfListOfFile();
		GetFilesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetFilesResponse", this.getClass());
        new ServiceResponseOfListOfFile().register(envelope);
    }*/

}