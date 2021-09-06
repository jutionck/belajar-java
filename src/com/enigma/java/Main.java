package com.enigma.java;

import com.enigma.java.oop.Car;

public class Main {

    public static void main(String[] args) {

        // create Car object and fill car constructor
        Car avanza = new Car("Black", 0, 2021);

        // call car method
        avanza.fillFuel(10);
        avanza.fillFuel(5);
        avanza.engineStart();

        // print result
        System.out.println(avanza);

    }
}
