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
        //gif.loadUrl("file:///android_res/drawable/search_mechanic.gif");
        gif.loadDataWithBaseURL(null, "<style>img{display: inline;height: auto;max-width: 100%;}</style>" +
                "<img src=\"file:///android_res/drawable/search_mechanic.gif\">", "text/html", "UTF-8", null);
    }
}
