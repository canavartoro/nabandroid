package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class LoadingVehicleStockDetail extends BaseObject {

     public Integer Id = 0;
     public String OrderNo = "";
     public String DispatchOrderNo = "";
     public String StockCode = "";
     public String StockName = "";
     public BigDecimal Amount = new BigDecimal(0);
     public String Property1 = "";
     public String CurrentCode = "";
     public String CurrentName = "";
     public String DispatchAddress = "";
     public String DispatchCity = "";
     public String DispatchTown = "";
     public Boolean HasProperty = false;
     public Integer OrderId = 0;
     public Integer DispatchOrderId = 0;
     public Integer StockId = 0;
     public BigDecimal ReadAmount = new BigDecimal(0);
     public Integer PropertyId1 = 0;
     public Integer CurrentId = 0;
     public Integer AddressId = 0;
     public Integer CityId = 0;
     public Integer TownId = 0;
     public Integer DeliveredAmount = 0;
     public Boolean Increased = false;
     public ArrayOfLoadingVehicleSerial LoadingVehicleSerials = new ArrayOfLoadingVehicleSerial();  //array


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return OrderNo; 
           case 2: 
                return DispatchOrderNo; 
           case 3: 
                return StockCode; 
           case 4: 
                return StockName; 
           case 5: 
                return Amount; 
           case 6: 
                return Property1; 
           case 7: 
                return CurrentCode; 
           case 8: 
                return CurrentName; 
           case 9: 
                return DispatchAddress; 
           case 10: 
                return DispatchCity; 
           case 11: 
                return DispatchTown; 
           case 12: 
                return HasProperty; 
           case 13: 
                return OrderId; 
           case 14: 
                return DispatchOrderId; 
           case 15: 
                return StockId; 
           case 16: 
                return ReadAmount; 
           case 17: 
                return PropertyId1; 
           case 18: 
                return CurrentId; 
           case 19: 
                return AddressId; 
           case 20: 
                return CityId; 
           case 21: 
                return TownId; 
           case 22: 
                return DeliveredAmount; 
           case 23: 
                return Increased; 
           case 24: 
                return LoadingVehicleSerials; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 25;
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
                info.name = "OrderNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "DispatchOrderNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "StockCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "StockName"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "Amount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 6: 
                info.name = "Property1"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 7: 
                info.name = "CurrentCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 8: 
                info.name = "CurrentName"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 9: 
                info.name = "DispatchAddress"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 10: 
                info.name = "DispatchCity"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 11: 
                info.name = "DispatchTown"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 12: 
                info.name = "HasProperty"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 13: 
                info.name = "OrderId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 14: 
                info.name = "DispatchOrderId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 15: 
                info.name = "StockId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 16: 
                info.name = "ReadAmount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 17: 
                info.name = "PropertyId1"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 18: 
                info.name = "CurrentId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 19: 
                info.name = "AddressId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 20: 
                info.name = "CityId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 21: 
                info.name = "TownId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 22: 
                info.name = "DeliveredAmount"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 23: 
                info.name = "Increased"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 24: 
                info.name = "LoadingVehicleSerials"; 
                info.type = new ArrayOfLoadingVehicleSerial().getClass(); 
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
                  OrderNo = "";
            else 
	                OrderNo = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchOrderNo = "";
            else 
	                DispatchOrderNo = value.toString(); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockCode = "";
            else 
	                StockCode = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockName = "";
            else 
	                StockName = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Amount = new BigDecimal(0);
            else 
	                Amount = new BigDecimal(value.toString()); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Property1 = "";
            else 
	                Property1 = value.toString(); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentCode = "";
            else 
	                CurrentCode = value.toString(); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentName = "";
            else 
	                CurrentName = value.toString(); 
                  break; 
           case 9: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchAddress = "";
            else 
	                DispatchAddress = value.toString(); 
                  break; 
           case 10: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchCity = "";
            else 
	                DispatchCity = value.toString(); 
                  break; 
           case 11: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchTown = "";
            else 
	                DispatchTown = value.toString(); 
                  break; 
           case 12: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  HasProperty = false;
            else 
	                HasProperty = Boolean.getBoolean(value.toString()); 
                  break; 
           case 13: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  OrderId = 0;
            else 
	                OrderId = Integer.parseInt(value.toString()); 
                  break; 
           case 14: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchOrderId = 0;
            else 
	                DispatchOrderId = Integer.parseInt(value.toString()); 
                  break; 
           case 15: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockId = 0;
            else 
	                StockId = Integer.parseInt(value.toString()); 
                  break; 
           case 16: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ReadAmount = new BigDecimal(0);
            else 
	                ReadAmount = new BigDecimal(value.toString()); 
                  break; 
           case 17: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  PropertyId1 = 0;
            else 
	                PropertyId1 = Integer.parseInt(value.toString()); 
                  break; 
           case 18: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentId = 0;
            else 
	                CurrentId = Integer.parseInt(value.toString()); 
                  break; 
           case 19: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  AddressId = 0;
            else 
	                AddressId = Integer.parseInt(value.toString()); 
                  break; 
           case 20: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CityId = 0;
            else 
	                CityId = Integer.parseInt(value.toString()); 
                  break; 
           case 21: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  TownId = 0;
            else 
	                TownId = Integer.parseInt(value.toString()); 
                  break; 
           case 22: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DeliveredAmount = 0;
            else 
	                DeliveredAmount = Integer.parseInt(value.toString()); 
                  break; 
           case 23: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Increased = false;
            else 
	                Increased = Boolean.getBoolean(value.toString()); 
                  break; 
           case 24: 
              if(value != null){ 
                  LoadingVehicleSerials = new ArrayOfLoadingVehicleSerial(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      LoadingVehicleSerial item = new LoadingVehicleSerial(); 
                      item.loadSoapObject(pi);;
                  LoadingVehicleSerials.add(item); 
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
        envelope.addMapping(NAMESPACE, "LoadingVehicleStockDetail", this.getClass());
                   new ArrayOfLoadingVehicleSerial().register(envelope); 

    }*/

}