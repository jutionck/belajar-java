package com.enigma.java;

import com.enigma.java.oop.Block;
import com.enigma.java.oop.Car;
import com.enigma.java.oop.Rectangle;

public class Main {

    public static void main(String[] args) {

        // create Car object and fill car constructor
        //Car avanza = new Car("Black", 0, 2021);

        // call car method
        //avanza.fillFuel(10);
        //avanza.fillFuel(5);
        //avanza.engineStart();

        // print result
        //System.out.println(avanza);

        Rectangle rectangle = new Rectangle(6.0, 2.0);
        System.out.println(rectangle.print());
        System.out.println("Luas = " + rectangle.getSurface());
        System.out.println("Keliling = " + rectangle.getAround());

        Block block = new Block(6.0, 4.0, 3.0);
        System.out.println(block.getSurface());

        // Can use child parent when this child extends to parent
        Rectangle block1 = new Block(10.0, 7.0, 5.0);
        System.out.println(block1.getSurface());

        // this casting from Object class
        Object block2 = new Block(10.0, 7.0, 5.0);
        Object rectangle2 = new Rectangle(6.0, 2.0);

        // other casting from String to Integer (Non Primitive)
        String number  = "5";
        System.out.println(Integer.parseInt(number));

    }
}
