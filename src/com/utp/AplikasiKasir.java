package com.utp;

import java.util.Scanner;

public class AplikasiKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Declare variables to track quantities of each item
        int jumlahSabun = 0;
        int jumlahSampo = 0;
        int jumlahSapu = 0;
        int jumlahGula = 0;

        long totalBelanja = 0;

        while (true) {
            //masukan nama barang
            String barang = input.nextLine().toLowerCase();

            if (barang.equalsIgnoreCase("selesai")) {
                // Print the receipt
                System.out.println("Daftar belanja");
                System.out.println("----------------------------------");
                System.out.println("| Nama       | Jumlah  | Harga  |");
                System.out.println("----------------------------------");

                if (jumlahSabun > 0) {
                    System.out.printf("| Sabun      | %d        | Rp %d   |\n", jumlahSabun, 1000 * jumlahSabun);
                    totalBelanja += 1000 * jumlahSabun;
                }
                if (jumlahSampo > 0) {
                    System.out.printf("| Sampo      | %d        | Rp %d   |\n", jumlahSampo, 2000 * jumlahSampo);
                    totalBelanja += 2000 * jumlahSampo;
                }
                if (jumlahSapu > 0) {
                    System.out.printf("| Sapu       | %d        | Rp %d   |\n", jumlahSapu, 1500 * jumlahSapu);
                    totalBelanja += 1500 * jumlahSapu;
                }
                if (jumlahGula > 0) {
                    System.out.printf("| Gula       | %d        | Rp %d   |\n", jumlahGula, 2500 * jumlahGula);
                    totalBelanja += 2500 * jumlahGula;
                }

                System.out.println("----------------------------------");
                System.out.println("Total yang harus dibayar : Rp " + totalBelanja);
                break;
            }

            //masukan jumlah
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
                    break;
            }
        }

        System.out.println("Terima kasih telah berbelanja di toko kami!");
        input.close();
    }
}
