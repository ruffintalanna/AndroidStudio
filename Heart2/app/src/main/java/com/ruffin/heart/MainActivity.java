package com.ruffin.heart;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSensorChanged(SensorEvent event){
        String TAG="tag";
        Log.i(TAG, "--------------------");
        String msg;
        Log.i(TAG, msg);
        Log.i(TAG,""+event.sensor.getType());
        Log.i("Live","----------");
    }
}