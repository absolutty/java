package com.company;

import com.company.funkcnost.GetID;
import com.company.funkcnost.Rozdelenie;

import java.util.ArrayList;
import java.util.Scanner;

public class Telefon {
    private final String nazovTelefonu;
    private final int idTelefonu;
    private final int kapacitaKontaktov;
    private int pocetKontaktov = 0;
    private final ArrayList<Kontakt> zoznamKontaktov;

    private static final int DEFAULT_N_OF_CONTACTS = 50;
    public Telefon(String nazovTelefonu, int kapacitaKontaktov) {
        Rozdelenie.print();

        //inicializuje názov telefónu
        this.nazovTelefonu = nazovTelefonu;
        System.out.println("Názov telefónu: "+this.nazovTelefonu);

        //inicializuje unikátne ID telefónu
        this.idTelefonu = GetID.ID;
        GetID.ID++;//zvyšuje sa ID o číslo 1
        System.out.println("ID telefónu: "+this.idTelefonu);

        //skúška že či užívateľ zadal kladný počet kontaktov
        if(kapacitaKontaktov >0){
            this.kapacitaKontaktov = kapacitaKontaktov;
            System.out.println("Pamäť telefónu: "+this.kapacitaKontaktov+" kontaktov.");
        }
        else{
            System.out.println("Nesmieš zadať 0 alebo záporné číslo ako počet kontaktov!");
            this.kapacitaKontaktov = DEFAULT_N_OF_CONTACTS;//nastavuje na defaultnú premennú
            System.out.println("Vytvorených defaultnych "+DEFAULT_N_OF_CONTACTS+" kontaktov.");
        }

        //inicializuje prázdny ArrayList pre telefónny zoznam
        this.zoznamKontaktov = new ArrayList<>();

        //spustenie telefónu
        spusti();
    }

    private static final Scanner input = new Scanner(System.in);

    private void spusti(){

        boolean koniec = false;
        int volba = 0;

        while(!koniec){
            switch (volba){
                case 0:
                    printMoznosti();
                    volba = zvolenieMoznosti();
                    break;
                case 1:
                    printSpecifikacie();
                    volba = zvolenieMoznosti();
                    break;
                case 2:
                    pridajKontakt();
                    volba = zvolenieMoznosti();
                    break;
                case 3:
                    upravKontakt();
                    volba = zvolenieMoznosti();
                    break;
                case 4:
                    vymazKontakt();
                    volba = zvolenieMoznosti();
                    break;
                case 5:
                    vypisKontaktov();
                    volba = zvolenieMoznosti();
                    break;
                case 6:
                    koniec = true;
                    System.out.println("Ukončujem program.");
                    break;
                default:
                    System.out.println("Nebola zadaná správna hodnota!");
                    input.nextLine();
                    volba = zvolenieMoznosti();
                    break;
            }
        }
    }

    private void pridajKontakt(){
        Rozdelenie.print();

        System.out.print("Meno kontaktu: ");
        String meno = input.next();

        System.out.print("Tel. číslo: ");
        String telCislo = input.next();

        Kontakt kontakt = Kontakt.vytvorKontakt(meno, telCislo);

        //ak kontakt NEEXISTUJE
       if(najdiKontakt(kontakt.getMeno()) == -1){
           //ak JE voľná pamäť v telefóne
           if(jeVolnaPamat()){
               zoznamKontaktov.add(kontakt);
               pocetKontaktov++;

               System.out.println("Kontakt úspešne pridaný!");
           }

           //ak NIE JE voľná pamäť v telefóne
           else{
               System.out.println("Nie je možné pridať kontakt --> plná pamäť");
           }
        }

        //ak kontakt EXISTUJE
        else {
            System.out.println("Kontakt s menom "+meno+" už existuje!");
        }
    }

    private boolean jeVolnaPamat(){
        return this.pocetKontaktov<kapacitaKontaktov;
    }

    private void upravKontakt(){
        Rozdelenie.print();

        System.out.print("Meno kontaktu, ktorý chceš upraviť: ");
        String staryNazov = input.next();

        int nKontaktu = najdiKontakt(staryNazov);

        if(nKontaktu > -1){
            System.out.print("Zmeň názov na: ");
            String novyNazov = input.next();

            if(najdiKontakt(novyNazov) == -1){
                //vytvorí nový kontakt na náhradu ktorý obsahuje nový názov a pôvodné telefónne číslo
                Kontakt novyKontakt = new Kontakt(novyNazov, zoznamKontaktov.get(nKontaktu).getTelCislo());

                //výmena kontaktu
                zoznamKontaktov.set(nKontaktu, novyKontakt);

                System.out.println("Meno "+staryNazov+" vymenené za "+novyNazov);
            }
            else{
                System.out.println("Nemožno zmeniť meno na "+staryNazov+", meno už existuje!");
            }

        }
        else{
            System.out.println("Kontakt ktorý sa snažiš upraviť s menom "+staryNazov+" neexistuje!");
        }
    }

    private void vymazKontakt(){
        Rozdelenie.print();

        System.out.print("Zadaj názov kontaktu, ktorý chceš vymazať: ");
        String naVymazaznie = input.next();

        int nKontakt = najdiKontakt(naVymazaznie);

        if(nKontakt>-1){
            zoznamKontaktov.remove(nKontakt);
            System.out.println("Kontakt "+naVymazaznie+" úspešne vymazaný.");
        }
        else{
            System.out.println("Kontakt "+naVymazaznie+" nebol nájdený.");
        }
    }

    private void vypisKontaktov(){
        Rozdelenie.print();
        for(Kontakt kontakt : zoznamKontaktov){
            System.out.println(kontakt.getMeno()+": "+kontakt.getTelCislo());
        }
    }

    private int najdiKontakt(String menoKontaktu){
        for(int i=0; i<zoznamKontaktov.size(); i++){
            Kontakt kontakt = zoznamKontaktov.get(i);

            if(kontakt.getMeno().equals(menoKontaktu)){
                return i;
            }
        }

        return -1;
    }

    private int zvolenieMoznosti(){
        Rozdelenie.print();

        System.out.print("Tvoja voľba?: ");
        if(input.hasNextInt()){
            return input.nextInt();
        }
        return Integer.MAX_VALUE;
    }

    private void printMoznosti(){
        Rozdelenie.print();
        System.out.println("Zadaj -->");
        System.out.println("0 - výpis možností");
        System.out.println("1 - vypis špecifikácií telefónu");
        System.out.println("2 - pridaj kontakt");
        System.out.println("3 - uprav kontakt");
        System.out.println("4 - vymaz kontakt");
        System.out.println("5 - vypis kontaktov");
        System.out.println("6 - koniec programu");
    }

    private void printSpecifikacie(){
        Rozdelenie.print();
        System.out.println("Názov telefónu: "+this.nazovTelefonu);
        System.out.println("ID telefónu: "+this.idTelefonu);
        System.out.println("Pamäť telefónu: "+this.kapacitaKontaktov+" kontaktov");
    }

}
