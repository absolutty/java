package com.company;

import java.util.Scanner;

public class PriemerArray {

    public static void main(String[] args) {
        int[] vygenerovanaArray = generujArray();

        System.out.println(priemerArray(vygenerovanaArray));
    }

    private static int[] generujArray(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Koľko prvkov chceš sčítavať?: ");
        int pocetPrvkov = scn.nextInt();

        int[] array = new int[pocetPrvkov];
        for(int i=0; i<pocetPrvkov; i++){
            System.out.print("Zadaj "+(i+1)+". cislo: ");
            array[i] = scn.nextInt();
        }

        return array;
    }

    private static int sucetArray(int[] array){
        int sucet=0;

        for (int value : array) {//idk ako to robí :)))))
            sucet += value;
        }

        return sucet;
    }

    private static double priemerArray(int[] array){
        int sucetOfArray = sucetArray(array);

        return (double)sucetOfArray/array.length;
    }
}
