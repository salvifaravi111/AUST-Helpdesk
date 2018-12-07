package com.example.ezio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aust);
    }


    public void map(View v){
        Intent x=new Intent(Aust.this,Mapmain.class);

        startActivity(x);


    }
    public void info(View v){
        Intent t=new Intent(Aust.this,Info.class);

        startActivity(t);


    }
    public void gal(View v){
        Intent p=new Intent(Aust.this,Gallerya.class);
        startActivity(p);


    }

}
