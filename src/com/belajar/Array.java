package com.belajar;

public class Array{
    public static void main(String[] args) {
        String[] mahasiswa = {
            "Andi" , "Budi" , "Ucup", "Otong"
        };

        // Menampilkan isi Array cara ke- 1
        for(int i = 0; i < mahasiswa.length; i++){
            System.out.println(i + mahasiswa[i]);
        }

        System.out.println("------------->");

        // Menampilkan isi array cara ke-2
        for(String x : mahasiswa){
            System.out.println(x);
        }
        
        System.out.println("<==============>");

        String[][] manusia = {
            { "Miya", "Tasik" },
            { "Zilong", "Depok"},
            { "Balmond", "Batak"}
        };
        for(int x = 0; x < manusia.length; x++){
            System.out.println("Nama : " + manusia[x][0] + ", Alamat : " + manusia[x][1]);
            System.out.println("\n<====================>");
            
            // for(int y = 0; y < manusia[x].length; y++){
            //     System.out.println("\n<====================>");
                
            //     System.out.println(manusia[x][y]);
            // }
        }
    }
}