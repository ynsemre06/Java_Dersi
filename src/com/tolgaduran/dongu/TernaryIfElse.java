package com.tolgaduran.dongu;

public class TernaryIfElse {
    public static void main(String[] args) {
        int a=17;

        if (a<18){
            System.out.println("Younger than 18!");
        }else {
            System.out.println("18 or older");
        }

        // variable=(condition)?<true>:<false>;
        String result=(a<18)?"Younger than 18!":"18 or older";
        System.out.println(result);
    }
}
