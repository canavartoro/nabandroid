package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetEntranceStockActionTypesResponse extends BaseObject {

    public ServiceResponseOfListOfNameContainer GetEntranceStockActionTypesResult;


    public Object getProperty(int index)
    {

    	return GetEntranceStockActionTypesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetEntranceStockActionTypesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetEntranceStockActionTypesResult = (ServiceResponseOfListOfNameContainer)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetEntranceStockActionTypesResult = new ServiceResponseOfListOfNameContainer();
		GetEntranceStockActionTypesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetEntranceStockActionTypesResponse", this.getClass());
        new ServiceResponseOfListOfNameContainer().register(envelope);
    }*/

}