package com.example.tpsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"Starting application", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"Destroying application", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}