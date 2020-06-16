package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NavNews extends AppCompatActivity {

    WebView webView111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_news);

        webView111 = (WebView) findViewById(R.id.webview111);
        webView111.setWebViewClient(new WebViewClient());
        webView111.loadUrl("https://www.who.int/news-room/releases");

        WebSettings webSettings = webView111.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView111.canGoBack()) {
            webView111.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }
