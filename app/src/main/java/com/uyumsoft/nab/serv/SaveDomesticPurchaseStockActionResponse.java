package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveDomesticPurchaseStockActionResponse extends BaseObject {

    public ServiceResponseContextBase SaveDomesticPurchaseStockActionResult;


    public Object getProperty(int index)
    {

    	return SaveDomesticPurchaseStockActionResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveDomesticPurchaseStockActionResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveDomesticPurchaseStockActionResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveDomesticPurchaseStockActionResult = new ServiceResponseContextBase();
		SaveDomesticPurchaseStockActionResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveDomesticPurchaseStockActionResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}