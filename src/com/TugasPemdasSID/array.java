package com.TugasPemdasSID;
public class array {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        String[][] string = {{"1,1","1,2","1,3"},
                            {"2,1","2,2","2,3"},
                            {"3,1","3,2","3,3"}};
       
for(int i = 0; i < string.length; i++){
    for(int j = 0; j < string[i].length; j++){
        System.out.print(string[i][j] + " ");
    }
    System.out.println("");
}
        
        // for (int i = 0; i < angka.length; i++) {
        //     angka[i] = numbers[i];
        // }

        

        


    
        
        // // Mengakses elemen array
        // System.out.println("Elemen pertama: " + numbers[0]);
        // System.out.println("Elemen ketiga: " + numbers[2]);

        // // Menggunakan loop untuk menampilkan semua elemen
        // System.out.println("Semua elemen dalam array:");
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println("Index " + i + ": " + numbers[i]);
        // }

        // // Menambahkan semua nilai dalam array
        // int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {
        //     sum += numbers[i];
        // }
        // System.out.println("Jumlah semua elemen: " + sum);
    }
}
