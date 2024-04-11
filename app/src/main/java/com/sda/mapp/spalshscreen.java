package com.sda.mapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class spalshscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalshscreen);
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent i=new Intent(spalshscreen.this,MainActivity.class);
                 startActivity(i);
                 finish();
             }
         },3000);

    }
}