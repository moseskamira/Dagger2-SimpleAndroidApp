package com.team295.dagger2android.model;

import javax.inject.Inject;

public class Car {

    private Wheel wheel;
    private Engine engine;

    @Inject
    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public String drive() {
        return "I am Driving";

    }
}
