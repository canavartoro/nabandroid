package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class EntranceFromStoreWarehouse extends BaseObject {

     public Integer Id = 0;
     public ArrayOfEntranceFromStoreWarehouseStockDetail StockDetail = new ArrayOfEntranceFromStoreWarehouseStockDetail();  //array
     public String DispatchNo = "";
     public Date AcceptedDate = new Date(1900, 1, 1);
     public String AcceptedNo = "";
     public Integer OutputWorkplaceId = 0;
     public Integer InputWarehouseId = 0;
     public Integer StockActionTypeId = 0;
     public Integer DispatchedId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return StockDetail; 
           case 2: 
                return DispatchNo; 
           case 3: 
                return AcceptedDate; 
           case 4: 
                return AcceptedNo; 
           case 5: 
                return OutputWorkplaceId; 
           case 6: 
                return InputWarehouseId; 
           case 7: 
                return StockActionTypeId; 
           case 8: 
                return DispatchedId; 

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
                info.type = new ArrayOfEntranceFromStoreWarehouseStockDetail().getClass(); 
                             break; 
           case 2: 
                info.name = "DispatchNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "AcceptedDate"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 4: 
                info.name = "AcceptedNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "OutputWorkplaceId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 6: 
                info.name = "InputWarehouseId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 7: 
                info.name = "StockActionTypeId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 8: 
                info.name = "DispatchedId"; 
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
                  StockDetail = new ArrayOfEntranceFromStoreWarehouseStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      EntranceFromStoreWarehouseStockDetail item = new EntranceFromStoreWarehouseStockDetail(); 
                      item.loadSoapObject(pi);;
                  StockDetail.add(item); 
                   } 
                   } 
                  } 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchNo = "";
            else 
	                DispatchNo = value.toString(); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  AcceptedDate = new Date(1900, 1, 1);
            else 
	                AcceptedDate = DateUtil.getDate(value.toString()); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  AcceptedNo = "";
            else 
	                AcceptedNo = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  OutputWorkplaceId = 0;
            else 
	                OutputWorkplaceId = Integer.parseInt(value.toString()); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  InputWarehouseId = 0;
            else 
	                InputWarehouseId = Integer.parseInt(value.toString()); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  StockActionTypeId = 0;
            else 
	                StockActionTypeId = Integer.parseInt(value.toString()); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchedId = 0;
            else 
	                DispatchedId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "EntranceFromStoreWarehouse", this.getClass());
                   new ArrayOfEntranceFromStoreWarehouseStockDetail().register(envelope); 

    }*/

}