package com.tolgaduran.dongu;

import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayi = 0;

        do {
            System.out.println("Sayı giriniz : ");
            sayi = s.nextInt();
        } while (sayi != 5);

        System.out.println("5 Girildi!!!");
    }
}
