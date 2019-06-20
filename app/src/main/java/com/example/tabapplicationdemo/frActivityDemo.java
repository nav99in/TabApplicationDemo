package com.example.tabapplicationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tabapplicationdemo.ui.fractivitydemo.FrActivityDemoFragment;

public class frActivityDemo extends AppCompatActivity {
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fr_activity_demo_activity);
    b1=findViewById(R.id.b1);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FrActivityDemoFragment.newInstance())
                    .commitNow();

        }
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(frActivityDemo.this,ScrollingActivityDemo.class);
            startActivity(intent);
        }
    });
    }
}
