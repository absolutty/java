package com.example;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {5, 3, 22, 61, 4};
        int sucet = 0;

        /*
        for each loop
        * - namiesto deklarovania počítacej premennej ako sa to robí v klasickom loope (i = 1),
        * deklaruje sa jedna premenna/objekt typu aký je v array/arrayliste
        * - syntax vyzerá takto
        * for(datovyTyp nazov : array/arraylsit){}
        */
        for(int cislo : arr){
            sucet += cislo;
        }

        System.out.print("Súčet čísel "); vypisCisel(arr); System.out.print("je "+ sucet);
    }

    private static void vypisCisel(int[] array){
        for(int cislo : array){
            System.out.print(cislo + ", ");
        }
    }
}
