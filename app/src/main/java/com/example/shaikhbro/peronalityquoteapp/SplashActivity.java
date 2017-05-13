package com.example.shaikhbro.peronalityquoteapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {
    private final static long SPLASH_TIME_OUT = 3000;
    protected Animation fadeIn;
    protected ImageView img1;

    // handler for splash screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        img1 = (ImageView)findViewById(R.id.splashScreen);
        img1.setVisibility(View.VISIBLE);
        img1.startAnimation(fadeIn);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainMenu = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainMenu);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
