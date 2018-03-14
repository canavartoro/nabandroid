package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetDispatchOrderResponse extends BaseObject {

    public ServiceResponseOfDispatchOrderStockDetail GetDispatchOrderResult;


    public Object getProperty(int index)
    {

    	return GetDispatchOrderResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetDispatchOrderResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetDispatchOrderResult = (ServiceResponseOfDispatchOrderStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetDispatchOrderResult = new ServiceResponseOfDispatchOrderStockDetail();
		GetDispatchOrderResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetDispatchOrderResponse", this.getClass());
        new ServiceResponseOfDispatchOrderStockDetail().register(envelope);
    }*/

}