package com.example;

public class Engine {

    private Cooler cooler;
    private SparkPlug sparkPlug;

    public Engine(){
        System.out.println("Wywyłany został konsturktor 'Engine'");
        this.cooler = new Cooler();
        this.sparkPlug = new SparkPlug();
    }
}
