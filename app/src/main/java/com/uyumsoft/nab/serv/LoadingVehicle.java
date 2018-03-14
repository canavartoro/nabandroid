package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class LoadingVehicle extends BaseObject {

     public Integer Id = 0;
     public ArrayOfLoadingVehicleStockDetail StockDetails = new ArrayOfLoadingVehicleStockDetail();  //array
     public String InstructionNo = "";
     public Date DocDate = new Date(1900, 1, 1);
     public String DocNo = "";
     public Integer InstructionId = 0;
     public Boolean IsLoaded = false;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return StockDetails; 
           case 2: 
                return InstructionNo; 
           case 3: 
                return DocDate; 
           case 4: 
                return DocNo; 
           case 5: 
                return InstructionId; 
           case 6: 
                return IsLoaded; 

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
                info.name = "StockDetails"; 
                info.type = new ArrayOfLoadingVehicleStockDetail().getClass(); 
                             break; 
           case 2: 
                info.name = "InstructionNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "DocDate"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 4: 
                info.name = "DocNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "InstructionId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 6: 
                info.name = "IsLoaded"; 
                info.type = PropertyInfo.BOOLEAN_CLASS; 
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
              if(value != null){ 
                  StockDetails = new ArrayOfLoadingVehicleStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      LoadingVehicleStockDetail item = new LoadingVehicleStockDetail(); 
                      item.loadSoapObject(pi);;
                  StockDetails.add(item); 
                   } 
                   } 
                  } 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  InstructionNo = "";
            else 
	                InstructionNo = value.toString(); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DocDate = new Date(1900, 1, 1);
            else 
	                DocDate = DateUtil.getDate(value.toString()); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DocNo = "";
            else 
	                DocNo = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  InstructionId = 0;
            else 
	                InstructionId = Integer.parseInt(value.toString()); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  IsLoaded = false;
            else 
	                IsLoaded = Boolean.getBoolean(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "LoadingVehicle", this.getClass());
                   new ArrayOfLoadingVehicleStockDetail().register(envelope); 

    }*/

}