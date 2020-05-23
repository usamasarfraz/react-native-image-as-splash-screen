package com.livedcast; // ← Make sure that is your package name

import android.content.Intent;
import android.os.Bundle;

import com.facebook.react.ReactActivity;
/**
 * Created by usama on 23/05/2020.
 */

public class SplashActivity extends ReactActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}