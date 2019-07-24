package com.tolgaduran.exceptions;

public class TryCatchClass {
    public static void main(String[] args) {
//        int a=8;
//        System.out.println(a/0);
//        try {
//            System.out.println(a/0);
//        }catch (Exception e){
//            System.err.println("Sıfıra bölme hatası");
//        }

        int[] sayi={1,2,3};
        System.out.println(sayi.length);
        System.out.println(sayi[2]);
        try {
            System.out.println(sayi[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata");
        }catch (Exception e) {
            System.out.println("Tüm istisnalar");
        }finally {
            System.out.println("Her durumda çalışır");
        }
    }
}
