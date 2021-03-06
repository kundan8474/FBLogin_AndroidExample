package com.android.logintest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by kkr on 07-06-2017.
 * this activity contains a webView and the view is loading a local html file which contains information.
 * this shows about of Roborium
 */

public class AboutUs extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        WebView webView=(WebView)findViewById(R.id.aboutUsWebView);
        webView.loadUrl("file:///android_asset/AboutUs.html");
        WebSettings webSettings=webView.getSettings();
        webSettings.getBuiltInZoomControls();
        webSettings.getTextZoom();
        webSettings.getAllowFileAccessFromFileURLs();
    }
}
