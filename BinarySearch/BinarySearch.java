package com.example;

import com.example.funkcie.Rozdelenie;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[20];

        generNum(arr); //generuje 20 čísel
        vypisArr(arr); // vypíše čísla

        najdiCislo(40, arr);//hladanie tak, že kontroluje čísla od prvého až do kedy ho nenájde
        binarySearch(40, arr);//hladanie s použitím binary search
    }

    private static void najdiCislo(int cisloNaNajdenie, int[] arr){
        Rozdelenie.vypis(30);
        System.out.println("Hľadá sa číslo "+cisloNaNajdenie);

        int pocetPokusov = 0;
        for(int i=0; i< arr.length; i++){
            System.out.print("Pokus číslo "+(i+1)+": ");
            if(arr[i] == cisloNaNajdenie){
                System.out.print("nájdené\n");
                pocetPokusov = i+1;
                break;
            }
            else{
                System.out.print("nič");
            }

            System.out.println();
        }

        System.out.println("Nájdené na "+pocetPokusov+". pokus");
    }

    private static void binarySearch(int cisloNaNajdenie, int[] sortedArr){
        Rozdelenie.vypis(30);
        System.out.println("Hľadá sa číslo "+cisloNaNajdenie);

        int l = 0, r = sortedArr.length - 1, pocetPokusov = 0;
        while (l <= r) {
            pocetPokusov++;
            System.out.print("Pokus číslo "+(pocetPokusov)+": ");

            int m = l + (r - l) / 2;

            //kontroluje či je cisloNaNajdenie prítomné na stredovej pozícií
            if (sortedArr[m] == cisloNaNajdenie) {
                System.out.print("nájdené\n");

                System.out.println("Nájdené na " + pocetPokusov + ". pokus");
                return;
            }
            //ak je cisloNaNajdenie väčšie, ignoruje ľavú polovicu
            if (sortedArr[m] < cisloNaNajdenie){
                System.out.print("nič\n");

                l = m + 1;
            }

            //ak je cisloNaNajdenie väčšie, ignoruje pravú polovicu
            else {
                System.out.print("nič\n");

                r = m - 1;
            }
        }
    }

    private static void generNum(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = (i + 1) * 2 ;
        }
    }

    private static void vypisArr(int[] arr){
        for(int cislo : arr){
            System.out.print(cislo+ ", ");
        }

        System.out.println();
    }

}
