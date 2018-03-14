package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetRequestGoodsResponse extends BaseObject {

    public ServiceResponseOfListOfRequestedGoods GetRequestGoodsResult;


    public Object getProperty(int index)
    {

    	return GetRequestGoodsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetRequestGoodsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetRequestGoodsResult = (ServiceResponseOfListOfRequestedGoods)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetRequestGoodsResult = new ServiceResponseOfListOfRequestedGoods();
		GetRequestGoodsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetRequestGoodsResponse", this.getClass());
        new ServiceResponseOfListOfRequestedGoods().register(envelope);
    }*/

}