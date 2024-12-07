package com.contoh;

import java.util.Scanner;

public class Park {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        

        int kodeKendaraan = input.nextInt();
        int waktuParkir = input.nextInt();
        int uang = input.nextInt();
        int biaya = 0;
        int kembalian;

        switch (kodeKendaraan) {
            case 1: //motor
                biaya = 2000 * waktuParkir;
                break;
            case 2://mobil
                biaya = 4000 * waktuParkir;
                break;
            case 3: //truk
                biaya = 9000 * waktuParkir;
                break;
        
            default:
                break;
        }
        kembalian = uang - biaya;

       if(biaya == uang) {
         System.out.println("uang pas");
       }else if(uang > biaya){
    
        System.out.println("uang kembalian : " + kembalian);
       }else{
        System.out.println("uang tidak cukup");
       }
    }
}
