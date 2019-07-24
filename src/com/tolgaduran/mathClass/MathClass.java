package com.tolgaduran.mathClass;

public class MathClass {
    public static void main(String[] args) {
        // Math.max(a,b) => en büyük değeri verir
        double maximum_deger = Math.max(7, 9);
        System.out.println("Maximum Değer\t: " + maximum_deger);

        // Math.max(a,b) => en küçük değeri verir
        double minimum_value = Math.min(7, 9);
        System.out.println("Minimum Değer\t: " + minimum_value);

        // Math.sqrt() => Karekökünü alır
        double squareRoot = Math.sqrt(65);
        System.out.println("Karekök\t\t\t: " + squareRoot);

        // Math.abs() => Mutlak değerini verir
        double mutlak_deger = Math.abs(-4.9);
        System.out.println("Mutlak Değer\t: " + mutlak_deger);

        // Math.PI => Pi sayısını verir
        double pi=Math.PI;
        System.out.println("Pi Sayısı\t\t: "+pi);
    }
}
