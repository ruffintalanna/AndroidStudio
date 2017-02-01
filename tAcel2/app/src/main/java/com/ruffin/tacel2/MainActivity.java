package com.ruffin.tacel2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

private SensorManager senSensorManager;
private Sensor senAccelerometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onSensorChanged(SensorEvent event){

    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy){

    }
}
