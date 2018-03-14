package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class LoginResponse extends BaseObject {

    public ServiceResponseOfUser LoginResult;


    public Object getProperty(int index)
    {

    	return LoginResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "LoginResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	LoginResult = (ServiceResponseOfUser)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		LoginResult = new ServiceResponseOfUser();
		LoginResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "LoginResponse", this.getClass());
        new ServiceResponseOfUser().register(envelope);
    }*/

}