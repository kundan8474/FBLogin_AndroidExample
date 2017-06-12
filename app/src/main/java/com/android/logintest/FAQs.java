package com.android.logintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by kkr on 07-06-2017.
 * this activity contains a webView and the view is loading a local html file which contains information.
 * this shows FAQs
 */

public class FAQs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        WebView webView=(WebView)findViewById(R.id.faqWebView);
        webView.loadUrl("file:///android_asset/faq.html");
        WebSettings webSettings=webView.getSettings();
        webSettings.getBuiltInZoomControls();
        webSettings.getTextZoom();
        webSettings.getAllowFileAccessFromFileURLs();
    }

}
