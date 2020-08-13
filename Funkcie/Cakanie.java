package com.example.funkcie;

public class Cakanie {
    public Cakanie() {
    }

    public static void spusti() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var1) {
            Thread.currentThread().interrupt();
        }

    }

    public static void spusti(int pocetSek) {
        try {
            Thread.sleep((long)(pocetSek * 1000));
        } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
        }
    }
}
