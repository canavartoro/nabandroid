package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class Item extends BaseObject {

     public Integer Id = 0;
     public String Barcode = "";
     public Integer BarcodeID = 0;
     public String Name = "";
     public String OldBarcode = "";
     public String Unit = "";
     public Integer UnitId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return Barcode; 
           case 2: 
                return BarcodeID; 
           case 3: 
                return Name; 
           case 4: 
                return OldBarcode; 
           case 5: 
                return Unit; 
           case 6: 
                return UnitId; 

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
                info.name = "Barcode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "BarcodeID"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 3: 
                info.name = "Name"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "OldBarcode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "Unit"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 6: 
                info.name = "UnitId"; 
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
                  Barcode = "";
            else 
	                Barcode = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  BarcodeID = 0;
            else 
	                BarcodeID = Integer.parseInt(value.toString()); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Name = "";
            else 
	                Name = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  OldBarcode = "";
            else 
	                OldBarcode = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Unit = "";
            else 
	                Unit = value.toString(); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  UnitId = 0;
            else 
	                UnitId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "Item", this.getClass());
        
    }*/

}