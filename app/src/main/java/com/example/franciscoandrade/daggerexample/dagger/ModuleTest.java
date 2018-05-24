package com.example.franciscoandrade.daggerexample.dagger;

import com.example.franciscoandrade.daggerexample.Developer;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class ModuleTest {

    /**
     * @Names: Used to instantiate the same object in diffeerent ways, (Ex. different constructors)
     *
     */

    @Named("Francisco")
    @Singleton
    @Provides
    Developer providesDeveloper(){
        return new Developer("Francisco");
    }


    @Named("Isco")
    @Singleton
    @Provides
    public Developer providesDeveloperIsco(){
        return new Developer("Isco");
    };



}

