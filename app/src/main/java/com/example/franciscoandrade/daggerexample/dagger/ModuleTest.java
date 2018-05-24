package com.example.franciscoandrade.daggerexample.dagger;

import com.example.franciscoandrade.daggerexample.Developer;

import dagger.Module;
import dagger.Provides;


@Module
public class ModuleTest {

    @Provides
    public Developer providesDeveloper(){
        return new Developer("Francisco");
    };
}
