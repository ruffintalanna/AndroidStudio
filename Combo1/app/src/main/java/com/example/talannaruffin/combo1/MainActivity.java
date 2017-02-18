package com.example.talannaruffin.combo1;

import android.os.Handler;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.Viewport;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private TextView xText, yText, zText;
    private Sensor mySensor;
    private SensorManager SM;

    private Handler mHandler = new Handler();

    // to plot a line diagram
    private LineGraphSeries<DataPoint> series;
    private double lastXPoint = //2
    //
            {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        series = new LineGraphSeries<DataPoint>();

        // create sensor manager
        SM = (SensorManager) getSystemService(SENSOR_SERVICE);

        //Accelerator Sensor
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        //Assign TextView
        xText = (TextView) findViewById(R.id.xTest);
        yText = (TextView) findViewById(R.id.yText);
        zText = (TextView) findViewById(R.id.zText);

        //data
        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.addSeries(series);

        //customize viewport
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(10);
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setScalable(true);
        Viewport viewport = graph.getViewport();
        viewport.setYAxisBoundsManual(true);
        viewport.setMinY(0);
        viewport.setMaxY(10);
        viewport.setScrollable(true);


    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        xText.setText("X: " + event.values[0]);
        yText.setText("Y: " + event.values[1]);
        zText.setText("Z: " + event.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
