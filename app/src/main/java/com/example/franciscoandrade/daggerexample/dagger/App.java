package com.example.franciscoandrade.daggerexample.dagger;

import android.app.Application;

public class App extends Application {

    private ComponentTest componentTest;
    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();


        app=this;
        componentTest = DaggerComponentTest.builder()
                .moduleTest(new ModuleTest())
                .build();

    }


    public ComponentTest getComponentTest() {
        return componentTest;
    }

    public static App getApp() {
        return app;
    }
}
