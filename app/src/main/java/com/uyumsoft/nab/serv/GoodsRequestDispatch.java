package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class GoodsRequestDispatch extends BaseObject {

     public Integer Id = 0;
     public ArrayOfGoodsRequestDispatchStockDetail StockDetail = new ArrayOfGoodsRequestDispatchStockDetail();  //array
     public String DispatchNo = "";
     public Date DispatchDate = new Date(1900, 1, 1);
     public Integer ActionId = 0;
     public Integer RequestedId = 0;
     public String RequestedNo = "";


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
                return DispatchDate; 
           case 4: 
                return ActionId; 
           case 5: 
                return RequestedId; 
           case 6: 
                return RequestedNo; 

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
                info.name = "StockDetail"; 
                info.type = new ArrayOfGoodsRequestDispatchStockDetail().getClass(); 
                             break; 
           case 2: 
                info.name = "DispatchNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 3: 
                info.name = "DispatchDate"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 4: 
                info.name = "ActionId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 5: 
                info.name = "RequestedId"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 6: 
                info.name = "RequestedNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
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
                  StockDetail = new ArrayOfGoodsRequestDispatchStockDetail(); 
                  SoapObject prp = (SoapObject)value; 
                  int itemCount = prp.getPropertyCount(); 
                  for(int loop=0;loop<itemCount;loop++){ 
                  if(prp.getProperty(loop) instanceof SoapObject){ 
                  SoapObject pi = (SoapObject)prp.getProperty(loop); 
                      GoodsRequestDispatchStockDetail item = new GoodsRequestDispatchStockDetail(); 
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
                  DispatchDate = new Date(1900, 1, 1);
            else 
	                DispatchDate = DateUtil.getDate(value.toString()); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  ActionId = 0;
            else 
	                ActionId = Integer.parseInt(value.toString()); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  RequestedId = 0;
            else 
	                RequestedId = Integer.parseInt(value.toString()); 
                  break; 
           case 6: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  RequestedNo = "";
            else 
	                RequestedNo = value.toString(); 
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
        envelope.addMapping(NAMESPACE, "GoodsRequestDispatch", this.getClass());
                   new ArrayOfGoodsRequestDispatchStockDetail().register(envelope); 

    }*/

}