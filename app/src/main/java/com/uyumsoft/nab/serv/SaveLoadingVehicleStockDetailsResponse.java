package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveLoadingVehicleStockDetailsResponse extends BaseObject {

    public ServiceResponseContextBase SaveLoadingVehicleStockDetailsResult;


    public Object getProperty(int index)
    {

    	return SaveLoadingVehicleStockDetailsResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveLoadingVehicleStockDetailsResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveLoadingVehicleStockDetailsResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveLoadingVehicleStockDetailsResult = new ServiceResponseContextBase();
		SaveLoadingVehicleStockDetailsResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveLoadingVehicleStockDetailsResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}