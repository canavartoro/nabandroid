package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class UserInformation extends BaseObject {

     public Integer UserId = 0;
     public Integer WarehouseId = 0;
     public Integer WorkplaceId = 0;
     public String Username = "";
     public String Password = "";
     public Integer CoId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return UserId; 
           case 1: 
                return WarehouseId; 
           case 2: 
                return WorkplaceId; 
           case 3: 
                return Username; 
           case 4: 
                return Password; 
           case 5: 
                return CoId; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 6;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {

           case 0: 
                info.name = "UserId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 1: 
                info.name = "WarehouseId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 2: 
                info.name = "WorkplaceId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 3: 
                info.name = "Username"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "Password"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "CoId"; 
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
                  UserId = 0;
            else 
	                UserId = Integer.parseInt(value.toString()); 
                  break; 
           case 1: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  WarehouseId = 0;
            else 
	                WarehouseId = Integer.parseInt(value.toString()); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  WorkplaceId = 0;
            else 
	                WorkplaceId = Integer.parseInt(value.toString()); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Username = "";
            else 
	                Username = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Password = "";
            else 
	                Password = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CoId = 0;
            else 
	                CoId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "UserInformation", this.getClass());
        
    }*/

}