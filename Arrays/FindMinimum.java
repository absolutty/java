package com.company;

import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {
        int[] arr = readIntegers(5);

        System.out.println("Najmenšia hodnota: "+findMin(arr));
    }

    private static final Scanner scn = new Scanner(System.in);

    private static int[] readIntegers(int count){
        int[] arr = new int[count];

        for(int i = 0; i<count; i++){
            System.out.print("Zadaj "+(i+1)+". číslo: ");
            arr[i] = scn.nextInt();
        }

        return arr;
    }

    private static int findMin(int[] arr){
        int minimum = Integer.MAX_VALUE;

        for(int value:arr) {
            if(value<minimum){
                minimum = value;
            }
        }
        return minimum;
    }
}
