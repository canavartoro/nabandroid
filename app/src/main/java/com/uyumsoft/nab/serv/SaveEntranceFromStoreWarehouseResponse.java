package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveEntranceFromStoreWarehouseResponse extends BaseObject {

    public ServiceResponseContextBase SaveEntranceFromStoreWarehouseResult;


    public Object getProperty(int index)
    {

    	return SaveEntranceFromStoreWarehouseResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveEntranceFromStoreWarehouseResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveEntranceFromStoreWarehouseResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveEntranceFromStoreWarehouseResult = new ServiceResponseContextBase();
		SaveEntranceFromStoreWarehouseResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveEntranceFromStoreWarehouseResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}