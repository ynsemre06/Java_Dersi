package com.tolgaduran.dongu;

import java.util.Scanner;

public class IfElseDongusu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String komut;
//        System.out.println("Komut Giriniz : ");
//        komut = s.nextLine();
//
//        if (komut == "start") {
//            System.out.println("Program Çalıştı...");
//        } else if (komut == "stop") {
//            System.out.println("Program Sonlandı!!!");
//        } else {
//            System.out.println("Hatalı Komut!!!");
//        }

        int komut;
        System.out.println("Komut Giriniz : ");
        komut = s.nextInt();

//        if (komut == 1) {
//            System.out.println("Program Çalıştı...");
//        } else if (komut == 0) {
//            System.out.println("Program Sonlandı!!!");
//        } else {
//            System.out.println("Hatalı Komut!!!");
//        }

        if (komut == 1) {
            System.out.println("Program Çalıştı...");
        } else if (komut == 0) {
            System.out.println("Program Sonlandı!!!");
        } else {
            System.out.println("Hatalı Komut!!!");
        }
    }
}
