package com.company;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("meno1");
        strArrList.add("meno2");
        strArrList.add("meno3");
        for(String meno : strArrList){
            System.out.print(meno+", ");
        }
        rozdel();
        
        ArrayList<Integer> intArrList = new ArrayList<>();
        intArrList.add(5);
        intArrList.add(7);
        intArrList.add(9);
        for(int cislo : intArrList){
            System.out.print(cislo+", ");
        }
        rozdel();

        ArrayList<Double> doubleArrList = new ArrayList<>();
        doubleArrList.add(1.9d);
        doubleArrList.add(3.5);
        doubleArrList.add(4.2);
        for(double cislo : doubleArrList){
            System.out.print(cislo+", ");
        }
        rozdel();

        ArrayList<Character> charArrList = new ArrayList<>();
        charArrList.add('o');
        charArrList.add('s');
        charArrList.add('k');
        for(char znak : charArrList){
            System.out.print(znak+", ");
        }
        rozdel();

        ArrayList<Byte> byteArrList = new ArrayList<>();

        for(byte b = 3; b <=9; b+=3){
            byteArrList.add(b);
        }

        for(byte b : byteArrList){
            System.out.print(b+", ");
        }
    }

    private static void rozdel(){
        System.out.println();
    }
}


