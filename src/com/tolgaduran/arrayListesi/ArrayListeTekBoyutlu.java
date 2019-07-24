package com.tolgaduran.arrayListesi;

public class ArrayListeTekBoyutlu {
    public static void main(String[] args) {

        String[] arabalar={"BMW","Mercedes","Audi"};

//        System.out.println(arabalar.length);
//        System.out.println(arabalar[1]);

        // Klasik for() döngüsü
        for(int i=0;i<arabalar.length;i++){
            System.out.println(arabalar[i]);
        }

        // Geliştirilmiş for() döngüsü (Ternary)
        for(String i:arabalar){
            System.out.println(i);
        }
    }
}
