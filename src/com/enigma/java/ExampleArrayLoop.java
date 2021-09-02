package com.enigma.java;

public class ExampleArrayLoop {

    public static void main(String[] args) {

        /**
         * Perulangan array itu bisa menggunakan for dan/atau foreach
         * Jika menggunakan for kita bisa tau dia index nya dan item/ele nya
         * Jika menggunakan forEach kita bisa langsung cetak item/elementnya
         * forEach  (biasanya jika memang yang di butuhkan hanya cetak element/item)
         */

        String[] members = new String[5];
        members[0] = "Jack";
        members[1] = "Sparrow";
        members[2] = "Lina";
        members[3] = "Topic";
        members[4] = "Tika";

        // forEach
        int index = 0;
        for (String item : members) {
            System.out.println("Member ke-" + index + " " + item);
            index++;
        }

        // for
        for (int i = 0; i < members.length; i++) {
            System.out.println("Member ke-" + i + " " + members[i]);
        }

        /**
         * Buatlah sebuah variabel array dengan nama languageProgramming yang dapat menyimpan 5 data
         * Data yang di masukkan berasal dari inputan
         */

        String[] languageProgramming = new String[5];

        // Sanner
        // for
            // inputan

        // cetak hasil dari inputan

    }
}
