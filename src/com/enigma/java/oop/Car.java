package com.enigma.java.oop;

public class Car {

    public String color;
    public Integer fuel;
    public Integer year;

    public Car(String color, Integer fuel, Integer year) {
        this.color = color;
        this.fuel = fuel;
        this.year = year;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuel=" + fuel +
                ", year=" + year +
                '}';
    }
}
