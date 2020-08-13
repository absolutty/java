package com.company.funkcie;

import java.util.Scanner;

public class Volba {
    public static int zvol(){
        System.out.print("Tvoja voľba: ");
        return new Scanner(System.in).nextInt();
    }
}
