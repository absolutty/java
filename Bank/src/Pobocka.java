package com.company;

import com.company.funkcie.Mena;
import com.company.funkcie.Volba;
import com.example.funkcie.Cakanie;
import com.example.funkcie.Rozdelenie;

import java.util.ArrayList;
import java.util.Scanner;

public class Pobocka {
    private final Scanner input = new Scanner(System.in);

    private String nazov;
    private final ArrayList<Zakaznik> zakazniciArrList;

    public Pobocka(String nazov) {
        this.nazov = nazov;
        this.zakazniciArrList = new ArrayList<>();
    }

    public void pridajZakaznika(){
        System.out.print("Meno: ");
        String meno = input.next();

        System.out.print("Priezvisko: ");
        String priezvisko = input.next();

        System.out.print("Počiatočný vklad: ");
        double vklad = input.nextDouble();

        zakazniciArrList.add(Zakaznik.vytvor(meno, priezvisko, vklad));
    }

    public void pridajZakaznika(Zakaznik zakaznik){
        zakazniciArrList.add(zakaznik);
    }

    public void vypisZakaznikov(){
        Rozdelenie.vypis();
        int i = 1;

        for(Zakaznik zakaznik : zakazniciArrList){
            System.out.println(i+". zákazník "+zakaznik.getMeno()+" "+zakaznik.getPriezvisko()+
                               ", zostatok na účte: "+zakaznik.getZostatokNaUcte() + Mena.get());

            i++;
        }
    }

    public void zobrazZakaznika(){
        Rozdelenie.vypis();

        System.out.print("Poradie zákazníka ktorého chceš zobraziť transakcie: ");
        int poradie = input.nextInt();

        if(poradieExistuje(poradie)){
            poradie--;

            zakazniciArrList.get(poradie).zacni();
        }

        else{
            System.out.println("Zákazník v poradí "+(poradie+1)+". nenájdený!");
        }

    }

    public static Pobocka vytvor(String nazov){
        return new Pobocka(nazov);
    }


    public void zacni(){
        int volba = 0;
        boolean koniec = false;

        Rozdelenie.vypis();
        System.out.println("Navštevuješ banku "+getNazov());

        Cakanie.spusti();

        while(!koniec){
            switch (volba){
                case 0:
                    printInstrukcie();
                    volba = Volba.zvol();
                    break;
                case 1:
                    vypisZakaznikov();
                    volba = Volba.zvol();
                    break;
                case 2:
                    zobrazZakaznika();
                    volba = Volba.zvol();
                    break;
                case 3:
                    break;
                case 4:
                    Rozdelenie.vypis();

                    System.out.println("Ukončujem prezeranie banky "+getNazov());
                    koniec = true;
                    Cakanie.spusti();

                    break;
            }
        }
    }

    public void printInstrukcie(){
        Rozdelenie.vypis();

        System.out.println("0 - výpis inštrukcií");
        System.out.println("1 - výpis všetkých zákazníkov");
        System.out.println("2 - zobraz zákazníka");
        System.out.println("4 - ukonči prezeranie banky "+getNazov());
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getNazov() {
        return nazov;
    }

    public int getPocetZakaznikov() {
        return zakazniciArrList.size();
    }

    private boolean poradieExistuje(int cislo){
        return cislo>0 && cislo<=zakazniciArrList.size();
    }
}
