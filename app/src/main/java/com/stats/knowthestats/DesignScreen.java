package com.stats.knowthestats;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;

public class DesignScreen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private CardView safety,faq,realtimemap,liveupdate,bbcnews,cnaasianews,guardiannews,whovideos,
    whoadvice,whoguidance,whonews;
    private DrawerLayout drawer;
    AdView adView1,adView2;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_screen);

        drawer = findViewById(R.id.drawer_layout);
        whoadvice = findViewById(R.id.whoadvice);
        whoguidance= findViewById(R.id.whoguidance);
        whonews =findViewById(R.id.whonews);
        whovideos = findViewById(R.id.whovideos);
        safety = findViewById(R.id.safety);
        faq = findViewById(R.id.faq);
        realtimemap = findViewById(R.id.realtimemap);
        liveupdate = findViewById(R.id.liveupdate);
        bbcnews = findViewById(R.id.bbcnews);
        cnaasianews = findViewById(R.id.cnaasianews);
        guardiannews = findViewById(R.id.guardiannews);
        adView1 = findViewById(R.id.adView);



        MobileAds.initialize(this,"ca-app-pub-9901630207823377~3521334383");
        AdRequest adRequest = new AdRequest.Builder().build();

        adView1.loadAd(adRequest);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9901630207823377/6000351581");
        interstitialAd.loadAd(new AdRequest.Builder().build());



            safety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                }
                else{
                Intent intent = new Intent(getApplicationContext(),Saftey_tips.class);
                startActivity(intent);
            }}
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Faq.class);
                startActivity(intent);
            }
        });

        whovideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),WhoVideos.class);
                startActivity(intent);
            }
        });
        whonews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),WhoNews.class);
                startActivity(intent);
            }
        });
        whoguidance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),WhoGuidance.class);
                startActivity(intent);
            }
        });
        whoadvice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),WhoAdvice.class);
                startActivity(intent);
            }
        });


        realtimemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RealTimeMap.class);
                startActivity(intent);
            }
        });

        liveupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Live_Update.class);
                startActivity(intent);
            }
        });

        bbcnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bbc_news.class);
                startActivity(intent);
            }
        });

        cnaasianews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cna_AsiaNews.class);
                startActivity(intent);
            }
        });

        guardiannews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Guardian_news.class);
                startActivity(intent);
            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.ic_mail:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentMessage()).commit();

                break;
            case R.id.ic_world_news:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentNews()).commit();
             break;
            case R.id.ic_stats:
                Toast.makeText(this, "KnowTheStats", Toast.LENGTH_SHORT).show();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
