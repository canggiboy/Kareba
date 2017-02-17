package com.example.kareba.kareba;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
/**
 * Created by ikhsan on 11/02/17.
 */
public class spalshScreen extends AppCompatActivity{
   //set waktu lama splashscreen
    private static int splashInterval = 3000;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(spalshScreen.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscreen ke main activity dengan indent

                //jeda selesai splashscreen
                this.finish();
            }
            private void finish(){

            }
        }, splashInterval);
    };
}
