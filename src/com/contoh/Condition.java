package com.contoh;
import java.util.*;
public class Condition {
    public static void main(String[] args) {

        Scanner sysin = new Scanner(System.in);
        
        // int nilai = sysin.nextInt();

        // //Ternary
        // String kelulusan =  (nilai >= 80) ? "Lulus" : "Tidak Lulus";
        // System.out.println(kelulusan);
        

        // //Switch case
        // switch (kelulusan) {
        //     case "Lulus":
        //         System.out.print("yeee lulus");
        //         break;
        //     case "Tidak Lulus":
        //     System.out.print("yah tidak lulus");
        //         break;
        //     default:
        //     System.out.println("ga ke detect");
        // }

        
        // //if else
        // if(nilai >= 90){
        //     System.out.println(" Cumlaude yaa");
        // }
        // else if(nilai >= 80 && nilai <= 89){
        //     System.out.println(" lulus aja");
        // }
        // else if(nilai == 0){
        //     System.out.println("ga ujian ya kamu");
        // }
        // else{
        //     System.out.println(" remed");
        // }


        // int pilihan = sysin.nextInt();
        boolean bol = false;
        int a = (bol == true) ? 1 : 0;
        switch (a) {
            case 1:
                System.out.println("true");
                break;
            case 0:
                System.out.println("false"); 
                break;
            default:
                System.out.println("pesan");
                break;
        }
        
    }
}





