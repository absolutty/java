package com.example;

public enum MatematickeHodnoty {
    PI(3.14),
    e(2.17),
    hmotnostTvojaMama(Integer.MAX_VALUE);

    private double hodnota;

    MatematickeHodnoty(double hodnota) {
        this.hodnota = hodnota;
    }

    public double getHodnota() {
        return hodnota;
    }
}
