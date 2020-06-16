package com.stats.knowthestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WhoVideos extends AppCompatActivity {

    WebView webView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_videos);

        webView11 = (WebView) findViewById(R.id.webView11);
        webView11.setWebViewClient(new WebViewClient());
        webView11.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/videos");

        WebSettings webSettings = webView11.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView11.canGoBack()) {
            webView11.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
