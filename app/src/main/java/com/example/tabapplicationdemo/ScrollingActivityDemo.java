package com.example.tabapplicationdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class ScrollingActivityDemo extends AppCompatActivity {
    WebView simpleWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        simpleWebView=findViewById(R.id.simpleWebView);
        // define static html text
        String customHtml = "<html><body><h2>1. EAT FRUITS and VEGGIES</h2>" +
                "<p>Eating fruits and vegetables are of great help to human body.Loading on fruits and veggies will help you get a glowing skin.\n\n</p>" +
                "<h2>2. STAY HYDRATED</h2>" +
                "<p>Again staying hydrated is very important for your health.Drinking plenty of water helps your akin to stay hydrated and flush out toxins.\n\n</p>" +
                "<h2>3. SIP ON SOME TEA</h2>" +
                "<p>We are all aware of the benefits of green tea.Sipping some green tea will help your skin in many ways.\n\n</p>" +
                "<h2>4. MUNCH ON NUTS</h2>" +
                "<p>Eat nuts for a better improvement in skin condition.\n\n</p>" +
                "<h2>5. EXERCISE</h2>" +
                "<p>Modern doctors advise exercising to keep your muscles and joints healthy and toned, while helping you sweat out toxins. Exercise will also improve blood circulation, digestion, and give you a healthy blush!\n\n\n</p>" +
                "<h2>6. STAY STRESS FREE</h2>" +
                "<p>Stress is not good for you.Always try to stay stress free for a beautiful mind peace and healthy skin.\n\n</p>" +
                "<h2>7. MOISTURIZER TO RESCUE</h2>" +
                "<p>Always use moisturizer while stepping out from home to keep tan at bay and also use moisturizer at night for a well hydrated skin.\n\n</p>" +
                "</body></html>";

        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


    }
}
