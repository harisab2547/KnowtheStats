package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WhoGuidance extends AppCompatActivity {

    WebView webView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_guidance);

        webView9 = (WebView) findViewById(R.id.webView9);
        webView9.setWebViewClient(new WebViewClient());
        webView9.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/technical-guidance");

        WebSettings webSettings = webView9.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView9.canGoBack()) {
            webView9.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }

