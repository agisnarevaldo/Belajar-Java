package com.belajar;

public class OperatorPembanding {
    public static void main(String[] args) {
        int angka1 = 12;
        int angka2 = 4;
        boolean hasil;

        // apakah Angka1 lebih besar dari angka2?
        hasil = angka1 > angka2;
        System.out.println(hasil);

        // apakah Angka1 lebih kecil dari angka2?
        hasil = angka1 < angka2;
        System.out.println(hasil);

        // apakah Angka1 lebih besar samadengan angka2?
        hasil = angka1 >= angka2;
        System.out.println(hasil);

        // apakah Angka1 lebih kecil samadengan angka2?
        hasil = angka1 <= angka2;
        System.out.println(hasil);

        // apakah nilai Angka1 sama dengan angka2?
        hasil = angka1 == angka2;
        System.out.println(hasil);

        // apakah nilai Angka1 tidak samadengan angka2?
        hasil = angka1 != angka2;
        System.out.println(hasil);
    }
}
