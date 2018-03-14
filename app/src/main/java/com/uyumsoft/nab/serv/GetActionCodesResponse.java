package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetActionCodesResponse extends BaseObject {

    public ServiceResponseOfListOfActionCode GetActionCodesResult;


    public Object getProperty(int index)
    {

    	return GetActionCodesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetActionCodesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetActionCodesResult = (ServiceResponseOfListOfActionCode)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetActionCodesResult = new ServiceResponseOfListOfActionCode();
		GetActionCodesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetActionCodesResponse", this.getClass());
        new ServiceResponseOfListOfActionCode().register(envelope);
    }*/

}