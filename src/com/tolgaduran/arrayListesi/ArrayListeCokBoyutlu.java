package com.tolgaduran.arrayListesi;

public class ArrayListeCokBoyutlu {
    public static void main(String[] args) {
        // İki boyulu dizi
        int[][] ikiBoyutlu = {{1, 2, 3}, {9, 8, 7}};
        // ikiboyutlu[1][1] => 8
        // System.out.println(ikiBoyutlu[1][1]);

        for (int i = 0; i < ikiBoyutlu.length; i++) {
            for (int j = 0; j < ikiBoyutlu[i].length; j++) {
                System.out.println(ikiBoyutlu[i][j]);
            }
        }
    }
}
