package com.enigma.java;

public class ArrayDataType {

    public static void main(String[] args) {

        String[] bootcamp;
        bootcamp = new String[3];

        bootcamp[0] = "Enigma Camp";
        bootcamp[1] = "EnigmaCamp";
        bootcamp[2] = "PT Enigma Cipta Humanika";

        System.out.println(bootcamp[0]);
        System.out.println(bootcamp[1]);
        System.out.println(bootcamp[2]);

        bootcamp[1] = "Enigma Camp";
        System.out.println(bootcamp[1]);

        // Array Initializer
        String[] languageProgramming = new String[] {
                "Java", "Kotlin", "JavaScript", "TypeScript", "Flutter"
        };

        System.out.println(languageProgramming[1]);

        // Array operation
        System.out.println(languageProgramming.length);

        // Array Two Dimension
        String[][] members = {
                {"Antony", "Jack", "Luchiba"},
                {"Tika", "Jution", "Abas"}
        };

        // get Jack
        System.out.println(members[0][1]);

        // get Abas
        System.out.println(members[1][2]);

    }
}
