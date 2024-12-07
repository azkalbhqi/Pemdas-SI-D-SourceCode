package com.TugasPemdasSID;
import java.util.Scanner;

public class TugasCondition {
    public static void main(String[] args) {
        Scanner sysin = new Scanner(System.in);

        // Input hari
        int hari = sysin.nextInt();

        //Input Bulan
        int bulan = sysin.nextInt();

        //Input tahun
        int tahun = sysin.nextInt();

        // valid bulan
        boolean isBulanValid = (bulan >= 1 && bulan <= 12);

        // kabisat
        boolean kabisat = (tahun % 4 == 0 );

        // valid hari
        boolean isHariValid = false;

        // bulan feb kabisat
        if (bulan == 2) {
            if (kabisat) {
                isHariValid = (hari >= 1 && hari <= 29); 
            } else {
                isHariValid = (hari >= 1 && hari <= 28); 
            }
        } 
        // bulan 31
        else if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {
            isHariValid = (hari >= 1 && hari <= 31);
        } 
        // bulan 30
        else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            isHariValid = (hari >= 1 && hari <= 30);
        }

        // umur
        int umur = 2024 - tahun;

        // validasi
        boolean isValid = (isHariValid && isBulanValid);

        // Output
        if (isValid) {
            System.out.println("Data Valid");
            System.out.println("Umur: " + umur);
            
            if (umur < 17) {
                System.out.println("Kategori: Anak-anak");
            } else if (umur >= 17 && umur <= 25) {
                System.out.println("Kategori: Remaja");
            } else {
                System.out.println("Kategori: Dewasa");
            }
        } else {
            System.out.println("Data Tidak Valid");
        }
        
        sysin.close();
    }
}
