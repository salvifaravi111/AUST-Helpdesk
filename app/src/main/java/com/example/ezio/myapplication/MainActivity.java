package com.example.ezio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends Activity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.mybutton);


        b.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, IntoStart.class);
                startActivity(i);
            }
        });


    }
    public void about(View v){

        Intent s=new Intent(MainActivity.this,About.class);
        startActivity(s);

    }
    /*public void quiz(View v){
        Intent z=new Intent(MainActivity.this,QSchedule.class);
        startActivity(z);
    }*/


    public void aboutaust(View v){

        Intent t=new Intent(MainActivity.this,Aust.class);

        startActivity(t);

    }
}
