package com.belajar;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        String grade;
        try (Scanner scan = new Scanner(System.in)) {
            //mengambil inputan
            System.out.println("Masukan Nilai : ");
            grade = scan.nextLine();
        }

        //menghitung grade
        switch (grade) {
            case "A" :
                System.out.println("Anda Lulus Dengan Sempurna");
                break;
            case "B" :
                System.out.println("Anda Lulus dengan baik");
                break;
            case "C" :
                System.out.println("Maaf Anda Belum Lulus");
                break;
            default :
                System.out.println("Sepertinya Anda Salah Jurusan");
        }
    }
}
