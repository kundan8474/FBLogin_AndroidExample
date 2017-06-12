package com.android.logintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by kkr on 07-06-2017.
 * this activity contains a webView and the view is loading a local html file which contains information.
 * this shows terms and condition of the Roborium
 */

public class TNC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.term_condition);
        WebView webView=(WebView)findViewById(R.id.tncWebView);
        webView.loadUrl("file:///android_asset/tnc.html");
        WebSettings webSettings=webView.getSettings();
        webSettings.getBuiltInZoomControls();
        webSettings.getTextZoom();
        webSettings.getAllowFileAccessFromFileURLs();
    }

}
