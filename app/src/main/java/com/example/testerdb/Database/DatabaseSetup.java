package com.example.testerdb.Database;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.database.*;
import android.database.sqlite.*;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

//database classs that makes connection to DB where creating db, dropping.
public class DatabaseSetup extends AppCompatActivity {
    SQLiteDatabase DB = null;

    @SuppressLint("Range")
    public void createDatabase(){
        DB = openOrCreateDatabase("MyDogDB", MODE_PRIVATE, null);
        DB.execSQL("Drop table if exists myTable");
        DB.execSQL("Create table if not exists" + " myTable (RSSI INT(3), Compass_Heading VARCHAR);");

        DB.execSQL("Insert into MyDogDB VALUES (-50, 'NorthEast');");

        Cursor c = DB.rawQuery("Select * FROM MyDogDB;", null);
        c.moveToFirst();
        Log.i("NorthEast", c.getString(c.getColumnIndex("Compass_Heading")));
        DB.close();
    }



}

