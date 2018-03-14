package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class ServiceResponseOfListOfActionCode extends BaseObject {

     public ArrayOfString Errors = new ArrayOfString();  //array
     public ArrayOfActionCode Item = new ArrayOfActionCode();  //array


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Errors; 
           case 1: 
                return Item; 

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
                info.name = "Errors"; 
                info.type = new ArrayOfString().getClass(); 
                             break; 
           case 1: 
                info.name = "Item"; 
                info.type = new ArrayOfActionCode().getClass(); 
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
                  Errors = new ArrayOfString(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      String item = new String(); 
                      item = pi.getProperty(0).toString();
                  Errors.add(item); 
                   } 
                  	  if(prp.getProperty(loop) instanceof SoapPrimitive){ 
                  	  SoapPrimitive pi = (SoapPrimitive)prp.getProperty(loop); 
                  	  String item = pi.toString(); 
                   	  Errors.add((String)item); 
                    } 
                   } 
                  } 
                  break; 
           case 1: 
              if(value != null){ 
                  Item = new ArrayOfActionCode(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      ActionCode item = new ActionCode(); 
                      item.loadSoapObject(pi);;
                  Item.add(item); 
                   } 
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
        envelope.addMapping(NAMESPACE, "ServiceResponseOfListOfActionCode", this.getClass());
                   new ArrayOfString().register(envelope); 
           new ArrayOfActionCode().register(envelope); 

    }*/

}