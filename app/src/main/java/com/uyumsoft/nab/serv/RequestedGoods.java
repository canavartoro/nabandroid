package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class RequestedGoods extends BaseObject {

     public Integer Id = 0;
     public String DispatchNo = "";
     public Date DispatchDate = new Date(1900, 1, 1);
     public String RequestState = "";
     public String RequestingWarehouse = "";
     public String WorkplaceCode = "";


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return Id; 
           case 1: 
                return DispatchNo; 
           case 2: 
                return DispatchDate; 
           case 3: 
                return RequestState; 
           case 4: 
                return RequestingWarehouse; 
           case 5: 
                return WorkplaceCode; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 6;
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
                info.name = "DispatchNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 2: 
                info.name = "DispatchDate"; 
                info.type = Date.class.getClass(); 
                             break; 
           case 3: 
                info.name = "RequestState"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 4: 
                info.name = "RequestingWarehouse"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 5: 
                info.name = "WorkplaceCode"; 
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
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchNo = "";
            else 
	                DispatchNo = value.toString(); 
                  break; 
           case 2: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  DispatchDate = new Date(1900, 1, 1);
            else 
	                DispatchDate = DateUtil.getDate(value.toString()); 
                  break; 
           case 3: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  RequestState = "";
            else 
	                RequestState = value.toString(); 
                  break; 
           case 4: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  RequestingWarehouse = "";
            else 
	                RequestingWarehouse = value.toString(); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  WorkplaceCode = "";
            else 
	                WorkplaceCode = value.toString(); 
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
        envelope.addMapping(NAMESPACE, "RequestedGoods", this.getClass());
        
    }*/

}