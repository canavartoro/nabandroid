package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetGoodsRequestDispatchOrdersResponse extends BaseObject {

    public ServiceResponseOfListOfGoodsRequestDispatchStockDetail GetGoodsRequestDispatchOrdersResult;


    public Object getProperty(int index)
    {

    	return GetGoodsRequestDispatchOrdersResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetGoodsRequestDispatchOrdersResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetGoodsRequestDispatchOrdersResult = (ServiceResponseOfListOfGoodsRequestDispatchStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetGoodsRequestDispatchOrdersResult = new ServiceResponseOfListOfGoodsRequestDispatchStockDetail();
		GetGoodsRequestDispatchOrdersResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetGoodsRequestDispatchOrdersResponse", this.getClass());
        new ServiceResponseOfListOfGoodsRequestDispatchStockDetail().register(envelope);
    }*/

}