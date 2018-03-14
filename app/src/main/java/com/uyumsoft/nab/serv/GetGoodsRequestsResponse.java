package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetGoodsRequestsResponse extends BaseObject {

    public ServiceResponseOfListOfGoodsRequest GetGoodsRequestsResult;


    public Object getProperty(int index)
    {

    	return GetGoodsRequestsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetGoodsRequestsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetGoodsRequestsResult = (ServiceResponseOfListOfGoodsRequest)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetGoodsRequestsResult = new ServiceResponseOfListOfGoodsRequest();
		GetGoodsRequestsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetGoodsRequestsResponse", this.getClass());
        new ServiceResponseOfListOfGoodsRequest().register(envelope);
    }*/

}