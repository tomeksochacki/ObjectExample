package com.example;

public class Car {
    private Engine engine;
    private SteeringWheel steeringWheel;

    public Car(){
        System.out.println("Wywołany został konstruktor 'Car'.");
        this.engine = new Engine();
        this.steeringWheel = new SteeringWheel();
    }
}
