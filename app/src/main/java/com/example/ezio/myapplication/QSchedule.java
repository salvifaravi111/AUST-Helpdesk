package com.example.ezio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class QSchedule extends AppCompatActivity {

    static String info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qschedule);
    }


    public void Savebody(View v){

        EditText e=(EditText)findViewById(R.id.editText);

        int w=v.getId();

        if(w==R.id.editText)

            e.setText("");


    }
    public void save2(View v){

        Intent f=new Intent(QSchedule.this,Settime.class);

        startActivity(f);
    }
    public void save3(View v){
        Intent f=new Intent(QSchedule.this,Setdate.class);
        startActivity(f);


    }
    public void sa(View v){

        Intent f=new Intent(QSchedule.this,Event.class);

        info=((EditText)findViewById(R.id.editText)).getText().toString();

        startActivity(f);

    }
}
