package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class GetServiceWarehouseStockDetail extends BaseObject {

    private static final String METHOD_NAME = "GetServiceWarehouseStockDetail";
    private static final String NAMESPACE = "http://tempuri.org/";

     public ServiceRequestOfBarcode context = new ServiceRequestOfBarcode();


	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);         
		PropertyInfo p0 = new PropertyInfo();
		p0.setName("context");
		p0.setValue(context);
		p0.setType(ServiceRequestOfBarcode.class);
		p0.setNamespace(NAMESPACE);
		request.addProperty(p0);



         return request;
	}

	public String GetSoapAction()
	{
		return NAMESPACE + METHOD_NAME;
	}
	
    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return context; 

    	}

    	return null;
    }
    
    public int getPropertyCount()
    {
        return 2;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {

           case 0: 
                info.name = "context"; 
                info.type = new ServiceRequestOfBarcode().getClass(); 
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
                context = (ServiceRequestOfBarcode)value; 
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

    /*public void register(SoapSerializationEnvelope envelope) {

    }*/

}