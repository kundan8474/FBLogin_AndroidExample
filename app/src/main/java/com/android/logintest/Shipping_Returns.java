package com.android.logintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by kkr on 07-06-2017.
 * this activity contains a webview and the view is loading a local html file which contains information.
 * this page shows shipping and returns conditions
 */

public class Shipping_Returns extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipping_returns);
        WebView webView=(WebView)findViewById(R.id.shipping_returnsWebView);
        webView.loadUrl("file:///android_asset/shippingNreturns.html");
        WebSettings webSettings=webView.getSettings();
        webSettings.getBuiltInZoomControls();
        webSettings.getTextZoom();
        webSettings.getAllowFileAccessFromFileURLs();
    }

}
