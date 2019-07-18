package com.tolgaduran.dongu;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int komut;
        System.out.println("Komut Giriniz : ");
        komut = s.nextInt();

        // trim() metodu başta ve sondaki tüm boşlukları siler.
        // toLowerCase() metodu tüm String değerini küçük harfe dönüştürür.
        // toUpperCase() metodu tüm String değerini büyük harfe dönüştürür.

        switch (komut){
            case 1:
                System.out.println("Evet Girildi");
                break;
            case 0:
                System.out.println("Hayır Girildi");
                break;
            default:
                System.out.println("Hatalı Giriş");
                break;
        }
    }
}
