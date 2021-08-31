package com.enigma.java;

public class PrimitiveDataType {

    public static void main(String[] args) {

        // not primitive
        int age = 10;

        // primitive
        Integer age2 = 100;

        Integer age3 = null; // default value primitive

        // conversion
        Integer agePrimitive = age;
        int ageNotPrimitive = age2;

        Integer ageObject = 29;
        short thisSort = ageObject.shortValue();
        long  thisLong = ageObject.longValue();

        System.out.println(thisSort);

        // primitive have a function
        String fullName = "Jution Candra Kirana";
        fullName.length();
    }
}
