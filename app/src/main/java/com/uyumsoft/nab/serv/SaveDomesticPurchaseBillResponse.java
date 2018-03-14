package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveDomesticPurchaseBillResponse extends BaseObject {

    public ServiceResponseContextBase SaveDomesticPurchaseBillResult;


    public Object getProperty(int index)
    {

    	return SaveDomesticPurchaseBillResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveDomesticPurchaseBillResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveDomesticPurchaseBillResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveDomesticPurchaseBillResult = new ServiceResponseContextBase();
		SaveDomesticPurchaseBillResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveDomesticPurchaseBillResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}