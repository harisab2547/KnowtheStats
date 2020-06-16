package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Faq extends AppCompatActivity {
    private WebView webView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);


            webView3 = (WebView) findViewById(R.id.webview3);
            webView3.setWebViewClient(new WebViewClient());
            webView3.loadUrl("https://www.cdc.gov/coronavirus/2019-ncov/faq.html");

            WebSettings webSettings = webView3.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if (webView3.canGoBack()) {
                webView3.goBack();
            } else {
                super.onBackPressed();

        }
    }
}
