package com.utp;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Declare variables to track quantities of each item
        int jumlahSabun = 0;
        int jumlahSampo = 0;
        int jumlahSapu = 0;
        int jumlahGula = 0;

        long totalBelanja = 0;

        while (true) {
            // Input item name
            
            String barang = input.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                // Print the receipt with better formatting
                System.out.println("\nDaftar belanja");
                System.out.println("------------------------------------------------");
                System.out.printf("| %-10s | %-7s | %-11s |\n", "Nama", "Jumlah", "Harga");
                System.out.println("------------------------------------------------");

                if (jumlahSabun > 0) {
                    System.out.printf("| %-10s | %-7d | Rp %-8d |\n", "Sabun", jumlahSabun, 1000 * jumlahSabun);
                    totalBelanja += 1000 * jumlahSabun;
                }
                if (jumlahSampo > 0) {
                    System.out.printf("| %-10s | %-7d | Rp %-8d |\n", "Sampo", jumlahSampo, 2000 * jumlahSampo);
                    totalBelanja += 2000 * jumlahSampo;
                }
                if (jumlahSapu > 0) {
                    System.out.printf("| %-10s | %-7d | Rp %-8d |\n", "Sapu", jumlahSapu, 1500 * jumlahSapu);
                    totalBelanja += 1500 * jumlahSapu;
                }
                if (jumlahGula > 0) {
                    System.out.printf("| %-10s | %-7d | Rp %-8d |\n", "Gula", jumlahGula, 2500 * jumlahGula);
                    totalBelanja += 2500 * jumlahGula;
                }

                System.out.println("------------------------------------------------");
                System.out.printf("Total yang harus dibayar: Rp %,d\n", totalBelanja);
                break;
            }

            // Input item quantity
          
            int jumlah = input.nextInt();
            input.nextLine();  // Consume the newline character

            // Update the quantity and total based on the input
            switch (barang) {
                case "sabun":
                    jumlahSabun += jumlah;
                    break;
                case "sampo":
                    jumlahSampo += jumlah;
                    break;
                case "sapu":
                    jumlahSapu += jumlah;
                    break;
                case "gula":
                    jumlahGula += jumlah;
                    break;
                default:
                    System.out.println("Barang tidak valid. Silakan pilih lagi.");
                    return;
                    
            }
        }

        System.out.println("\nTerima kasih telah berbelanja di toko kami!");
        input.close();
    }
}
