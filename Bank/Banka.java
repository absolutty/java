package com.company;

import com.company.funkcie.Volba;
import com.example.funkcie.Cakanie;
import com.example.funkcie.Rozdelenie;

import java.util.ArrayList;
import java.util.Scanner;

public class Banka {
    private static final Scanner input = new Scanner(System.in);
    private int volba = 0;
    private boolean koniec = false;

    private final ArrayList<Pobocka> arrPobocky;

    public Banka() {
        //inicializuje ArrayList z pobociek
        this.arrPobocky = new ArrayList<>();

        //defaultne vytvorené pobocky aj so zákazníkmi
        Pobocka pobockaPrievidza = Pobocka.vytvor("Prievidza");
        Pobocka pobockaHandlova = Pobocka.vytvor("Handlová");

        pobockaPrievidza.pridajZakaznika(Zakaznik.vytvor("Adam", "Prievidžan", 500));
        pobockaPrievidza.pridajZakaznika(Zakaznik.vytvor("Peter", "Zprievidze", 200));

        pobockaHandlova.pridajZakaznika(Zakaznik.vytvor("Jano", "Handlovčan", 696));
        pobockaHandlova.pridajZakaznika(Zakaznik.vytvor("Samuel", "Zhandlovej", 320));
        pobockaHandlova.pridajZakaznika(Zakaznik.vytvor("Marek", "Handlová", 299));

        this.arrPobocky.add(pobockaPrievidza);
        this.arrPobocky.add(pobockaHandlova);

        //spustí program
        zacni();
    }

    private void zacni(){
        System.out.println("Spúšťam systém.");
        Cakanie.spusti();

        while(!koniec){
            switch (volba){
                case 0:
                    printInstrukcie();
                    volba = Volba.zvol();
                    break;
                case 1:
                    vypisBaniek();
                    volba = Volba.zvol();
                    break;
                case 2:
                    navstivBanku();
                    volba = Volba.zvol();
                    break;
                case 3:
                    pridajBanku();
                    volba = Volba.zvol();
                    break;
                case 4:
                    upravMeno();
                    volba = Volba.zvol();
                    break;
                case 5:
                    System.out.println("Ukončujem celý systém");
                    koniec = true;
                    break;
            }
        }
    }

    private void printInstrukcie(){
        Rozdelenie.vypis();

        System.out.println("0 - výpis inštrukcií");
        System.out.println("1 - výpis všetkých baniek");
        System.out.println("2 - navštív banku");
        System.out.println("3 - pridaj banku");
        System.out.println("4 - uprav meno banky");
        System.out.println("5 - koniec");
    }

    private void vypisBaniek(){
        Rozdelenie.vypis();

        int i = 1;
        for(Pobocka pobocka : arrPobocky){
            System.out.println(+i+". "+pobocka.getNazov()+", počet zákazníkov: "+pobocka.getPocetZakaznikov());
            i++;
        }
    }

    private void navstivBanku(){
        Rozdelenie.vypis();

        System.out.print("Poradie banky ktorú chceš navštíviť?: ");
        int poradie = input.nextInt();
        input.nextLine();

        Pobocka pobocka = arrPobocky.get(poradie-1);
        pobocka.zacni();

        //ak skončí prehliadanie pobočky
        printInstrukcie();
    }

    private void pridajBanku(){
        Rozdelenie.vypis();

        System.out.print("Názov banky, ktorú chceš pridať: ");
        String nazov = input.next();

        if(!nazovExistuje(nazov)){
            System.out.println("Pridanie banky úspešné.");
            Cakanie.spusti();

            arrPobocky.add(Pobocka.vytvor(nazov));

            System.out.println("Pobočka "+nazov+" vytvorená.");
        }
        else{
            System.out.println("Pridanie banky neaúspešné.");
            Cakanie.spusti();
            System.out.println("Názov ktorý sa snažíš zadať už existuje!");
        }
    }

    private void upravMeno(){
        Rozdelenie.vypis();

        System.out.print("Poradie banky ktorú chceš upraviť?: ");
        int poradie = input.nextInt();

        if(poradieExistuje(poradie)){
            poradie--;

            System.out.print("Nový názov pobočky banky: ");
            String novyNazov = input.next();
            input.nextLine();

            arrPobocky.get(poradie).setNazov(novyNazov);
        }
    }

    private boolean nazovExistuje(String nazov){
        for(Pobocka pobocka : arrPobocky){
            if(pobocka.getNazov().equals(nazov)){
                return true;
            }
        }

        return false;
    }

    private boolean poradieExistuje(int cislo){
        return cislo>0 && cislo<=arrPobocky.size();
    }

}
