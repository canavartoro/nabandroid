package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class ServiceRequestOfLoadingVehicle extends BaseObject {

     public UserInformation LoginInformation = new UserInformation();
     public LoadingVehicle FilterObject = new LoadingVehicle();


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return LoginInformation; 
           case 1: 
                return FilterObject; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 2;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {

           case 0: 
                info.name = "LoginInformation"; 
                info.type = new UserInformation().getClass(); 
                             break; 
           case 1: 
                info.name = "FilterObject"; 
                info.type = new LoadingVehicle().getClass(); 
                             break; 

        default:
            break;
        }
    }

    public void setProperty(int index, Object value)
    {
    	switch (index)
    	{
           case 0: 
           if(value != null){ 
              SoapObject pi = (SoapObject)value; 
              int itemCount = pi.getPropertyCount(); 
              if(itemCount > 0){ 
                  LoginInformation = new UserInformation(); 
                  LoginInformation.loadSoapObject(pi); 
                 } 
              } 
                  break; 
           case 1: 
           if(value != null){ 
              SoapObject pi = (SoapObject)value; 
              int itemCount = pi.getPropertyCount(); 
              if(itemCount > 0){ 
                  FilterObject = new LoadingVehicle(); 
                  FilterObject.loadSoapObject(pi); 
                 } 
              } 
                  break; 

    	}

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		int pr = getPropertyCount();
		PropertyInfo pro = new PropertyInfo();
		for(int i=0;i<pr;i++){
			getPropertyInfo(i, null, pro);
			if(property.hasProperty(pro.name))
				setProperty(i, property.getProperty(pro.name));
		}
	}     

    /*public void register(SoapSerializationEnvelope envelope)
    {
        envelope.addMapping(NAMESPACE, "ServiceRequestOfLoadingVehicle", this.getClass());
                   new UserInformation().register(envelope); 
           new LoadingVehicle().register(envelope); 

    }*/

}