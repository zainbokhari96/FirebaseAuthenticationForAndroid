package com.example.beebugsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;

    Animation top_animation;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        logo =(ImageView)findViewById(R.id.imageView2);

        logo.setAnimation(top_animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this,ChooseAuthenticationType.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}