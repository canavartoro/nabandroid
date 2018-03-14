package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class TrmSerialInfo extends BaseObject {

     public Integer Id = 0;
     public String SerialNo = "";
     public String SerialNo2 = "";
     public String SerialNo3 = "";
     public String SerialNo4 = "";
     public String SerialNumarator = "";
     public String Prefix = "";
     public String Suffix = "";
     public Integer SerialQty = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return SerialNo; 
           case 2: 
                return SerialNo2; 
           case 3: 
                return SerialNo3; 
           case 4: 
                return SerialNo4; 
           case 5: 
                return SerialNumarator; 
           case 6: 
                return Prefix; 
           case 7: 
                return Suffix; 
           case 8: 
                return SerialQty; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 9;
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
                info.name = "SerialNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "SerialNo2"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "SerialNo3"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "SerialNo4"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "SerialNumarator"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 6: 
                info.name = "Prefix"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 7: 
                info.name = "Suffix"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 8: 
                info.name = "SerialQty"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
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
                  SerialNo = "";
            else 
	                SerialNo = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  SerialNo2 = "";
            else 
	                SerialNo2 = value.toString(); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  SerialNo3 = "";
            else 
	                SerialNo3 = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  SerialNo4 = "";
            else 
	                SerialNo4 = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  SerialNumarator = "";
            else 
	                SerialNumarator = value.toString(); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Prefix = "";
            else 
	                Prefix = value.toString(); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Suffix = "";
            else 
	                Suffix = value.toString(); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  SerialQty = 0;
            else 
	                SerialQty = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "TrmSerialInfo", this.getClass());
        
    }*/

}