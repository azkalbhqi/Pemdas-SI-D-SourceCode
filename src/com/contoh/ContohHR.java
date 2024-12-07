package com.contoh;
import java.util.Scanner;

public class ContohHR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input jari jari
        float jari = in.nextFloat();
        //menghitung luas lingkaran
        float hasil = jari * jari * 22 / 7;
        //output 
        System.out.println("Luas lingkaran = " + hasil);

        in.close();
    }
}

// Output:
// Luas lingkaran = 154.0