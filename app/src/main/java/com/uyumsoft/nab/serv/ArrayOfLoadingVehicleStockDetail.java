package com.uyumsoft.nab.serv;

import org.ksoap2.serialization.*;
import java.util.Hashtable;
import java.util.Vector;

public class ArrayOfLoadingVehicleStockDetail extends Vector<LoadingVehicleStockDetail> implements KvmSerializable {

    private static final long serialVersionUID = 1L;
    String n1 = "http://tempuri.org/";

    protected String getItemDescriptor()
    {
        return "LoadingVehicleStockDetail";
    }

    // This describes what type of objects are to be contained in the Array
    protected Class getElementClass() {
        return LoadingVehicleStockDetail.class.getClass();
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
        arg2.name = "LoadingVehicleStockDetail";
        arg2.type = LoadingVehicleStockDetail.class.getClass();
        arg2.namespace = n1;
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
        this.add((LoadingVehicleStockDetail)arg1);
    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		int itemCount = property.getPropertyCount();
		if(itemCount > 0){
			for(int loop=0;loop < itemCount;loop++){
				SoapObject pii = (SoapObject)property.getProperty(loop);
				LoadingVehicleStockDetail item = new LoadingVehicleStockDetail();
				item.loadSoapObject(pii);
				this.add(item);
        	}
        }
	}    
	
    /*public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(n1, "ArrayOfLoadingVehicleStockDetail", LoadingVehicleStockDetail.class.getClass());
        new LoadingVehicleStockDetail().register(envelope);
    }*/
    

}