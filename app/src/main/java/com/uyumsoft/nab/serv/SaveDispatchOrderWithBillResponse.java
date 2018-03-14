package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveDispatchOrderWithBillResponse extends BaseObject {

    public ServiceResponseContextBase SaveDispatchOrderWithBillResult;


    public Object getProperty(int index)
    {

    	return SaveDispatchOrderWithBillResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveDispatchOrderWithBillResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveDispatchOrderWithBillResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveDispatchOrderWithBillResult = new ServiceResponseContextBase();
		SaveDispatchOrderWithBillResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveDispatchOrderWithBillResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}