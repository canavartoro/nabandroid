package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class ForeignPurchaseStockDetail extends BaseObject {

     public String StockCode = "";
     public BigDecimal Amount = new BigDecimal(0);
     public Boolean IsserialTrack = false;
     public ArrayOfTrmSerialInfo SerialInfos = new ArrayOfTrmSerialInfo();  //array
     public String StockName = "";
     public String Unity = "";
     public BigDecimal LoadingAmount = new BigDecimal(0);
     public BigDecimal RemainingAmount = new BigDecimal(0);
     public String Property1 = "";
     public Boolean HasProperty = false;
     public Integer StockId = 0;
     public Integer UnitId = 0;
     public Integer PropertyId1 = 0;
     public BigDecimal ReadAmount = new BigDecimal(0);


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return StockCode; 
           case 1: 
                return Amount; 
           case 2: 
                return IsserialTrack; 
           case 3: 
                return SerialInfos; 
           case 4: 
                return StockName; 
           case 5: 
                return Unity; 
           case 6: 
                return LoadingAmount; 
           case 7: 
                return RemainingAmount; 
           case 8: 
                return Property1; 
           case 9: 
                return HasProperty; 
           case 10: 
                return StockId; 
           case 11: 
                return UnitId; 
           case 12: 
                return PropertyId1; 
           case 13: 
                return ReadAmount; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 14;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {

           case 0: 
                info.name = "StockCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 1: 
                info.name = "Amount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 2: 
                info.name = "IsserialTrack"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 3: 
                info.name = "SerialInfos"; 
                info.type = new ArrayOfTrmSerialInfo().getClass(); 
                             break; 
           case 4: 
                info.name = "StockName"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "Unity"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 6: 
                info.name = "LoadingAmount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 7: 
                info.name = "RemainingAmount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 8: 
                info.name = "Property1"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 9: 
                info.name = "HasProperty"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 10: 
                info.name = "StockId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 11: 
                info.name = "UnitId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 12: 
                info.name = "PropertyId1"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 13: 
                info.name = "ReadAmount"; 
                info.type = BigDecimal.class.getClass(); 
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
                  StockCode = "";
            else 
	                StockCode = value.toString(); 
                  break; 
           case 1: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Amount = new BigDecimal(0);
            else 
	                Amount = new BigDecimal(value.toString()); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  IsserialTrack = false;
            else 
	                IsserialTrack = Boolean.getBoolean(value.toString()); 
                  break; 
           case 3: 
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
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockName = "";
            else 
	                StockName = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Unity = "";
            else 
	                Unity = value.toString(); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  LoadingAmount = new BigDecimal(0);
            else 
	                LoadingAmount = new BigDecimal(value.toString()); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  RemainingAmount = new BigDecimal(0);
            else 
	                RemainingAmount = new BigDecimal(value.toString()); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Property1 = "";
            else 
	                Property1 = value.toString(); 
                  break; 
           case 9: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  HasProperty = false;
            else 
	                HasProperty = Boolean.getBoolean(value.toString()); 
                  break; 
           case 10: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockId = 0;
            else 
	                StockId = Integer.parseInt(value.toString()); 
                  break; 
           case 11: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  UnitId = 0;
            else 
	                UnitId = Integer.parseInt(value.toString()); 
                  break; 
           case 12: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  PropertyId1 = 0;
            else 
	                PropertyId1 = Integer.parseInt(value.toString()); 
                  break; 
           case 13: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ReadAmount = new BigDecimal(0);
            else 
	                ReadAmount = new BigDecimal(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "ForeignPurchaseStockDetail", this.getClass());
                   new ArrayOfTrmSerialInfo().register(envelope); 

    }*/

}