package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetDispatchOrderNoResponse extends BaseObject {

    public ServiceResponseOfListOfDispatchOrder GetDispatchOrderNoResult;


    public Object getProperty(int index)
    {

    	return GetDispatchOrderNoResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetDispatchOrderNoResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetDispatchOrderNoResult = (ServiceResponseOfListOfDispatchOrder)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetDispatchOrderNoResult = new ServiceResponseOfListOfDispatchOrder();
		GetDispatchOrderNoResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetDispatchOrderNoResponse", this.getClass());
        new ServiceResponseOfListOfDispatchOrder().register(envelope);
    }*/

}