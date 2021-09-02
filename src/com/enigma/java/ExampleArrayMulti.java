package com.enigma.java;

import java.util.Scanner;

public class ExampleArrayMulti {

    public static void main(String[] args) {

        /**
         * Saya ingin menampung sebuah data customer yang isinya ada nama dan no telp
         * Nama dan no telp tersebut di isi melalui inputan
         * Jumlah yang dapat di tampung adalah sebanyak customers[3][2]
         */

        Scanner scanner = new Scanner(System.in);
        String[][] customers = new String[3][2];

        for(int baris=0; baris < customers.length; baris++){
            for (int kolom = 0; kolom < customers[baris].length; kolom++) {
                customers[baris][kolom] = scanner.nextLine();
            }
        }

        System.out.println("=======================================");

        for(int baris=0; baris< customers.length; baris++){
            for (int kolom = 0; kolom < customers[baris].length; kolom++) {
                System.out.printf(" %s ", customers[baris][kolom]);
            }
            System.out.println();
        }
    }
}
