package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WhoNews extends AppCompatActivity {

    WebView webView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_news);

        webView10 = (WebView) findViewById(R.id.webView10);
        webView10.setWebViewClient(new WebViewClient());
        webView10.loadUrl("https://www.who.int/news-room/releases");

        WebSettings webSettings = webView10.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView10.canGoBack()) {
            webView10.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }

