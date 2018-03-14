package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveServiceWarehouseResponse extends BaseObject {

    public ServiceResponseContextBase SaveServiceWarehouseResult;


    public Object getProperty(int index)
    {

    	return SaveServiceWarehouseResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveServiceWarehouseResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveServiceWarehouseResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveServiceWarehouseResult = new ServiceResponseContextBase();
		SaveServiceWarehouseResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveServiceWarehouseResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}