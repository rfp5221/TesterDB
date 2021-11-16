package com.example.testerdb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.*;
import android.database.*;
import android.util.Log;
import android.content.ContentValues;

import android.os.Bundle;

import com.example.testerdb.Database.DatabaseSetup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseSetup DogDB = new DatabaseSetup();
        DogDB.createDatabase(getApplicationContext());

    }
}