package com.example.testerdb.Database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.*;
import android.database.sqlite.*;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

//database classs that makes connection to DB where creating db, dropping.
public class DatabaseSetup {
    SQLiteDatabase DB = null;

    public void createDatabase(Context context){
        DB = context.openOrCreateDatabase("JoesCatDB", context.MODE_PRIVATE, null);
        DB.execSQL("Drop table if exists JoeTable;");
        DB.execSQL("Create table if not exists JoeTable (RSSI INT(3), Compass_Heading VARCHAR);");

        DB.execSQL("Insert into JoeTable VALUES (-50, 'NorthEast');");

        Cursor c = DB.rawQuery("Select * FROM JoeTable;", null);
        c.moveToFirst();
        Log.d("NorthEast", c.getString(c.getColumnIndexOrThrow("Compass_Heading")));
        DB.close();
    }



}

