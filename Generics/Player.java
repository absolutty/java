package com.company;

public abstract class Player {
    private String menoHraca;

    public Player(String menoHraca) {
        this.menoHraca = menoHraca;
    }

    public String getMenoHraca() {
        return menoHraca;
    }
}
