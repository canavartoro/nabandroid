package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveLoadingVehicleResponse extends BaseObject {

    public ServiceResponseContextBase SaveLoadingVehicleResult;


    public Object getProperty(int index)
    {

    	return SaveLoadingVehicleResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveLoadingVehicleResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveLoadingVehicleResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveLoadingVehicleResult = new ServiceResponseContextBase();
		SaveLoadingVehicleResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveLoadingVehicleResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}