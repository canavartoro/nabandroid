package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class StockDetail extends BaseObject {

     public Integer Id = 0;
     public String StockCode = "";
     public BigDecimal Amount = new BigDecimal(0);
     public Boolean IsserialTrack = false;
     public ArrayOfTrmSerialInfo SerialInfos = new ArrayOfTrmSerialInfo();  //array


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return StockCode; 
           case 2: 
                return Amount; 
           case 3: 
                return IsserialTrack; 
           case 4: 
                return SerialInfos; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 5;
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
                info.name = "StockCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "Amount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 3: 
                info.name = "IsserialTrack"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 4: 
                info.name = "SerialInfos"; 
                info.type = new ArrayOfTrmSerialInfo().getClass(); 
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
                  StockCode = "";
            else 
	                StockCode = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Amount = new BigDecimal(0);
            else 
	                Amount = new BigDecimal(value.toString()); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  IsserialTrack = false;
            else 
	                IsserialTrack = Boolean.getBoolean(value.toString()); 
                  break; 
           case 4: 
              if(value != null){ 
                  SerialInfos = new ArrayOfTrmSerialInfo(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      TrmSerialInfo item = new TrmSerialInfo(); 
                      item.loadSoapObject(pi);;
                  SerialInfos.add(item); 
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
        envelope.addMapping(NAMESPACE, "StockDetail", this.getClass());
                   new ArrayOfTrmSerialInfo().register(envelope); 

    }*/

}