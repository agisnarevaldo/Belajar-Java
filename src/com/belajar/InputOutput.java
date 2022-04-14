package com.belajar;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //Deklarasi Variabel
        String nama, alamat;
        int usia;

        // membuat scaner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilan ke user
        System.out.println("##---Masukan Data Diri Anda");
        System.out.print("Nama: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();

        //output
        System.out.println("Nama Saya adalah " + nama);
    }
}
