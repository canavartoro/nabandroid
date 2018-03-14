package com.uyumsoft.nab.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleInstruction;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleSerial;
import com.uyumsoft.nab.serv.ArrayOfLoadingVehicleStockDetail;
import com.uyumsoft.nab.serv.LoadingVehicleInstruction;
import com.uyumsoft.nab.serv.LoadingVehicleSerial;
import com.uyumsoft.nab.serv.LoadingVehicleStockDetail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by huseyin.celik on 5.02.2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "dbfiles";

    // Contacts table name
    private static final String TABLE_VEHICLE_LOADING = "VEHICLE_LOADING";
    private static final String TABLE_VEHICLE_LOADING_DET = "VEHICLE_LOADING_DET";
    private static final String TABLE_VEHICLE_LOADING_BAR = "VEHICLE_LOADING_BAR";

    // Vehicle_Loading Table Columns names
    private static final String KEY_ID = "id";
    private static final String FLAG_COLUMN = "Flag";
    private static final String VEHICLE_LOADING_InstructionNo = "InstructionNo";
    private static final String VEHICLE_LOADING_InstructionDate = "InstructionDate";
    private static final String VEHICLE_LOADING_VehicleNo = "VehicleNo";
    private static final String VEHICLE_LOADING_Driver = "Driver";
    private static final String VEHICLE_LOADING_ShippingType = "ShippingType";
    private static final String VEHICLE_LOADING_ShipperInformation = "ShipperInformation";


    // Vehicle_Loading detail Table Columns names
    private static final String VEHICLE_LOADING_id = "VehicleLoadingId";
    private static final String VEHICLE_LOADING_DET_OrderId = "OrderId";
    private static final String VEHICLE_LOADING_DET_OrderNo = "OrderNo";
    private static final String VEHICLE_LOADING_DET_StockId = "StockId";
    private static final String VEHICLE_LOADING_DET_StockName = "StockName";
    private static final String VEHICLE_LOADING_DET_DispatchTown = "DispatchTown";
    private static final String VEHICLE_LOADING_DET_DispatchCity = "DispatchCity";
    private static final String VEHICLE_LOADING_DET_DispatchAddress = "DispatchAddress";
    private static final String VEHICLE_LOADING_DET_CurrentName = "CurrentName";
    private static final String VEHICLE_LOADING_DET_CurrentCode = "CurrentCode";
    private static final String VEHICLE_LOADING_DET_CurrentId = "CurrentId";
    private static final String VEHICLE_LOADING_DET_Amount = "Amount";
    private static final String VEHICLE_LOADING_DET_DispatchOrderNo = "DispatchOrderNo";
    private static final String VEHICLE_LOADING_DET_Property1 = "Property1";

    // Vehicle_Loading barcode Table Columns names
    private static final String VEHICLE_LOADING_BAR_id = "VehicleLoadingDetId";
    private static final String VEHICLE_LOADING_BAR_Barcode = "Barcode";
    private static final String VEHICLE_LOADING_BAR_StockId = "StockId";
    private static final String VEHICLE_LOADING_BAR_StockCode = "StockCode";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_VEHICLE_LOADING_TABLE = "CREATE TABLE " + TABLE_VEHICLE_LOADING + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + VEHICLE_LOADING_InstructionNo + " TEXT,"
                + VEHICLE_LOADING_InstructionDate + " datetime,"
                + VEHICLE_LOADING_VehicleNo + " TEXT,"
                + VEHICLE_LOADING_Driver + " TEXT,"
                + VEHICLE_LOADING_ShippingType + " TEXT,"
                + VEHICLE_LOADING_ShipperInformation + " TEXT,"
                + FLAG_COLUMN + " INTEGER)";
        db.execSQL(CREATE_VEHICLE_LOADING_TABLE);

        String CREATE_VEHICLE_LOADING_TABLE_DET = "CREATE TABLE " + TABLE_VEHICLE_LOADING_DET + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + VEHICLE_LOADING_id + " INTEGER,"
                + VEHICLE_LOADING_DET_OrderId + " INTEGER,"
                + VEHICLE_LOADING_DET_OrderNo + " TEXT,"
                + VEHICLE_LOADING_DET_StockId + " INTEGER,"
                + VEHICLE_LOADING_DET_StockName + " TEXT,"
                + VEHICLE_LOADING_DET_DispatchTown + " TEXT,"
                + VEHICLE_LOADING_DET_DispatchCity + " TEXT,"
                + VEHICLE_LOADING_DET_DispatchAddress + " TEXT,"
                + VEHICLE_LOADING_DET_CurrentName + " TEXT,"
                + VEHICLE_LOADING_DET_CurrentCode + " TEXT,"
                + VEHICLE_LOADING_DET_CurrentId + " INTEGER,"
                + VEHICLE_LOADING_DET_Amount + " REAL,"
                + VEHICLE_LOADING_DET_DispatchOrderNo + " TEXT,"
                + VEHICLE_LOADING_DET_Property1 + " TEXT,"
                + FLAG_COLUMN + " INTEGER)";
        db.execSQL(CREATE_VEHICLE_LOADING_TABLE_DET);

        String CREATE_VEHICLE_LOADING_TABLE_BAR = "CREATE TABLE " + TABLE_VEHICLE_LOADING_BAR + "("
                + KEY_ID + " INTEGER,"
                + VEHICLE_LOADING_BAR_StockId + " INTEGER,"
                + VEHICLE_LOADING_BAR_StockCode + " TEXT,"
                + VEHICLE_LOADING_BAR_Barcode + " TEXT PRIMARY KEY,"
                + FLAG_COLUMN + " INTEGER)";
        db.execSQL(CREATE_VEHICLE_LOADING_TABLE_BAR);
    }

    public boolean insertVehicle(int id, String instructionNo, Date instructionDate, String vehicleNo, String driver, String shippingType, String shipperInformation) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_ID, id);
        contentValues.put(VEHICLE_LOADING_InstructionNo, instructionNo);
        contentValues.put(VEHICLE_LOADING_InstructionDate, String.valueOf(instructionDate));
        contentValues.put(VEHICLE_LOADING_VehicleNo, vehicleNo);
        contentValues.put(VEHICLE_LOADING_Driver, driver);
        contentValues.put(VEHICLE_LOADING_ShippingType, shippingType);
        contentValues.put(VEHICLE_LOADING_ShipperInformation, shipperInformation);
        contentValues.put(FLAG_COLUMN, 0);
        db.insert(TABLE_VEHICLE_LOADING, null, contentValues);
        return true;
    }

    public boolean insertVehicleDet(int id, int vehicleLoadingId, int orderId, String orderNo, int stockId, String stockName, String dispatchTown, String dispatchCity, String dispatchAddress, String currentName, String currentCode, int
            currentId, BigDecimal amount, String dispatchOrderNo, String property1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_ID, id);
        contentValues.put(VEHICLE_LOADING_id, vehicleLoadingId);
        contentValues.put(VEHICLE_LOADING_DET_OrderId, orderId);
        contentValues.put(VEHICLE_LOADING_DET_OrderNo, orderNo);
        contentValues.put(VEHICLE_LOADING_DET_StockId, stockId);
        contentValues.put(VEHICLE_LOADING_DET_StockName, stockName);
        contentValues.put(VEHICLE_LOADING_DET_DispatchTown, dispatchTown);
        contentValues.put(VEHICLE_LOADING_DET_DispatchCity, dispatchCity);
        contentValues.put(VEHICLE_LOADING_DET_DispatchAddress, dispatchAddress);
        contentValues.put(VEHICLE_LOADING_DET_CurrentName, currentName);
        contentValues.put(VEHICLE_LOADING_DET_CurrentCode, currentCode);
        contentValues.put(VEHICLE_LOADING_DET_CurrentId, currentId);
        contentValues.put(VEHICLE_LOADING_DET_Amount, amount.doubleValue());
        contentValues.put(VEHICLE_LOADING_DET_DispatchOrderNo, dispatchOrderNo);
        contentValues.put(VEHICLE_LOADING_DET_Property1, property1);
        contentValues.put(FLAG_COLUMN, 0);
        db.insert(TABLE_VEHICLE_LOADING_DET, null, contentValues);

        return true;
    }

    public boolean insertVehicleBar(int id, int stockId, String stockCode, String barcode) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_ID, id);
        contentValues.put(VEHICLE_LOADING_BAR_StockId, stockId);
        contentValues.put(VEHICLE_LOADING_BAR_StockCode, stockCode);
        contentValues.put(VEHICLE_LOADING_BAR_Barcode, barcode);
        contentValues.put(FLAG_COLUMN, 0);
        db.insert(TABLE_VEHICLE_LOADING_BAR, null, contentValues);
        return true;
    }

    public Cursor getData(int tabloIndex) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = null;
        if (tabloIndex == 0) {
            res = db.rawQuery("select * from " + TABLE_VEHICLE_LOADING, null);
        } else {
            res = db.rawQuery("select * from " + TABLE_VEHICLE_LOADING_DET, null);
        }
        return res;
    }

    public ArrayOfLoadingVehicleInstruction getAllLoadingVehicle() {
        ArrayOfLoadingVehicleInstruction array_list = new ArrayOfLoadingVehicleInstruction();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_VEHICLE_LOADING, null);
        res.moveToFirst();

        while (res.isAfterLast() == false) {
            LoadingVehicleInstruction obj = new LoadingVehicleInstruction();
            obj.Driver = res.getString(res.getColumnIndex(VEHICLE_LOADING_Driver));
            obj.InstructionNo = res.getString(res.getColumnIndex(VEHICLE_LOADING_InstructionNo));
            obj.VehicleNo = res.getString(res.getColumnIndex(VEHICLE_LOADING_VehicleNo));
            obj.ShipperInformation = res.getString(res.getColumnIndex(VEHICLE_LOADING_ShipperInformation));
            obj.ShippingType = res.getString(res.getColumnIndex(VEHICLE_LOADING_ShippingType));
            obj.Id = res.getInt(res.getColumnIndex(KEY_ID));
            array_list.add(obj);
            res.moveToNext();
        }
        array_list.trimToSize();
        return array_list;
    }

    public ArrayOfLoadingVehicleStockDetail getAllLoadingDetVehicle(int vehicleLoadingId) {
        ArrayOfLoadingVehicleStockDetail array_list = new ArrayOfLoadingVehicleStockDetail();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_VEHICLE_LOADING_DET + " WHERE " + VEHICLE_LOADING_id + " = " + Integer.toString(vehicleLoadingId), null);

        res.moveToFirst();
        while (res.isAfterLast() == false) {
            LoadingVehicleStockDetail obj = new LoadingVehicleStockDetail();
            obj.Id = res.getInt(res.getColumnIndex(KEY_ID));
            obj.OrderId = res.getInt(res.getColumnIndex(VEHICLE_LOADING_DET_OrderId));
            obj.OrderNo = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_OrderNo));
            obj.StockId = res.getInt(res.getColumnIndex(VEHICLE_LOADING_DET_StockId));
            obj.StockName = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_StockName));
            obj.DispatchTown = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_DispatchTown));
            obj.DispatchCity = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_DispatchCity));
            obj.DispatchAddress = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_DispatchAddress));
            obj.CurrentName = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_CurrentName));
            obj.CurrentCode = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_CurrentCode));
            obj.CurrentCode = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_CurrentId));
            obj.Amount = new BigDecimal(res.getDouble(res.getColumnIndex(VEHICLE_LOADING_DET_Amount)));
            obj.DispatchOrderNo = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_DispatchOrderNo));
            obj.Property1 = res.getString(res.getColumnIndex(VEHICLE_LOADING_DET_Property1));
            array_list.add(obj);
            res.moveToNext();
        }
        array_list.trimToSize();
        return array_list;
    }

    public ArrayOfLoadingVehicleSerial getAllLoadingBarcodeVehicle(int id) {
        ArrayOfLoadingVehicleSerial array_list = new ArrayOfLoadingVehicleSerial();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_VEHICLE_LOADING_BAR + " WHERE " + KEY_ID + " = " + Integer.toString(id), null);

        res.moveToFirst();
        while (res.isAfterLast() == false) {
            LoadingVehicleSerial obj = new LoadingVehicleSerial();
            obj.Id = res.getInt(res.getColumnIndex(KEY_ID));
            obj.ItemId = res.getInt(res.getColumnIndex(VEHICLE_LOADING_BAR_StockId));
            obj.ItemCode = res.getString(res.getColumnIndex(VEHICLE_LOADING_BAR_StockCode));
            obj.SerialNo = res.getString(res.getColumnIndex(VEHICLE_LOADING_BAR_Barcode));
            array_list.add(obj);
            res.moveToNext();
        }
        array_list.trimToSize();
        return array_list;
    }

    public int numberOfRows() {
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, TABLE_VEHICLE_LOADING);
        return numRows;
    }

    public boolean updateVehicle(Integer id, String instructionNo, Date instructionDate, String vehicleNo, String driver, String shippingType, String shipperInformation) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(VEHICLE_LOADING_InstructionNo, instructionNo);
        contentValues.put(VEHICLE_LOADING_InstructionDate, String.valueOf(instructionDate));
        contentValues.put(VEHICLE_LOADING_VehicleNo, vehicleNo);
        contentValues.put(VEHICLE_LOADING_Driver, driver);
        contentValues.put(VEHICLE_LOADING_ShippingType, shippingType);
        contentValues.put(VEHICLE_LOADING_ShipperInformation, shipperInformation);
        db.update(TABLE_VEHICLE_LOADING, contentValues, "id = ? ", new String[]{Integer.toString(id)});
        return true;

    }

    public Integer deleteAllVehicle() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_VEHICLE_LOADING,
                "1 = 1 ", null);
        db.delete(TABLE_VEHICLE_LOADING_DET,
                "1 = 1 ", null);
        db.delete(TABLE_VEHICLE_LOADING_BAR,
                "1 = 1 ", null);
        return 1;
        /*return db.delete(TABLE_VEHICLE_LOADING,
                "id = ? ",
                new String[] { Integer.toString(id) });*/
    }

    public Integer deleteAllVehicleDet(int vehicleloadingId) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_VEHICLE_LOADING_DET,
                VEHICLE_LOADING_id + " = ? ", new String[]{Integer.toString(vehicleloadingId)});
    }

    public Integer deleteAllVehicleBarcode(int vehicleloadingDetId) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_VEHICLE_LOADING_BAR,
                KEY_ID + " = ? ", new String[]{Integer.toString(vehicleloadingDetId)});
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VEHICLE_LOADING);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VEHICLE_LOADING_DET);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VEHICLE_LOADING_BAR);

        // Create tables again
        onCreate(db);
    }

}