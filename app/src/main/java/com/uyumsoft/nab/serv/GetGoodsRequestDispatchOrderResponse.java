package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetGoodsRequestDispatchOrderResponse extends BaseObject {

    public ServiceResponseOfGoodsRequestDispatchStockDetail GetGoodsRequestDispatchOrderResult;


    public Object getProperty(int index)
    {

    	return GetGoodsRequestDispatchOrderResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetGoodsRequestDispatchOrderResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetGoodsRequestDispatchOrderResult = (ServiceResponseOfGoodsRequestDispatchStockDetail)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetGoodsRequestDispatchOrderResult = new ServiceResponseOfGoodsRequestDispatchStockDetail();
		GetGoodsRequestDispatchOrderResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetGoodsRequestDispatchOrderResponse", this.getClass());
        new ServiceResponseOfGoodsRequestDispatchStockDetail().register(envelope);
    }*/

}