package com.tolgaduran.methods.calc;

public class Islemler {
    private static double sonuc;
    private static final String SONUC = "Sonuç : ";

    public void toplama(double a, double b) {
        sonuc = a + b;
        System.out.println(SONUC + sonuc);
    }

    public void cikarma(double a, double b) {
        sonuc = a - b;
        System.out.println(SONUC + sonuc);
    }

    public void carpma(double a, double b) {
        sonuc = a * b;
        System.out.println(SONUC + sonuc);
    }

    public void bolme(double a, double b) {
        sonuc = a / b;
        System.out.println(SONUC + sonuc);
    }
}
