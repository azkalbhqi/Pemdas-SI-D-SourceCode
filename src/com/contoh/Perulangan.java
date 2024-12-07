package com.contoh;
import java.util.*;
public class Perulangan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int in = input.nextInt();
        
        for(int i = 1 ; i <= 5; i++){
            System.out.println("print ke-" + i);
        }

        boolean bol = false;        

        while (bol == true) {
            System.out.println("tes");
            
        }

        do{
            System.out.println("tes2");
        }while(bol == true);



       

        float hasil=0;
        for (int i = 1; i < in; i++){
            hasil = hasil + (float)i/(i+1);
            System.out.print(hasil+"+");
        }
        
        System.out.println("="+hasil);



         
    }
}
