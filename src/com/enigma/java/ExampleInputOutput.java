package com.enigma.java;

import java.io.*;
import java.util.Scanner;

public class ExampleInputOutput {

    public static void main(String[] args) throws IOException {


        // using scanner
//        Scanner scanner = new Scanner(System.in); // mengambil inputan dari user (keyboard)
//        System.out.println("Biodata Mahasiswa");
//
//        System.out.print("Masukkan Nama Anda = ");
//        String name = scanner.nextLine();
//        System.out.print("Masukkan Umur Anda = ");
//        int age = scanner.nextInt();
//        System.out.printf("Nama saya adalah " + name + " dan umur saya " + age + " tahun");


        // using BufferedReader
        // Dalam implementasinya BufferedReader tidak dapat berjalan sendiri.
        // Untuk mendapatkan input dibutuhkan kelas InputStreamReader.
//        InputStreamReader streamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(streamReader);
//        System.out.println("Biodata Mahasiswa");
//        try {
//            System.out.print("Masukan Nama Anda : ");
//            String name =  bufferedReader.readLine();
//            System.out.print("Masukan Umur Anda : ");
//            int age = Integer.parseInt(bufferedReader.readLine());
//            System.out.printf("Nama saya adalah " + name + " dan umur saya " + age + " tahun");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Buffered Read File
        BufferedReader objReader = null;
        String strCurrentLine;
        objReader = new BufferedReader(new FileReader("src/com/enigma/java/Customer.txt"));
        while ((strCurrentLine = objReader.readLine()) != null) {
            System.out.println(strCurrentLine);
        }
        objReader.close();
    }
}
