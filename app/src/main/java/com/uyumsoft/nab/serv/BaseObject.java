package com.uyumsoft.nab.serv;

import java.io.Serializable;
import org.ksoap2.serialization.*;

public abstract class BaseObject implements KvmSerializable, Serializable {

    protected static final String NAMESPACE = "http://tempuri.org/";

    public BaseObject()
    {
        super();
    }

}