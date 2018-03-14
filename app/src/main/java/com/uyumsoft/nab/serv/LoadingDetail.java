package com.uyumsoft.nab.serv;

import java.util.Date;
import android.util.Base64;
import java.util.Hashtable;
import java.math.BigDecimal;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class LoadingDetail extends BaseObject {

     public String LoadingNo = "";
     public Date LoadingDate = new Date(1900, 1, 1);
     public String StockCode = "";
     public String StockName = "";
     public Integer Id = 0;
     public Integer CurrentId = 0;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return LoadingNo; 
           case 1: 
                return LoadingDate; 
           case 2: 
                return StockCode; 
           case 3: 
                return StockName; 
           case 4: 
                return Id; 
           case 5: 
                return CurrentId; 

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
                info.name = "LoadingNo"; 
                info.type = PropertyInfo.STRING_CLASS; 
                             break; 
           case 1: 
                info.name = "LoadingDate"; 
                info.type = Date.class.getClass(); 
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
                info.name = "Id"; 
                info.type = PropertyInfo.INTEGER_CLASS; 
                             break; 
           case 5: 
                info.name = "CurrentId"; 
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
                  LoadingNo = "";
            else 
	                LoadingNo = value.toString(); 
                  break; 
           case 1: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  LoadingDate = new Date(1900, 1, 1);
            else 
	                LoadingDate = DateUtil.getDate(value.toString()); 
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
                  Id = 0;
            else 
	                Id = Integer.parseInt(value.toString()); 
                  break; 
           case 5: 
            if(value.toString().equalsIgnoreCase("anyType{}"))
                  CurrentId = 0;
            else 
	                CurrentId = Integer.parseInt(value.toString()); 
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
        envelope.addMapping(NAMESPACE, "LoadingDetail", this.getClass());
        
    }*/

}