package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveGoodsRequestDispatchResponse extends BaseObject {

    public ServiceResponseContextBase SaveGoodsRequestDispatchResult;


    public Object getProperty(int index)
    {

    	return SaveGoodsRequestDispatchResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveGoodsRequestDispatchResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveGoodsRequestDispatchResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveGoodsRequestDispatchResult = new ServiceResponseContextBase();
		SaveGoodsRequestDispatchResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveGoodsRequestDispatchResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}