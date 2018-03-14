package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class ForeignPurchase extends BaseObject {

     public Integer Id = 0;
     public ArrayOfForeignPurchaseStockDetail StockDetail = new ArrayOfForeignPurchaseStockDetail();  //array
     public String FileNo = "";
     public String CurrentCode = "";
     public String CurrentName = "";
     public String No = "";
     public Date Date = new Date(1900, 1, 1);
     public Integer FileId = 0;
     public Integer ActionCodeId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return StockDetail; 
           case 2: 
                return FileNo; 
           case 3: 
                return CurrentCode; 
           case 4: 
                return CurrentName; 
           case 5: 
                return No; 
           case 6: 
                return Date; 
           case 7: 
                return FileId; 
           case 8: 
                return ActionCodeId; 

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
                info.name = "StockDetail"; 
                info.type = new ArrayOfForeignPurchaseStockDetail().getClass(); 
                             break; 
           case 2: 
                info.name = "FileNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "CurrentCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "CurrentName"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "No"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 6: 
                info.name = "Date"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 7: 
                info.name = "FileId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 8: 
                info.name = "ActionCodeId"; 
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
              if(value != null){ 
                  StockDetail = new ArrayOfForeignPurchaseStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      ForeignPurchaseStockDetail item = new ForeignPurchaseStockDetail(); 
                      item.loadSoapObject(pi);;
                  StockDetail.add(item); 
                   } 
                   } 
                  } 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  FileNo = "";
            else 
	                FileNo = value.toString(); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentCode = "";
            else 
	                CurrentCode = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentName = "";
            else 
	                CurrentName = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  No = "";
            else 
	                No = value.toString(); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  Date = new Date(1900, 1, 1);
            else 
	                Date = DateUtil.getDate(value.toString()); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  FileId = 0;
            else 
	                FileId = Integer.parseInt(value.toString()); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ActionCodeId = 0;
            else 
	                ActionCodeId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "ForeignPurchase", this.getClass());
                   new ArrayOfForeignPurchaseStockDetail().register(envelope); 

    }*/

}