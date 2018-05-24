package com.example.franciscoandrade.daggerexample.dagger;


import com.example.franciscoandrade.daggerexample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ModuleTest.class)
public interface ComponentTest {

    void inject(MainActivity mainActivity);
}
