package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NavRealTimeMap extends AppCompatActivity {
WebView webView112;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_real_time_map);

        webView112 = (WebView) findViewById(R.id.webview112);
        webView112.setWebViewClient(new WebViewClient());
        webView112.loadUrl("https://coronavirus.jhu.edu/map.html");

        WebSettings webSettings = webView112.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView112.canGoBack()) {
            webView112.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }
