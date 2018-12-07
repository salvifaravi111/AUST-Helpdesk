package com.example.ezio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Spintest extends AppCompatActivity {

    public static int y,z,p;
    Spinner s,s1,s2;
    ArrayAdapter<CharSequence> adap,adap1,adap2;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spintest);

        s=(Spinner)findViewById(R.id.dept2);
        adap=ArrayAdapter.createFromResource(this,R.array.dept_names,android.R.layout.simple_spinner_item);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adap);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "Selected", Toast.LENGTH_LONG).show();

                if(position==0)
                    y=1;
                if(position==1)
                    y=2;
                if(position==2)
                    y=3;
                if(position==3)
                    y=4;
                if(position==4)
                    y=5;
                if(position==5)
                    y=6;
                if(position==6)
                    y=7;
                if(position==7)
                    y=8;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s1=(Spinner)findViewById(R.id.sem2);
        adap1=ArrayAdapter.createFromResource(this,R.array.sem_names,android.R.layout.simple_spinner_item);
        adap1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adap1);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "Selected"+position, Toast.LENGTH_LONG).show();

                if(position==0)
                    z=1;
                if(position==1)
                    z=2;
                if(position==2)
                    z=3;
                if(position==3)
                    z=4;
                if(position==4)
                    z=5;
                if(position==5)
                    z=6;
                if(position==6)
                    z=7;
                if(position==7)
                    z=8;


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s2=(Spinner)findViewById(R.id.sec2);
        adap2=ArrayAdapter.createFromResource(this,R.array.sec_names,android.R.layout.simple_spinner_item);
        adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adap2);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "Selected", Toast.LENGTH_LONG).show();

                if(position==0)
                    p=1;
                if(position==1)
                    p=2;
                if(position==2)
                    p=3;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void go(View v){
        Intent s=new Intent(Spintest.this,Routines.class);
        startActivity(s);

    }

}
