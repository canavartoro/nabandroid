package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class ActionCode extends BaseObject {

     public Integer Id = 0;
     public String Name = "";
     public String Code = "";
     public String ActionType = "Transfer"; //Enum StockActionType


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return Name; 
           case 2: 
                return Code; 
           case 3: 
                return ActionType; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 4;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {

           case 0: 
                info.name = "Id"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 1: 
                info.name = "Name"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "Code"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "ActionType"; 
                info.type = PropertyInfo.STRING_CLASS; 
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
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Id = 0;
            else 
	                Id = Integer.parseInt(value.toString()); 
                  break; 
           case 1: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Name = "";
            else 
	                Name = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Code = "";
            else 
	                Code = value.toString(); 
                  break; 
           case 3: 
                ActionType = value.toString(); 
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
        envelope.addMapping(NAMESPACE, "ActionCode", this.getClass());
        
    }*/

}