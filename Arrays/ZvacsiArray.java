package com.company;

import java.util.Arrays;

public class ZvacsiArray {

    private static int[] arr = {1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println("Pôvodný array: "+ Arrays.toString(arr));

        zvacsiArr();

        arr[5] = 35;
        arr[6] = 69;

        System.out.println("Zväčšený array: "+ Arrays.toString(arr));
    }

    private static void zvacsiArr(){
        int[] uchovanieUdajov = arr;

        arr = new int[7];

        System.arraycopy(uchovanieUdajov, 0, arr, 0, uchovanieUdajov.length);
    }

}
