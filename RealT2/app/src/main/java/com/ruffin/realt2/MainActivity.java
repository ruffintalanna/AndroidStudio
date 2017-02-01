package com.ruffin.realt2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements SensorEventListener, OnClickListener {
    private Button btnStart, btnStop, btnUpload;
    private LinearLayout layout;


   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       btnStart = (Button) findViewById(R.id.btnStart);
       btnStop = (Button) findViewById(R.id.btnStop);
       btnUpload = (Button) findViewById(R.id.btnUpload);
       btnStart.setOnClickListener(this);
       btnStop.setOnClickListener(this);
       btnUpload.setOnClickListener(this);
       btnStart.setEnabled(true);
       btnStop.setEnabled(false);

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        public void onStart() {
        super.onStart();

    }

        public void onStop(); {
        super.onStop();

    }
}}
