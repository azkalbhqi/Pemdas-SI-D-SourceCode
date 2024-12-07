package com.TugasPemdasSID;

public class Classmethod {
    public static void main(String[] args) {
        Hitung namaHitung = new Hitung();
        System.out.println(namaHitung.a);
        namaHitung.itung();
    }
}

class Hitung{
    int a = 10;

    void itung(){
        System.out.println("Hitung");
    }
}
