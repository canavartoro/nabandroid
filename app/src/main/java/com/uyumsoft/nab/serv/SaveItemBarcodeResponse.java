package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveItemBarcodeResponse extends BaseObject {

    public ServiceResponseContextBase SaveItemBarcodeResult;


    public Object getProperty(int index)
    {

    	return SaveItemBarcodeResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveItemBarcodeResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveItemBarcodeResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveItemBarcodeResult = new ServiceResponseContextBase();
		SaveItemBarcodeResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveItemBarcodeResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}