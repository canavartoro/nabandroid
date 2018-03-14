package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetStockActionTypesResponse extends BaseObject {

    public ServiceResponseOfListOfNameContainer GetStockActionTypesResult;


    public Object getProperty(int index)
    {

    	return GetStockActionTypesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetStockActionTypesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetStockActionTypesResult = (ServiceResponseOfListOfNameContainer)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetStockActionTypesResult = new ServiceResponseOfListOfNameContainer();
		GetStockActionTypesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetStockActionTypesResponse", this.getClass());
        new ServiceResponseOfListOfNameContainer().register(envelope);
    }*/

}