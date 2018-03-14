package com.uyumsoft.nab.serv;

import org.ksoap2.serialization.*;
import java.util.Hashtable;
import java.util.Vector;

public class ArrayOfLoadingVehicleSerial extends Vector<LoadingVehicleSerial> implements KvmSerializable {

    private static final long serialVersionUID = 1L;
    String n1 = "http://tempuri.org/";

    protected String getItemDescriptor()
    {
        return "LoadingVehicleSerial";
    }

    // This describes what type of objects are to be contained in the Array
    protected Class getElementClass() {
        return LoadingVehicleSerial.class.getClass();
    }

    /// by TORO
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }

    @Override
    public int getPropertyCount() {
        return this.size();
    }

    @Override
    public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo arg2) {
        arg2.name = "LoadingVehicleSerial";
        arg2.type = LoadingVehicleSerial.class.getClass();
        arg2.namespace = n1;
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
        this.add((LoadingVehicleSerial)arg1);
    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		int itemCount = property.getPropertyCount();
		if(itemCount > 0){
			for(int loop=0;loop < itemCount;loop++){
				SoapObject pii = (SoapObject)property.getProperty(loop);
				LoadingVehicleSerial item = new LoadingVehicleSerial();
				item.loadSoapObject(pii);
				this.add(item);
        	}
        }
	}    
	
    /*public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(n1, "ArrayOfLoadingVehicleSerial", LoadingVehicleSerial.class.getClass());
        new LoadingVehicleSerial().register(envelope);
    }*/
    

}