package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class ServiceWarehouse extends BaseObject {

     public Integer Id = 0;
     public ArrayOfServiceWarehouseStockDetail StockDetail = new ArrayOfServiceWarehouseStockDetail();  //array
     public Integer ActionId = 0;
     public Date DocDate = new Date(1900, 1, 1);
     public String DocNo = "";
     public String OutputWarehouse = "";
     public String InputWarehouse = "";
     public String ActionCode = "";
     public Integer OutputWarehouseId = 0;
     public Integer InputWarehouseId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return StockDetail; 
           case 2: 
                return ActionId; 
           case 3: 
                return DocDate; 
           case 4: 
                return DocNo; 
           case 5: 
                return OutputWarehouse; 
           case 6: 
                return InputWarehouse; 
           case 7: 
                return ActionCode; 
           case 8: 
                return OutputWarehouseId; 
           case 9: 
                return InputWarehouseId; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 10;
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
                info.type = new ArrayOfServiceWarehouseStockDetail().getClass(); 
                             break; 
           case 2: 
                info.name = "ActionId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
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
                info.name = "OutputWarehouse"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 6: 
                info.name = "InputWarehouse"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 7: 
                info.name = "ActionCode"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 8: 
                info.name = "OutputWarehouseId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 9: 
                info.name = "InputWarehouseId"; 
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
                  StockDetail = new ArrayOfServiceWarehouseStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      ServiceWarehouseStockDetail item = new ServiceWarehouseStockDetail(); 
                      item.loadSoapObject(pi);;
                  StockDetail.add(item); 
                   } 
                   } 
                  } 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ActionId = 0;
            else 
	                ActionId = Integer.parseInt(value.toString()); 
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
                  OutputWarehouse = "";
            else 
	                OutputWarehouse = value.toString(); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  InputWarehouse = "";
            else 
	                InputWarehouse = value.toString(); 
                  break; 
           case 7: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ActionCode = "";
            else 
	                ActionCode = value.toString(); 
                  break; 
           case 8: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  OutputWarehouseId = 0;
            else 
	                OutputWarehouseId = Integer.parseInt(value.toString()); 
                  break; 
           case 9: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  InputWarehouseId = 0;
            else 
	                InputWarehouseId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "ServiceWarehouse", this.getClass());
                   new ArrayOfServiceWarehouseStockDetail().register(envelope); 

    }*/

}