package com.example.ezio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        String url ="https://www.google.com.bd/maps/place/Ahsanullah+University+of+Science+and+Technology/@23.7637787,90.4044556,17z/data=!3m1!4b1!4m2!3m1!1s0x3755c77decb5f845:0xc2eadd2f3b867792?hl=en/";

        WebView view=(WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
