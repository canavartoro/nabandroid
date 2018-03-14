package com.uyumsoft.nab.serv;

import org.ksoap2.serialization.*;
import java.util.Hashtable;
import java.util.Vector;

public class ArrayOfLoadingVehicleInstruction extends Vector<LoadingVehicleInstruction> implements KvmSerializable {

    private static final long serialVersionUID = 1L;
    String n1 = "http://tempuri.org/";

    protected String getItemDescriptor()
    {
        return "LoadingVehicleInstruction";
    }

    // This describes what type of objects are to be contained in the Array
    protected Class getElementClass() {
        return LoadingVehicleInstruction.class.getClass();
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
        arg2.name = "LoadingVehicleInstruction";
        arg2.type = LoadingVehicleInstruction.class.getClass();
        arg2.namespace = n1;
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
        this.add((LoadingVehicleInstruction)arg1);
    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		int itemCount = property.getPropertyCount();
		if(itemCount > 0){
			for(int loop=0;loop < itemCount;loop++){
				SoapObject pii = (SoapObject)property.getProperty(loop);
				LoadingVehicleInstruction item = new LoadingVehicleInstruction();
				item.loadSoapObject(pii);
				this.add(item);
        	}
        }
	}    
	
    /*public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(n1, "ArrayOfLoadingVehicleInstruction", LoadingVehicleInstruction.class.getClass());
        new LoadingVehicleInstruction().register(envelope);
    }*/
    

}