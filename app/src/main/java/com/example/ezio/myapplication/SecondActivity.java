package com.example.ezio.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SecondActivity extends AppCompatActivity {

    public static int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void bbb(View v) {

        int viewId=v.getId();
        if(viewId==R.id.button)
            x=1;
        if(viewId==R.id.button2)
            x=2;
        if(viewId==R.id.button3)
            x=3;
        if(viewId==R.id.button4)
            x=4;
        if(viewId==R.id.button5)
            x=5;
        if(viewId==R.id.button6)
            x=6;
        if(viewId==R.id.button7)
            x=7;
        Intent j = new Intent(SecondActivity.this, Spintest.class);
        startActivity(j);


    }

    public void bbb1(View v){

        Toast.makeText(getApplicationContext(), "No Classes today,time to enjoy!!!!", Toast.LENGTH_LONG).show();


    }




}



