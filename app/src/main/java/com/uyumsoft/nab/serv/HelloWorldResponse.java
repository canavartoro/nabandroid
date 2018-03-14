package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class HelloWorldResponse extends BaseObject {

    public String HelloWorldResult;


    public Object getProperty(int index)
    {

    	return HelloWorldResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "HelloWorldResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	HelloWorldResult = value.toString();

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		
		
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "HelloWorldResponse", this.getClass());
        
    }*/

}