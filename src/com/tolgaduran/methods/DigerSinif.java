package com.tolgaduran.methods;

public class DigerSinif {
    public void ekranCiktisi() {
        System.out.println("Merhaba");
    }

    public void parametreli(String isim) {
        System.out.println("Merhaba, " + isim);
    }

    public String parametreliTip(){
        return "sonuç";
    }

    public int degerlikliTip(int sayi){
        return 3*sayi;
    }
}
