package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {
    ImageView logo,bgImage;
    TextView logoName;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo = findViewById(R.id.logo);
        bgImage = findViewById(R.id.bgimg);
        logoName = findViewById(R.id.logotext);
        lottieAnimationView = findViewById(R.id.lottie);

//        bgImage.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
//        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
//        logoName.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
//        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                bgImage.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
                Intent mainIntend = new Intent(SplashScreen.this,Login.class);
                SplashScreen.this.startActivity(mainIntend);
                SplashScreen.this.finish();
            }
        },3500);


    }
}