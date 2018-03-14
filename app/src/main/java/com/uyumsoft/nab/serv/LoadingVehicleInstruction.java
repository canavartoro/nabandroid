package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class LoadingVehicleInstruction extends BaseObject {

     public Integer Id = 0;
     public String InstructionNo = "";
     public Date InstructionDate = new Date(1900, 1, 1);
     public String VehicleNo = "";
     public String Driver = "";
     public String ShippingType = "";
     public String ShipperInformation = "";


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return InstructionNo; 
           case 2: 
                return InstructionDate; 
           case 3: 
                return VehicleNo; 
           case 4: 
                return Driver; 
           case 5: 
                return ShippingType; 
           case 6: 
                return ShipperInformation; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 7;
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
                info.name = "InstructionNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "InstructionDate"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 3: 
                info.name = "VehicleNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "Driver"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "ShippingType"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 6: 
                info.name = "ShipperInformation"; 
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
                  InstructionNo = "";
            else 
	                InstructionNo = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  InstructionDate = new Date(1900, 1, 1);
            else 
	                InstructionDate = DateUtil.getDate(value.toString()); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  VehicleNo = "";
            else 
	                VehicleNo = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Driver = "";
            else 
	                Driver = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ShippingType = "";
            else 
	                ShippingType = value.toString(); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ShipperInformation = "";
            else 
	                ShipperInformation = value.toString(); 
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
        envelope.addMapping(NAMESPACE, "LoadingVehicleInstruction", this.getClass());
        
    }*/

}