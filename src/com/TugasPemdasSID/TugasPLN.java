package com.TugasPemdasSID;

import java.util.Scanner;

public class TugasPLN {
    public static void main(String[] args) {

        Scanner sysin = new Scanner(System.in);
        //variabel yang akan dipakai
        String nama;
        long awalmtr;
        long akhirmtr;
        int biaya = 140;
        float ppn = 0.1f;
        double total;

        //input 
        nama = sysin.next();
        awalmtr = sysin.nextLong();
        akhirmtr = sysin.nextLong();
        
        //penghitungan biaya
        long terpakai = akhirmtr - awalmtr;
        long biayaListrik = terpakai * biaya;
        double biayaPPN = biayaListrik * ppn;
        total = biayaListrik + biayaPPN;

        //output 
        System.out.println("==========================================================");
        System.out.printf("%-25s %s %n", "Nama","saya", nama);
        System.out.printf("%-25s: %s %n", "Awal khw Meteran", awalmtr);
        System.out.printf("%-25s: %s %n", "Akhir khw Meteran", akhirmtr);
        System.out.printf("%-25s: %s %n", "Biaya sebelum PPN", biayaListrik);
        System.out.printf("%-25s: %s %n", "PPN", "10%");
        System.out.printf("%-25s: %s %n", "Biaya PPN", biayaPPN);
        System.out.printf("%-25s: %s %n", "Total", total);
        System.out.printf("%s","halo tes" );

        System.out.println( "Nama saya: \t\t\t "+ nama);


        sysin.close();


    }
}
