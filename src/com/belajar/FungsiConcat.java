package com.belajar;

public class FungsiConcat {
    public static void main(String[] args) {
        String namaDepan = "Agisna";
        String namaBelakang = " Revaldo";

        String namaLengkap = namaDepan.concat(namaBelakang);
        System.out.println("Nama Lengkap : " + namaLengkap);
    }
}
