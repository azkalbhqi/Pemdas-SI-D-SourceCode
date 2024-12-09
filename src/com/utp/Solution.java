package com.utp;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] seatAvailability = {10, 15, 20, 30, 60, 25}; // Jumlah tiket untuk setiap kategori
        String[] seatCategories = {"CAT A", "CAT B", "CAT C", "CAT D", "CAT E", "VIP"};
        boolean continueBooking = true;

        System.out.println("Selamat datang di Sistem Pemesanan Seat Konser Hita-Hita FEST!");
        
        while (continueBooking) {
            // Menampilkan daftar kategori kursi beserta tiket yang tersisa
            System.out.println("List pillihan seat:");
            for (int i = 0; i < seatCategories.length; i++) {
                System.out.printf("%d. %s - Sisa Tiket: %d\n", (i + 1), seatCategories[i], seatAvailability[i]);
            }

            // Meminta pengguna memilih kategori kursi
            System.out.print("\nPilih kode seat yang ingin ditonton: ");
            System.out.println();
            int seatChoice = scanner.nextInt();

            if (seatChoice < 1 || seatChoice > seatCategories.length) {
                System.out.println("Invalid input. Kode seat tidak valid.");

                continue;
            }

            // Meminta jumlah tiket yang ingin dibeli
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            System.out.println();
            int ticketCount = scanner.nextInt();

            if (ticketCount > seatAvailability[seatChoice - 1]) {
                System.out.println("Invalid input. Jumlah tiket melebihi stok yang tersedia.");
                continue;
            }

            // Mengurangi jumlah tiket yang tersedia
            seatAvailability[seatChoice - 1] -= ticketCount;

            if (seatChoice == 6) { // Jika kategori VIP dipilih
                System.out.println("\nAnda telah memilih kategori VIP. Berikut pilihan layanan eksklusif kami:");
                System.out.println("1. Makanan dan Minuman Gratis");
                System.out.println("2. Sesi Jabat Tangan");
                System.out.println("3. Souvenir Eksklusif");

                System.out.print("\nPilih layanan eksklusif (masukkan nomor pilihan): " );
                int vipChoice = scanner.nextInt();

                System.out.println();
                switch (vipChoice) {
                    case 1:
                        System.out.println("Anda memilih Makanan dan Minuman Gratis.");
                        break;
                    case 2:
                        System.out.println("nda memilih Sesi Jabat Tangan.");
                        break;
                    case 3:
                        System.out.println("Anda memilih Souvenir Eksklusif.");
                        break;
                    default:
                        System.out.println("Invalid input. Pilihan layanan tidak valid.");
                }
            }

            // Menampilkan sisa tiket

            System.out.println("Session ended");
            System.out.println("Sisa Tiket Saat ini:");
            for (int i = 0; i < seatCategories.length; i++) {
                System.out.printf("%d. %s - Sisa Tiket: %d\n", (i + 1), seatCategories[i], seatAvailability[i]);
            }

            // Menanyakan apakah pengguna ingin membuat pemesanan lagi
            boolean validResponse = false;
            while (!validResponse) {
                System.out.print("\nApakah Anda ingin melakukan pemesanan lagi? (ya/tidak): ");
                String continueResponse = scanner.next().toLowerCase();
                if (continueResponse.equals("ya")) {
                    validResponse = true;
                } else if (continueResponse.equals("tidak")) {
                    System.out.println();
                    validResponse = true;
                    continueBooking = false;
                } else {
                    System.out.println("Invalid input.");
                }
            }
        }

        System.out.println("Terimakasih telah memesan. Nikmati konsernya!");
        scanner.close();
    }
}