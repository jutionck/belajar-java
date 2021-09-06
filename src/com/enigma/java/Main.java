package com.enigma.java;

import com.enigma.java.oop.Car;

public class Main {

    public static void main(String[] args) {

        Car avanza = new Car();
        Car jazz = new Car();

        avanza.color = "Red";
        avanza.fuel = 10;
        avanza.year = 2021;


        jazz.color = "Black";
        jazz.fuel = 20;
        jazz.year = 2019;

        System.out.println(avanza);
        System.out.println(jazz);

    }
}
