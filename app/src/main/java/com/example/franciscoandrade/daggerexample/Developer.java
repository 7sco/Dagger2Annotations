package com.example.franciscoandrade.daggerexample;

public class Developer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
