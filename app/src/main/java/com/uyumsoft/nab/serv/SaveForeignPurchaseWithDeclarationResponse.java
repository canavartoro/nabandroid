package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SaveForeignPurchaseWithDeclarationResponse extends BaseObject {

    public ServiceResponseContextBase SaveForeignPurchaseWithDeclarationResult;


    public Object getProperty(int index)
    {

    	return SaveForeignPurchaseWithDeclarationResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SaveForeignPurchaseWithDeclarationResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	SaveForeignPurchaseWithDeclarationResult = (ServiceResponseContextBase)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		SaveForeignPurchaseWithDeclarationResult = new ServiceResponseContextBase();
		SaveForeignPurchaseWithDeclarationResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "SaveForeignPurchaseWithDeclarationResponse", this.getClass());
        new ServiceResponseContextBase().register(envelope);
    }*/

}