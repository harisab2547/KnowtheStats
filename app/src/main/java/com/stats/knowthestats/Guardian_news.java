package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Guardian_news extends AppCompatActivity {
    private WebView webView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardian_news);


            webView4 = (WebView) findViewById(R.id.webview4);
            webView4.setWebViewClient(new WebViewClient());
            webView4.loadUrl("https://www.theguardian.com/world/2020/mar/21/coronavirus-uk-panic-buyers-urged-to-think-of-frontline-workers");

            WebSettings webSettings = webView4.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if (webView4.canGoBack()) {
                webView4.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }

