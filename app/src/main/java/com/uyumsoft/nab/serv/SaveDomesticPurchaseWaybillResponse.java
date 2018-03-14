package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveDomesticPurchaseWaybillResponse extends BaseObject {

    public ServiceResponseContextBase SaveDomesticPurchaseWaybillResult;


    public Object getProperty(int index)
    {

    	return SaveDomesticPurchaseWaybillResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveDomesticPurchaseWaybillResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveDomesticPurchaseWaybillResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveDomesticPurchaseWaybillResult = new ServiceResponseContextBase();
		SaveDomesticPurchaseWaybillResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveDomesticPurchaseWaybillResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}