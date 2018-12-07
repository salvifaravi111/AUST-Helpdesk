package com.example.ezio.myapplication;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.GregorianCalendar;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        Intent calIntent = new Intent(Intent.ACTION_INSERT);
        calIntent.setType("vnd.android.cursor.item/event");
        calIntent.putExtra(CalendarContract.Events.TITLE, "Quiz");
        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "AUST");
        QSchedule q=new QSchedule();
        calIntent.putExtra(CalendarContract.Events.DESCRIPTION ,q.info);

        Setdate sd=new Setdate();
        GregorianCalendar calDate = new GregorianCalendar(sd.year,sd.mon,sd.day);
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                calDate.getTimeInMillis());
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                calDate.getTimeInMillis());

        startActivity(calIntent);



    }




}
