package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr){
        System.out.println("Pôvodný array: "+ Arrays.toString(arr));

        int dlzkaArr = arr.length;
        int koniec = (dlzkaArr)-1;

        for(int i = 0; i < dlzkaArr/2; i++){
            int temp = arr[i];
            arr[i]=arr[koniec];
            arr[koniec]=temp;
            koniec--;
        }

        System.out.println("Pospiatočky array: "+ Arrays.toString(arr));
    }
}
