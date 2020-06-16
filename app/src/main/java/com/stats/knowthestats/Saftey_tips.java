package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Saftey_tips extends AppCompatActivity {
    private WebView webView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saftey_tips);


            webView7 = (WebView) findViewById(R.id.webview7);
            webView7.setWebViewClient(new WebViewClient());
            webView7.loadUrl("https://www.cdc.gov/coronavirus/2019-ncov/prepare/prevention.html");

            WebSettings webSettings = webView7.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if (webView7.canGoBack()) {
                webView7.goBack();
            } else {
                super.onBackPressed();
            }
        }

}
