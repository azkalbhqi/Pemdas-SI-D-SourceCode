package com.utp;
import java.util.*;
/* 
NAMA    : AZKAL BAIHAQI PUTRA SANDITA 
NIM     : 235150407111001
KELAS   : A

TUGAS PEMROGRAMAN DASAR 5.11
*/


public class Divide5and6 {
    public static void main(String[] args) {
        
        int baris = 0;
        Scanner sysin = new Scanner(System.in);

        //awal
        int start = sysin.nextInt();
        //akhir
        int end = sysin.nextInt();

        for(int num = start; num<= end; num++ ){

            if((num % 5 == 0 || num % 6 == 0) && !(num % 5 == 0 && num % 6 == 0)){
                System.out.print(num + ", ");
                baris++;
            }
            if(baris == 10){
                System.out.println("");
                baris = 0;
            }
        }
        sysin.close();

    }

 {
    
}
}
