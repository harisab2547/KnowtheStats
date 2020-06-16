package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Bbc_news extends AppCompatActivity {
    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbc_news);


            webView1 = (WebView) findViewById(R.id.webview1);
            webView1.setWebViewClient(new WebViewClient());
            webView1.loadUrl("https://www.bbc.com/news/health-51981099");

            WebSettings webSettings = webView1.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if (webView1.canGoBack()) {
                webView1.goBack();
            } else {
                super.onBackPressed();

        }
    }
}
