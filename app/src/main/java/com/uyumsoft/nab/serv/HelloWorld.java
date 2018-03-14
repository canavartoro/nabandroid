package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class HelloWorld extends BaseObject {

    private static final String METHOD_NAME = "HelloWorld";
    private static final String NAMESPACE = "http://tempuri.org/";



	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);         


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

    	}

    	return null;
    }
    
    public int getPropertyCount()
    {
        return 0;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {


        default:
            break;
        }
    }
    
    public void setProperty(int index, Object value)
    {
    	switch (index)
    	{

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