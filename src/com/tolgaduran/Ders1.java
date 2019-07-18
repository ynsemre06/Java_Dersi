package com.tolgaduran;

public class Ders1 {
    public static void main(String[] args) {
        // Bunlar "Primitive Data Types"
        int sayi_tamsayi = 6;
        double ondalikli_sayi = 7.8;
        char karakter = 'a';
        long uzun_tamsayi = 2L;
        boolean dogruMu=true;

        System.out.println("Tamsayı Değeri\t: " + sayi_tamsayi);
        System.out.println("Ondalıklı Değer\t: " + ondalikli_sayi);
        System.out.println("Karakter\t\t: " + karakter);
        System.out.println("Long Değer\t\t: " + uzun_tamsayi);
        System.out.println("Cevap : "+dogruMu);

        /*
                    \ Escape (Kaçış) Karakteri
                \t : 1 tab'lık boşluk bırakır
                \n : alt satıra geçer
         */
        System.out.println("T.C. aslında \"Türkiye Cumhuriyeti\" nin kısaltmasıdır.");

        System.out.println("Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir.\nLorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır.\nBeşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır.\n1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.");

        // Non-Primitive Data Types
        String isim = "5";
        System.out.println(isim);
        // int toplam=sayi_tamsayi+isim;

        System.out.println("İsim Soyisim : "+"isim"+" ");
    }
}

