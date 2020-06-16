package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RealTimeMap extends AppCompatActivity {
    private WebView webView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_time_map);


            webView6 = (WebView) findViewById(R.id.webview6);
            webView6.setWebViewClient(new WebViewClient());
            webView6.loadUrl("https://coronavirus.jhu.edu/map.html");

            WebSettings webSettings = webView6.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if (webView6.canGoBack()) {
                webView6.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }

