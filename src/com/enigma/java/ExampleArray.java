package com.enigma.java;

public class ExampleArray {

    public static void main(String[] args) {

        /**
         * Di java, ada 2 cara untuk menuliskan sebuah array
         */

        // Cara pertama
//        String[] members = new String[3]; // 0 1 2
//
//        // Mengisi sebuah array members
//        members[0] = "Jack";
//        members[1] = "Sparrow";
//        members[2] = "Lina";
//
//        System.out.println(members[0]);
//        System.out.println(members[1]);
//        System.out.println(members[2]);
//
//        System.out.println("Isi ulang members[0]");
//        members[0] = "Dila";
//
//        System.out.println(members[0]);

        // members[3] = "Tono"; // Array index of range -> karena yang disiapkan hanya 3
        // System.out.println(members[3]);

        // Cara kedua
        // String anotherMembers[] = new String[3];

//        String[] country = new String[5]; // panjangnya (5) atau index ? / element ? 0,1,2,3,4 = 5
//
//        country[4] = "Amerika";
//        System.out.println(country[0]);
//        System.out.println(country[1]);
//        System.out.println(country[2]);
//        System.out.println(country[3]);
//        System.out.println(country[4]);
//        System.out.println(country.length);

        /**
         * Array Mutidimensi [row][col] -> hanya bisa 1 jenis tipe data
         */
        // customer -> Nama & No Telp
        // Adil | 0721
        String[][] customers = new String[3][2]; // baris = 3 | kolom = 2
        customers[0][0] = "Adil";
        customers[0][1] = "0721";

        System.out.println(customers[0][0] + " " + customers[0][1]);

        customers[2][0] = "Annisa";
        customers[2][1] = "2829220";

        System.out.println(customers[2][0] + " " + customers[2][1]);

        String[][] anotherCustomers = {
                {"Adil", "0721"},
                {"Annisa", "2829220"}
        };


        // Jawabannya adalah BENAR

    }
}
