package com.ruffin.heart;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.sensor.heart_rate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SensorManager.getSensorList(Sensor.TYPE_HEART_RATE);
        setContentView(R.layout.activity_main);
    }
}
