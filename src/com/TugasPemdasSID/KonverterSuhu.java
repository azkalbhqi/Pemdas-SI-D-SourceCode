package com.TugasPemdasSID ;
/* 
NAMA    : AZKAL BAIHAQI PUTRA SANDITA 
NIM     : 235150407111001
KELAS   : A

TUGAS PEMROGRAMAN DASAR 2.1
*/

import java.util.*;

public class KonverterSuhu{
    public static void main(String[] args) {
        Scanner sysin = new Scanner(System.in); 
        //var hasil
        float fahrenheit;
        float kelvin;
        float reamur;

        //Input suhu        
        float celsius = sysin.nextFloat();

        //proses
        fahrenheit = celsius * 9 / 5 + 32;
        kelvin = celsius + 273.15f;
        reamur = celsius * 4 / 5;

        //output
        System.out.printf("Kelvin: %.2f\n", kelvin);
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Reamur: %.2f\n", reamur);

        //input closing
        sysin.close();

    }
}