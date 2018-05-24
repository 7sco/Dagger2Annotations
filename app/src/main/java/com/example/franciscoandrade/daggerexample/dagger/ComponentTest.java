package com.example.franciscoandrade.daggerexample.dagger;


import com.example.franciscoandrade.daggerexample.MainActivity;

import dagger.Component;

@Component(modules = {ModuleTest.class})
public interface ComponentTest {

    void inject(MainActivity mainActivity);
}
