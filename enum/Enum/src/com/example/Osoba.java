package com.example;

public class Osoba {
    private String meno;
    private String priezvisko;
    private PracovneZaradenie pracovneZaradenie;
    private int plat;

    /**
     * Constructor for objects of class Osoba
     */
    public Osoba(String meno, String priezvisko, int plat) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pracovneZaradenie = PracovneZaradenie.generujRandom();
        this.plat = plat;
    }


}
