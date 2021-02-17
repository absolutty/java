package com.company;

public class Kontakt {
    private final String meno;
    private final String telCislo;

    public Kontakt(String meno, String telCislo) {
        this.meno = meno;
        this.telCislo = telCislo;
    }

    public static Kontakt vytvorKontakt(String meno, String telCislo){
        return new Kontakt(meno, telCislo);
    }

    public String getMeno() {
        return meno;
    }

    public String getTelCislo() {
        return telCislo;
    }
}
