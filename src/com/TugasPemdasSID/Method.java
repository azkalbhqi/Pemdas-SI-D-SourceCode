package com.TugasPemdasSID;

public class Method {
    static float luaslingkaran(float jari){
        float phi = 3.14f;
        float luas = phi * jari * jari;
        return luas;
    } 

    public static void main(String[] args) {
       
        System.out.println(luaslingkaran(14));
        float luaslingkaran = luaslingkaran(4);
        System.out.println(luaslingkaran);
       
    }
}
