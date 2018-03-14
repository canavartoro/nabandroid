package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveDispatchOrderWithWaybillResponse extends BaseObject {

    public ServiceResponseContextBase SaveDispatchOrderWithWaybillResult;


    public Object getProperty(int index)
    {

    	return SaveDispatchOrderWithWaybillResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveDispatchOrderWithWaybillResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveDispatchOrderWithWaybillResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveDispatchOrderWithWaybillResult = new ServiceResponseContextBase();
		SaveDispatchOrderWithWaybillResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveDispatchOrderWithWaybillResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}