package com.projectbengkel.projectbengkel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class searchmechanic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchmechanic);
        WebView gif = (WebView) findViewById(R.id.loading_gif);
        gif.loadUrl("file:///res/drawable/search_mechanic.gif");
    }
}
