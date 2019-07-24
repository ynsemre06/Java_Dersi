package com.tolgaduran.methods.calc;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Islemler islemler = new Islemler();

        double a, b;
        int islem;

        System.out.println("İşlemler");
        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");

        System.out.println("Birinci Sayı : ");
        a = s.nextInt();
        System.out.println("İkinci Sayı  : ");
        b = s.nextInt();
        System.out.println("İşlem Seçiniz : ");
        islem = s.nextInt();

        if (islem == 1) {
            islemler.toplama(a, b);
        } else if (islem == 2) {
            islemler.cikarma(a, b);
        } else if (islem == 3) {
            islemler.carpma(a, b);
        } else if (islem == 4) {
            islemler.bolme(a, b);
        }
    }
}
