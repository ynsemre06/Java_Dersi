package com.tolgaduran.methods;

import java.util.Scanner;

public class InnerClass {
    public static void main(String[] args) {
//        IctekiSinif a=new IctekiSinif();
//        a.toplama();

        DigerSinif d=new DigerSinif();
        d.ekranCiktisi();
        d.parametreli("Tolga");
        String value="Deneme "+d.parametreliTip();
        System.out.println(value);

        System.out.println(d.degerlikliTip(5));
    }
}

//class IctekiSinif {
//
//    // Parametresiz method
//    public void toplama() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Birinci Sayı : ");
//        int a = s.nextInt();
//        System.out.println("İkinci Sayı  : ");
//        int b = s.nextInt();
//
//        int sonuc = a + b;
//        System.out.println("Toplama Sonucu : " + sonuc);
//
//    }
//
//
//}
