package com.belajar;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int tambah, kurang, kali, bagi, modulus;

        angka1 = 10;
        angka2 = 5;

        tambah = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + tambah);

        kurang = angka1 - angka2;
        System.out.println(kurang);

        kali = angka1 * angka2;
        System.out.println(kali);

        bagi = angka1 / angka2;
        System.out.println(bagi);

        modulus = angka1 % angka2;
        System.out.println(modulus);
        
    }
}
