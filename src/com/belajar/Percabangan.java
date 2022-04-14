package com.belajar;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        //membuat variabel belanja dan scsanner
        String nama;
        int nilai;

        Scanner inputNama = new Scanner(System.in);
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        nama = inputNama.nextLine();
        System.out.print("Masukan Nilai : ");
        nilai = inputNilai.nextInt();

        if (nilai >= 75){
            System.out.println("Selamat " + nama + " Anda lulus");
        } else {
            System.out.println("Anda Belum Lulus");
        }
    }
}
