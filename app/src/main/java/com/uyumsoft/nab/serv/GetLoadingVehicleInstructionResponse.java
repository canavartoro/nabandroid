package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetLoadingVehicleInstructionResponse extends BaseObject {

    public ServiceResponseOfListOfLoadingVehicleInstruction GetLoadingVehicleInstructionResult;


    public Object getProperty(int index)
    {

    	return GetLoadingVehicleInstructionResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetLoadingVehicleInstructionResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetLoadingVehicleInstructionResult = (ServiceResponseOfListOfLoadingVehicleInstruction)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetLoadingVehicleInstructionResult = new ServiceResponseOfListOfLoadingVehicleInstruction();
		GetLoadingVehicleInstructionResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetLoadingVehicleInstructionResponse", this.getClass());
        new ServiceResponseOfListOfLoadingVehicleInstruction().register(envelope);
    }*/

}