package com.example.ezio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class Settime extends AppCompatActivity {

    static int hour;
    static int minute;
    private TimePicker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settime);

    }


    public void time(View v){

        t=(TimePicker)findViewById(R.id.timePicker);

        hour=t.getCurrentHour();

        minute=t.getCurrentMinute();

        Toast.makeText(getApplicationContext(),"The Time is Stored",Toast.LENGTH_SHORT).show();


    }
}
