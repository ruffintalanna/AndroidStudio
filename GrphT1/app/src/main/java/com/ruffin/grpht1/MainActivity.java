package com.ruffin.grpht1;

import android.icu.lang.UCharacter;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();
    private LineGraphSeries<DataPoint> series;
    private double lastXPoint = 2;
    private Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<>(new DataPoint[]{
               new DataPoint(0, 1),
               new DataPoint(1, 3),
               new DataPoint(2, 2)
        });
        graph.addSeries(series);

        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(10);
        graph.getViewport().setXAxisBoundsManual(true);

        graph.getViewport().setScalable(true);

        addRandomDataPoint();

    }
    private void addRandomDataPoint(){
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lastXPoint+=0.5d;
                series.appendData(new DataPoint(lastXPoint, rnd.nextInt(10)), false, 100);
                addRandomDataPoint();
            }
        }, 1000);

    }
}

