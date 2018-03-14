package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetShippingCodesResponse extends BaseObject {

    public ServiceResponseOfListOfShippingCode GetShippingCodesResult;


    public Object getProperty(int index)
    {

    	return GetShippingCodesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetShippingCodesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetShippingCodesResult = (ServiceResponseOfListOfShippingCode)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetShippingCodesResult = new ServiceResponseOfListOfShippingCode();
		GetShippingCodesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetShippingCodesResponse", this.getClass());
        new ServiceResponseOfListOfShippingCode().register(envelope);
    }*/

}