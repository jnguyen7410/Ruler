package com.nguyeningcode.jnguyen7410.ruler;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
         * Not sure if I need this here. Will probably remove this when I find out.
         */

        //get the list of sensors on the phone and try to grab the accelerometer
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = mSensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);

        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null){
            // Success! There's an accelerometer.
            mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        }
        else {
            // Failure! No accelerometer.
            // Display a message here stating that you need an accelerometer for this to work
        }
        //from here, try to initialize the accelerometer and use it

        /*
         * TODO: Use the accelerometer to calculate the distance based on device measurement and the acceleration of the device
         */

    }

}
