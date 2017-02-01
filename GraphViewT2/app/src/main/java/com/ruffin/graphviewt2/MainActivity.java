package com.ruffin.graphviewt2;

import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;
    // declared datapoint, and called it series

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double y, x;
        // declared variables
        x = -5.0;
        //where x will start, -5 will be the first value

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i < 500; i++) {
            // make a loop, to loop through all the data points
            x = x + 0.1;
            y = Math.sin(x);
            //at y, you are free to choose any function
            series.appendData(new DataPoint(x, y), true, 500);
            // the 500 represents the amount of datapoints in the series,
            // it has to match the first 500, so that you get the right amount of datapoints
        }
        graph.addSeries(series);


    }
    }

