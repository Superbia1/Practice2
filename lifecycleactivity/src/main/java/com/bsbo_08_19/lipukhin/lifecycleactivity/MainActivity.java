package com.bsbo_08_19.lipukhin.lifecycleactivity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","CREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "START");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "STOP");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "PAUSE");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "DESTROY");
    }
}