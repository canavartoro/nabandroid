package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class Waybill extends BaseObject {

     public Integer Id = 0;
     public ArrayOfDomesticPurchaseStockDetail DomesticStockDetails = new ArrayOfDomesticPurchaseStockDetail();  //array
     public ArrayOfDispatchOrderStockDetail DispatchStockDetails = new ArrayOfDispatchOrderStockDetail();  //array
     public Integer ShippingCodeId = 0;
     public Integer ShippingTypeId = 0;
     public Integer WaybillTypeId = 0;
     public Date WaybillDate = new Date(1900, 1, 1);
     public String WaybillNo = "";
     public String SeriesNo = "";
     public String QueueNo = "";
     public Integer CurrentCardId = 0;
     public Integer PurchaseOrderId = 0;
     public Integer DispatchOrderId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return DomesticStockDetails; 
           case 2: 
                return DispatchStockDetails; 
           case 3: 
                return ShippingCodeId; 
           case 4: 
                return ShippingTypeId; 
           case 5: 
                return WaybillTypeId; 
           case 6: 
                return WaybillDate; 
           case 7: 
                return WaybillNo; 
           case 8: 
                return SeriesNo; 
           case 9: 
                return QueueNo; 
           case 10: 
                return CurrentCardId; 
           case 11: 
                return PurchaseOrderId; 
           case 12: 
                return DispatchOrderId; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 13;
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
                info.name = "DomesticStockDetails"; 
                info.type = new ArrayOfDomesticPurchaseStockDetail().getClass(); 
                             break; 
           case 2: 
                info.name = "DispatchStockDetails"; 
                info.type = new ArrayOfDispatchOrderStockDetail().getClass(); 
                             break; 
           case 3: 
                info.name = "ShippingCodeId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 4: 
                info.name = "ShippingTypeId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 5: 
                info.name = "WaybillTypeId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 6: 
                info.name = "WaybillDate"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 7: 
                info.name = "WaybillNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 8: 
                info.name = "SeriesNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 9: 
                info.name = "QueueNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 10: 
                info.name = "CurrentCardId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 11: 
                info.name = "PurchaseOrderId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 12: 
                info.name = "DispatchOrderId"; 
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
                  DomesticStockDetails = new ArrayOfDomesticPurchaseStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      DomesticPurchaseStockDetail item = new DomesticPurchaseStockDetail(); 
                      item.loadSoapObject(pi);;
                  DomesticStockDetails.add(item); 
                   } 
                   } 
                  } 
                  break; 
           case 2: 
              if(value != null){ 
                  DispatchStockDetails = new ArrayOfDispatchOrderStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      DispatchOrderStockDetail item = new DispatchOrderStockDetail(); 
                      item.loadSoapObject(pi);;
                  DispatchStockDetails.add(item); 
                   } 
                   } 
                  } 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ShippingCodeId = 0;
            else 
	                ShippingCodeId = Integer.parseInt(value.toString()); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ShippingTypeId = 0;
            else 
	                ShippingTypeId = Integer.parseInt(value.toString()); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  WaybillTypeId = 0;
            else 
	                WaybillTypeId = Integer.parseInt(value.toString()); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  WaybillDate = new Date(1900, 1, 1);
            else 
	                WaybillDate = DateUtil.getDate(value.toString()); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  WaybillNo = "";
            else 
	                WaybillNo = value.toString(); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  SeriesNo = "";
            else 
	                SeriesNo = value.toString(); 
                  break; 
           case 9: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  QueueNo = "";
            else 
	                QueueNo = value.toString(); 
                  break; 
           case 10: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentCardId = 0;
            else 
	                CurrentCardId = Integer.parseInt(value.toString()); 
                  break; 
           case 11: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  PurchaseOrderId = 0;
            else 
	                PurchaseOrderId = Integer.parseInt(value.toString()); 
                  break; 
           case 12: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchOrderId = 0;
            else 
	                DispatchOrderId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "Waybill", this.getClass());
                   new ArrayOfDomesticPurchaseStockDetail().register(envelope); 
           new ArrayOfDispatchOrderStockDetail().register(envelope); 

    }*/

}