package com.ttyt.xxx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    private static final String TAG = "activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.i(TAG, "onCreate: B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: B");
    }
}
