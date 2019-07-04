package com.ttyt.xxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    private static final String TAG = "activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        Log.i(TAG, "onCreate: A");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: A");
    }

    public void clickABtn(View view){
        startActivity(new Intent(this,ActivityB.class));
    }
}
