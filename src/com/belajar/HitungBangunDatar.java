package com.belajar;

class Persegi{
    int sisi;

    int hitungKeliling(){
        return 4 * sisi;
    }

    int hitungLuas(){
        return sisi * sisi;
    }

}

class PersgiPanjang{
    int panjang = 10;
    int lebar = 5;

    int hitungKeliling(){
        return (2 * panjang) + (2 * lebar);
    }

    int hitungLuas(){
        return panjang * lebar;
    }
}

public class HitungBangunDatar {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 8;
        
        System.out.println("Keliling Persegi = " + persegi1.hitungKeliling());
        System.out.println("Luas Persegi = " + persegi1.hitungLuas());

        PersgiPanjang persgiPanjang = new PersgiPanjang();
        
        System.out.println("Keliling Persegi panjang = " + persgiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang = " + persgiPanjang.hitungLuas());
    }
}
