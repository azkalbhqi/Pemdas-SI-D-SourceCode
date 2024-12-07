package com.contoh;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
    
        long buku = 7000;
        long pensil = 3000;
        long hapus = 2000;
        
        int jmlBuku = in.nextInt();
        int jmlPensil = in.nextInt();
        in.next();
        String tes = in.nextLine();
        int jmlHapus = in.nextInt();
        
        long totalBuku = buku * jmlBuku;
        long totalPensil = pensil * jmlPensil;
        long totalHapus = hapus * jmlHapus;

        long hasil = totalBuku + totalHapus + totalPensil;

        
        System.out.println("Total Harga = " + hasil);

        System.out.println("=========CONTOH==========");

        System.out.println("yang salah:");
         System.out.println("Total Harga = " + totalBuku + totalHapus + totalPensil);

         System.out.println("yang bisa:");
         System.out.println(totalBuku + totalHapus + totalPensil);
        


    }


}


