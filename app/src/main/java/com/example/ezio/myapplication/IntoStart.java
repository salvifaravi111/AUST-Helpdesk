package com.example.ezio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IntoStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into_start);

                TextView t=(TextView)findViewById(R.id.date);


        Date date=new Date();
        CharSequence day = DateFormat.format("EEEE", date.getTime());

        String currentDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());


        t.setText("DATE\n\n"+day+"\n\n"+currentDate);






    }


    public void rou(View V){

        Intent z=new Intent(IntoStart.this,SecondActivity.class);

        startActivity(z);


    }

    public void quiz(View v){

        Intent f=new Intent(IntoStart.this,QSchedule.class);

        startActivity(f);


    }
    public void tinfo(View v){
        Intent z=new Intent(IntoStart.this,Teachers.class);
        startActivity(z);


    }


}
