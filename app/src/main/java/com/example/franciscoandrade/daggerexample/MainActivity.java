package com.example.franciscoandrade.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.example.franciscoandrade.daggerexample.dagger.App;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= MainActivity.class.getSimpleName();

    /**
     * In the activity we specify the one we want to inject
     */

    @Named("Francisco")
    @Inject
    Developer developerFrsncisco;

    @Named("Isco")
    @Inject
    Developer developerIsco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //If we do not make App static, and no app getter method
        //((App) getApplication()).getComponentTest().inject(this);

        //Used when App is tatic with a getter method
        App.getApp().getComponentTest().inject(this);

        Log.d(TAG, "onCreate: "+developerFrsncisco);
        Log.d(TAG, "onCreate: "+developerIsco);
    }
}
