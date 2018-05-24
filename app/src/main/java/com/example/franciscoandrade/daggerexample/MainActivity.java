package com.example.franciscoandrade.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.franciscoandrade.daggerexample.dagger.App;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Developer developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //If we do not make App static, and no app getter method
        //((App) getApplication()).getComponentTest().inject(this);

        //Used when App is tatic with a getter method
        App.getApp().getComponentTest().inject(this);
    }
}
