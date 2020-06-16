package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Live_Update extends AppCompatActivity {
    private WebView webView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live__update);

            webView5 = (WebView) findViewById(R.id.webview5);
            webView5.setWebViewClient(new WebViewClient());
            webView5.loadUrl("https://www.worldometers.info/coronavirus/#countries");

            WebSettings webSettings = webView5.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if (webView5.canGoBack()) {
                webView5.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }
