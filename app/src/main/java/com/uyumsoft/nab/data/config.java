package com.uyumsoft.nab.data;

import com.uyumsoft.nab.serv.BaseObject;

import org.ksoap2.serialization.PropertyInfo;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Created by huseyin.celik on 13.03.2018.
 */

public class config extends BaseObject {

    private static final long serialVersionUID = 1L;
    public String ServiceURL = "";
    public Boolean YuklemeOneri = false;

    @Override
    public Object getProperty(int i) {
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public void setProperty(int i, Object o) {

    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {

    }
}
