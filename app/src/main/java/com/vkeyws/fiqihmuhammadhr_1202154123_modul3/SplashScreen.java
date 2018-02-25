package com.vkeyws.fiqihmuhammadhr_1202154123_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    //memberikan waktu splashscreen 3 detik=3000
    private static final int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //membuat method delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //transisi ke menu login
                Intent intent = new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
                //menutup activity splaschscreen
                SplashScreen.this.finish();
                //memberikan pesan pop up/toast
                Toast toast = Toast.makeText(SplashScreen.this, "Welcome", Toast.LENGTH_LONG);
                toast.show();
            }
        }, SPLASH_TIME);
    }
}
