package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class GoodsRequestDispatchStockDetail extends BaseObject {

     public Integer Id = 0;
     public String DispatchingWarehouse = "";
     public String StockCode = "";
     public String StockName = "";
     public String Unity = "";
     public BigDecimal CheckAmount = new BigDecimal(0);
     public BigDecimal DispatchedAmount = new BigDecimal(0);
     public String Property1 = "";
     public Boolean HasProperty = false;
     public Integer DispatchingWarehouseId = 0;
     public Integer StockId = 0;
     public Integer UnitId = 0;
     public Integer PropertyId1 = 0;
     public BigDecimal ReadAmount = new BigDecimal(0);


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return DispatchingWarehouse; 
           case 2: 
                return StockCode; 
           case 3: 
                return StockName; 
           case 4: 
                return Unity; 
           case 5: 
                return CheckAmount; 
           case 6: 
                return DispatchedAmount; 
           case 7: 
                return Property1; 
           case 8: 
                return HasProperty; 
           case 9: 
                return DispatchingWarehouseId; 
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
                info.name = "Id"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 1: 
                info.name = "DispatchingWarehouse"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "StockCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "StockName"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "Unity"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "CheckAmount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 6: 
                info.name = "DispatchedAmount"; 
                info.type = BigDecimal.class.getClass(); 
                             break; 
           case 7: 
                info.name = "Property1"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 8: 
                info.name = "HasProperty"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
                             break; 
           case 9: 
                info.name = "DispatchingWarehouseId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
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
                  Id = 0;
            else 
	                Id = Integer.parseInt(value.toString()); 
                  break; 
           case 1: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchingWarehouse = "";
            else 
	                DispatchingWarehouse = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockCode = "";
            else 
	                StockCode = value.toString(); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockName = "";
            else 
	                StockName = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Unity = "";
            else 
	                Unity = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CheckAmount = new BigDecimal(0);
            else 
	                CheckAmount = new BigDecimal(value.toString()); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchedAmount = new BigDecimal(0);
            else 
	                DispatchedAmount = new BigDecimal(value.toString()); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Property1 = "";
            else 
	                Property1 = value.toString(); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  HasProperty = false;
            else 
	                HasProperty = Boolean.getBoolean(value.toString()); 
                  break; 
           case 9: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchingWarehouseId = 0;
            else 
	                DispatchingWarehouseId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "GoodsRequestDispatchStockDetail", this.getClass());
        
    }*/

}