package com.example.spiralworkstech.cloudflaresample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cloudflare.api.CFMobile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CFMobile.initialize(getApplicationContext(), "LdntozM46caZFbCm", new Runnable() {
            @Override
            public void run() {
                if (CFMobile.isInitialized()) {
                    Log.e("running...", "===");
                } else {
                    Log.e("not running...", "===");
                }
            }
        });
    }
}
