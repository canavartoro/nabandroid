package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetCurrentCardsResponse extends BaseObject {

    public ServiceResponseOfListOfCurrentCard GetCurrentCardsResult;


    public Object getProperty(int index)
    {

    	return GetCurrentCardsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetCurrentCardsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetCurrentCardsResult = (ServiceResponseOfListOfCurrentCard)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetCurrentCardsResult = new ServiceResponseOfListOfCurrentCard();
		GetCurrentCardsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetCurrentCardsResponse", this.getClass());
        new ServiceResponseOfListOfCurrentCard().register(envelope);
    }*/

}