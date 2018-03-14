package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveForeignPurchaseResponse extends BaseObject {

    public ServiceResponseContextBase SaveForeignPurchaseResult;


    public Object getProperty(int index)
    {

    	return SaveForeignPurchaseResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveForeignPurchaseResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveForeignPurchaseResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveForeignPurchaseResult = new ServiceResponseContextBase();
		SaveForeignPurchaseResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveForeignPurchaseResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}