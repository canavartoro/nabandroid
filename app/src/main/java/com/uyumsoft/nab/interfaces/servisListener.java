package com.uyumsoft.nab.interfaces;

/**
 * Created by huseyin.celik on 10.03.2018.
 */

public interface servisListener {
    public abstract void onEnd(Object sender, Object data);

    public abstract void onError(Object sender, String errorString);
}