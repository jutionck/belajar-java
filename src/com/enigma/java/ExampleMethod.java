package com.enigma.java;

public class ExampleMethod {

//    static void greetings() {
//        System.out.println("Halo, salam kenal saya dari Indonesia");
//    }

//    static void greetings(String name, int age) {
//        System.out.println("Halo saya " + name + ", " + "umur saya adalah " + age + " tahun");
//    }

    static String greetings(String name, int age) {
        return "Halo saya " + name + ", " + "umur saya adalah " + age + " tahun";
    };

    static int calculate(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        return result;
    }

    /**
     * Kita sebelum nya sudah membuat sebuah method calculate
     * Permasalahannya adalah, dia hanya menerima 1 operasi yaitu add (+)
     * Nah saya mau method ini dinamis dia bisa menerima beberapa operasi aritmatika
     * => + - / * %
     * Hint: gunakan switch case
     */

    public static void main(String[] args) {
        String print = greetings("Tika", 17);
        System.out.println(print);

        int result = calculate(100, 200);
        System.out.println(result);

        /**
         * Method di java, kalo di bahasa pemrograman lain disebut juga sebuah function
         * Di java sebutan boleh Method atau function
         * Method yang sudah kita gunakan : 1.main; 2.print,println, printf; 3.length
         * Yang didalam kurung ( ? ) -> itu disebut sebagai parameter / argumen
         * Di java maupun di bhs pem lain, param/args bisa ada, 1 atau lebih
         * Fungsi method ? -> block scope -> memudahkan, memisahkan bagian-bagian agar script tidak terlalu
         * banyak
         * Clean Code -> di bahas lebih jauh di OOP
         * Di method juga ada 2 tipe, tipe 1 dia tidak mengembalikan (return) apa-apa (value) => void
         * Tipe kedua yang ada return value, ciri khas nya ? ada tipeData sebelum nama method nya.
         * Cara pemanggilan: cukup panggil nama method nya luasKotak -> luastKotak();
         * static -> tidak perlu membuat sebuah instance class nya
         * static -> dipanggil di dalam scope static juga
         * Tapi kalo tidak ada static ? di harus instance class nya dulu baru kepanggil method nya (OOP)
         */

    }
}
