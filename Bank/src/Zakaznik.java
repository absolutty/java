package com.company;

import com.company.funkcie.Mena;
import com.company.funkcie.Volba;
import com.example.funkcie.Cakanie;
import com.example.funkcie.Rozdelenie;

import java.util.ArrayList;
import java.util.Scanner;

public class Zakaznik {
    Scanner input = new Scanner(System.in);

    private final String meno;
    private final String priezvisko;
    private double zostatokNaUcte;
    private final ArrayList<Double> transakcieArrList;

    public Zakaznik(String meno, String priezvisko, double zostatokNaUcte) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.zostatokNaUcte = zostatokNaUcte;
        this.transakcieArrList = new ArrayList<>();
    }

    public void zacni(){
        int volba = 0;
        boolean koniec = false;

        Rozdelenie.vypis();
        System.out.println("Zobrazuješ zákazníka "+getMeno()+" "+getPriezvisko());

        Cakanie.spusti();

        while(!koniec){
            switch (volba){
                case 0:
                    printInstrukcie();
                    volba = Volba.zvol();
                    break;
                case 1:
                    vypisTransakcii();
                    volba = Volba.zvol();
                    break;
                case 2:
                    vklad();
                    volba = Volba.zvol();
                    break;
                case 3:
                    vyber();
                    volba = Volba.zvol();
                    break;
                case 4:
                    Rozdelenie.vypis();

                    System.out.println("Na účte máš: "+getZostatokNaUcte()+Mena.get());
                    volba = Volba.zvol();
                    break;
                case 5:
                    Rozdelenie.vypis();

                    System.out.println("Ukončujem prezeranie banky "+getMeno());
                    koniec = true;
                    Cakanie.spusti();

                    break;
            }
        }
    }

    public void printInstrukcie(){
        System.out.println("0 - výpis inštrukcií");
        System.out.println("1 - výpis transakcií");
        System.out.println("2 - vklad na účet");
        System.out.println("3 - výber z účtu");
        System.out.println("4 - zostatok na účte");
        System.out.println("5 - ukonči prezeranie zákazníka "+getMeno()+" "+getPriezvisko());
    }

    public void vklad(){
        Rozdelenie.vypis();

        System.out.print("Koľko chceš vložiť na účet: ");
        double kolko = input.nextDouble();

        this.zostatokNaUcte += kolko;
        this.transakcieArrList.add(kolko);

        System.out.println("Pripísaných na účet "+kolko+ Mena.get());
    }

    public void vyber(){
        Rozdelenie.vypis();

        System.out.print("Koľko chceš vybrať z účtu: ");
        double kolko = input.nextDouble();

        //ak zákazník MÁ dostatok peňazí na účte
        if(maDostatokNaUcte(kolko)){
            this.zostatokNaUcte -= kolko;
            this.transakcieArrList.add(kolko * -1);

            System.out.println("Vybraných z účtu "+kolko+ Mena.get());
        }
        //ak zákazník NEMÁ dostatok peňazí na účte
        else{
            System.out.println("Nemožno uskutočníť výber, nemáš dostatok financií.");
        }
    }

    public boolean maDostatokNaUcte(double vyber){
        return vyber<=this.zostatokNaUcte;
    }

    public void vypisTransakcii(){
        Rozdelenie.vypis();

        for(double transakcia : this.transakcieArrList){
            System.out.print(transakcia);
            System.out.print(Mena.get());
            System.out.println();
        }
    }

    public static Zakaznik vytvor(String meno, String priezvisko, double vklad){
        return new Zakaznik( meno,  priezvisko,  vklad);
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public double getZostatokNaUcte() {
        return zostatokNaUcte;
    }
}
