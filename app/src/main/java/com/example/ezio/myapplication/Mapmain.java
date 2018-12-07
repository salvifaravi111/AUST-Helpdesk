package com.example.ezio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Mapmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapmain);
    }


    public void gmap(View v){

        Intent t=new Intent(Mapmain.this,Map.class);
        startActivity(t);


    }

    public void fmap(View v){

        Intent t=new Intent(Mapmain.this,Maptest.class);

        Toast.makeText(getApplicationContext(), "Scroll to see the full map", Toast.LENGTH_LONG).show();

        startActivity(t);


    }
}
