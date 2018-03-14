package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class Barcode extends BaseObject {

     public Integer Id = 0;
     public String StockBarcode = "";
     public BigDecimal Amount = new BigDecimal(0);
     public Boolean IsIncreased = false;
     public Boolean IsDeleted = false;
     public String PropertyBarcode = "";


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return StockBarcode; 
           case 2: 
                return Amount; 
           case 3: 
                return IsIncreased; 
           case 4: 
                return IsDeleted; 
           case 5: 
                return PropertyBarcode; 

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
                info.name = "Id"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 1: 
                info.name = "StockBarcode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "Amount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 3: 
                info.name = "IsIncreased"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 4: 
                info.name = "IsDeleted"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 5: 
                info.name = "PropertyBarcode"; 
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
                  StockBarcode = "";
            else 
	                StockBarcode = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Amount = new BigDecimal(0);
            else 
	                Amount = new BigDecimal(value.toString()); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  IsIncreased = false;
            else 
	                IsIncreased = Boolean.getBoolean(value.toString()); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  IsDeleted = false;
            else 
	                IsDeleted = Boolean.getBoolean(value.toString()); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  PropertyBarcode = "";
            else 
	                PropertyBarcode = value.toString(); 
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
        envelope.addMapping(NAMESPACE, "Barcode", this.getClass());
        
    }*/

}