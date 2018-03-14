package com.uyumsoft.nab.util;

import android.content.Context;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by huseyin.celik on 12.03.2018.
 */

public class streamWriter {

    public static void SerilizeObj(Object obj, String fileName) {

        if (obj == null)
            return;

        try {
            FileOutputStream fOut = statics.getMainActivity().openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fOut);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static Object DeSerilizeObj(String fileName) {

        try {
            Object obj = null;
            InputStream fis = statics.getMainActivity().openFileInput(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            return obj;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
        return null;
    }

    public static void delete(String fileName) {
        try {
            statics.getMainActivity().deleteFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
