package com.uyumsoft.nab.util;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.uyumsoft.nab.adapters.adapter_ArrayWithIcon;
import com.uyumsoft.nab.interfaces.onPositiveListener;
import com.uyumsoft.nab.nab.R;

/**
 * Created by huseyin.celik on 10.03.2018.
 */

public class screens {

    private static ProgressDialog progressDialog;
    private static Integer SELECTED_COLOR = -1;
    private static Integer BACKGROUND_COLOR = -1;
    private static Integer RED_COLOR = -1;
    private static Integer BLUE_COLOR = -1;

    public static void setDialog(ProgressDialog prg) {
        progressDialog = prg;
    }

    public static ProgressDialog getDialog() {
        return progressDialog;
    }

    public static void closeWait() {
        if (progressDialog != null)
            progressDialog.dismiss();
    }

    public static Integer GetSelectedColor() {
        if (SELECTED_COLOR == -1) {
            SELECTED_COLOR = Color.parseColor("#3f51b5");
        }
        return SELECTED_COLOR;
    }

    public static Integer GetBackgroundColor() {
        if (BACKGROUND_COLOR == -1) {
            BACKGROUND_COLOR = Color.parseColor("#FFFFFF");
        }
        return BACKGROUND_COLOR;
    }

    public static Integer GetRedColor() {
        if (RED_COLOR == -1) {
            RED_COLOR = Color.parseColor("#FB8989");
        }
        return RED_COLOR;
    }

    public static Integer GetBlueColor() {
        if (BLUE_COLOR == -1) {
            BLUE_COLOR = Color.parseColor("#04D8EB");
        }
        return BLUE_COLOR;
    }

    public static void showSnackbar(String text) {

        if (text == null)
            return;

        Log.i("showText", text);
        closeWait();

        try {
            if (statics.getCurrentActivity() == null)
                return;

            if (statics.getCurrentActivity().getCurrentFocus() == null)
                return;

            Snackbar.make(statics.getCurrentActivity().getCurrentFocus(), text, Snackbar.LENGTH_LONG)
                    .setAction("Bilgi", null).show();
        }
        catch (Exception e) {
            Log.e("showText", e.getMessage());
        }

    }

    public static void showText(String text) {

        if (text == null)
            return;

        Log.i("showText", text);
        closeWait();

        try {
            if (statics.getCurrentActivity() == null)
                return;
            Toast pieceToast = Toast.makeText(statics.getCurrentActivity(), text, Toast.LENGTH_LONG);

            pieceToast.show();
        }
        catch (Exception e) {
            Log.e("showText", e.getMessage());
        }

    }

    public static void showWait(String text) {

        if (text == null)
            return;

        Log.println(Log.INFO,"showWait", text);
        closeWait();
        progressDialog = ProgressDialog.show(statics.getCurrentActivity(), "", text, true);
        progressDialog.setIcon(R.drawable.run);
        progressDialog.show();
    }

    public static void showAlert(String text) {

        if (text == null)
            return;

        if (statics.getCurrentActivity() == null)
            return;

        try {
            Log.println(Log.INFO, "showAlert", text);
            closeWait();
            AlertDialog.Builder dialog = new AlertDialog.Builder(statics.getCurrentActivity());
            dialog.setIcon(R.drawable.run);
            dialog.setTitle("Dikkat");
            dialog.setCancelable(false);
            dialog.setMessage(text);
            dialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    dialog.dismiss();
                }
            });
            dialog.create().show();
        }
        catch (Exception e) {
            Log.e("showAlert", e.getMessage());
        }
    }

    public static void showAlert(String text, String title) {

        if (text == null)
            return;
        if (statics.getCurrentActivity() == null)
            return;
        if (title == null)
            title = "Dikkat";

        try {
            Log.println(Log.INFO, "showAlert", text);
            closeWait();
            AlertDialog.Builder dialog = new AlertDialog.Builder(statics.getCurrentActivity());
            dialog.setIcon(R.drawable.run);
            dialog.setCancelable(false);
            dialog.setTitle(title);
            dialog.setMessage(text);
            dialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    dialog.dismiss();
                }
            });
            dialog.create().show();
        }
        catch (Exception e) {
            Log.e("showAlert", e.getMessage());
        }
    }

    public static void showAlert(String text, DialogInterface.OnClickListener listener, Boolean iptalButton) {

        if (text == null)
            return;

        try {
            Log.println(Log.INFO, "showAlert", text);
            closeWait();
            AlertDialog.Builder dialog = new AlertDialog.Builder(statics.getCurrentActivity());
            dialog.setTitle("Dikkat");
            dialog.setIcon(R.drawable.run);
            dialog.setCancelable(false);
            dialog.setMessage(text);
            if (iptalButton) {
                dialog.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        dialog.dismiss();
                    }
                });
            }
            dialog.setPositiveButton("Tamam", listener);
            dialog.create().show();
        }
        catch (Exception e) {
            Log.e("showAlert", e.getMessage());
        }
    }

    public static void showAlertWithInput(String text, String title, final onPositiveListener positiveListener, Boolean ispassword) {

        if (text == null)
            return;

        try {
            Log.println(Log.INFO, "showAlert", text);
            closeWait();
            AlertDialog.Builder dialog = new AlertDialog.Builder(statics.getCurrentActivity());
            dialog.setTitle(title);
            dialog.setIcon(R.drawable.run);
            dialog.setCancelable(false);
            dialog.setMessage(text);
            final EditText input = new EditText(statics.getCurrentActivity());
            if (ispassword) {
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
            dialog.setView(input);
            dialog.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    dialog.dismiss();
                }
            });
            dialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String value = input.getText().toString();
                    if (positiveListener != null)
                        positiveListener.onPositiveButton(0, value);
                    dialog.dismiss();
                }
            }).create().show();
        }
        catch (Exception e) {
            Log.e("showAlert", e.getMessage());
        }
    }

    public static void selectMenu(final String[] menuItems, final Integer[] menuIcons, final onPositiveListener positiveListener) {

        AlertDialog.Builder builder = new AlertDialog.Builder(statics.getCurrentActivity());
        builder.setTitle("Seçenekler");
        if (menuIcons != null) {
            ListAdapter adapter = new adapter_ArrayWithIcon(statics.getCurrentActivity(), menuItems, menuIcons);
            builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int item) {
                    if (menuItems.length - 1 == item) {
                        dialog.dismiss();
                    }
                    else {
                        if (positiveListener != null)
                            positiveListener.onPositiveButton(item, menuItems[item].toString());
                    }
                }
            });
        }
        else {
            builder.setItems(menuItems, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int item) {
                    if (menuItems.length - 1 == item) {
                        dialog.dismiss();
                    }
                    else {
                        if (positiveListener != null)
                            positiveListener.onPositiveButton(item, menuItems[item].toString());
                    }
                }
            });
        }
        builder.create().show();
    }

}
