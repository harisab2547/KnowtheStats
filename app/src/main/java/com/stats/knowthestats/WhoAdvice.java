package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WhoAdvice extends AppCompatActivity {

    WebView webView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_advice);


        webView8 = (WebView) findViewById(R.id.webView8);
        webView8.setWebViewClient(new WebViewClient());
        webView8.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/travel-advice");

        WebSettings webSettings = webView8.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView8.canGoBack()) {
            webView8.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
