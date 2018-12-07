package com.example.ezio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;


public class Setdate extends AppCompatActivity {

    static int mon,day,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setdate);
    }


    public void dat(View v){

        DatePicker d=(DatePicker)findViewById(R.id.datePicker);

        mon=d.getMonth();

        day=d.getDayOfMonth();

        year=d.getYear();

        Toast.makeText(getApplicationContext(), "The Date is Stored!", Toast.LENGTH_SHORT).show();


    }


}
