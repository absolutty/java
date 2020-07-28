package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.funkcie.Rozdelenie;

public class Divadlo {
   private final String nazovDivadla;
   private final List<Sedadlo> zoznamSedadiel;

   //písmeno ktorým začína označenie sedadiel
   private static final char PRVE_PISMENO = 'A';

    public Divadlo(String nazovDivadla, int pocetRadov, int pocetSedadielRadu) {
        this.nazovDivadla = nazovDivadla;
        this.zoznamSedadiel = new ArrayList<>();

        //generuje (pocetRadov * pocetSedadielRadu) sedadiel
        generujSedadla(pocetRadov, pocetSedadielRadu);
    }

    private void generujSedadla(int pocetRadov, int pocetSedadielRadu){
        int poslednyRad = PRVE_PISMENO + + (pocetRadov-1);

        for(char znak = PRVE_PISMENO; znak <= poslednyRad; znak++){
            for(int cislo = 1; cislo<=pocetSedadielRadu; cislo++){
                zoznamSedadiel.add(new Sedadlo(znak + String.format("%02d", cislo)));
                //generuje označenia vo forme A01, A02, ..., B01, B02, ...,
            }
        }
    }

    public void vypisSedadiel(){
        Rozdelenie.vypis();

        char prvePismeno = PRVE_PISMENO;

        /*
        vypisuje sedadlá vo forme
        A01, A02, ...,
        B01, B02, ...,
        ...
        */
        for(Sedadlo sedadlo : zoznamSedadiel){
            if( sedadlo.cisloSedadla.charAt(0) == prvePismeno ){
                System.out.print(sedadlo.cisloSedadla + " ");
            }
            else{
                System.out.println();
                System.out.print(sedadlo.cisloSedadla + " ");
                prvePismeno++;
            }
        }

        System.out.println();
    }

    //funkcia na rezerváciu sedadla podľa jeho čísla
    public void rezervuj(String cisloSedadla){
        Sedadlo hladaneSedadlo = new Sedadlo(cisloSedadla);//skúšobný objekt pre použitie compareTo

        //vráti hodnotu s pozíciou sedadla, ak nebolo nájdené vráti -1
        int najdeneSedadloPoz = Collections.binarySearch(zoznamSedadiel, hladaneSedadlo, null);

        if(najdeneSedadloPoz >= 0){
            zoznamSedadiel.get(najdeneSedadloPoz).zarezervuj();
        }
        else{
            Rozdelenie.vypis();
            System.out.println("Sedadlo s číslom " + cisloSedadla + " nebolo nájdené.");
        }
    }

    //funkcia na zrušenie rezervácie sedadla podľa jeho čísla
    public void zrusRezervaciu(String cisloSedadla){
        Sedadlo hladaneSedadlo = new Sedadlo(cisloSedadla);//skúšobný objekt pre použitie compareTo

        //vráti hodnotu s pozíciou sedadla, ak nebolo nájdené vráti -1
        int najdeneSedadloPoz = Collections.binarySearch(zoznamSedadiel, hladaneSedadlo, null);

        if(najdeneSedadloPoz >= 0){
            zoznamSedadiel.get(najdeneSedadloPoz).odrezervuj();
        }
        else{
            Rozdelenie.vypis();
            System.out.println("Sedadlo s číslom " + cisloSedadla + " nebolo nájdené.");
        }
    }

    public String getNazovDivadla() {
        return nazovDivadla;
    }

    private static class Sedadlo implements Comparable<Sedadlo>{
       private final String cisloSedadla;
       private boolean zarezervovane = false;

       private static final String rezerv = "Zarezervovanie ";
       private static final String odrezerv = "Zrušenie rezervácie ";
       private static final String JJ = "úspešné";
       private static final String NN = "neúspešné";

       public Sedadlo(String cisloSedadla) {
           this.cisloSedadla = cisloSedadla;
       }

        @Override // porovnáva na základe jeho cisla (cisloSedadla)
        public int compareTo(Sedadlo sedadlo) {
            return this.cisloSedadla.compareToIgnoreCase(sedadlo.cisloSedadla);
        }

        private void zarezervuj(){
           Rozdelenie.vypis();

           if(!this.zarezervovane){
               System.out.println("Rezervujem sedadlo s číslom "+ cisloSedadla);
               this.zarezervovane = true;
               System.out.println(rezerv + JJ);
           }
           else{
               System.out.println("Sedadlo s číslo "+ cisloSedadla +" je už rezervované");
               System.out.println(rezerv + NN);
           }
       }

       private void odrezervuj(){
           Rozdelenie.vypis();

           if(this.zarezervovane){
               System.out.println("Ruším rezerváciu s číslom "+ cisloSedadla);
               this.zarezervovane = false;
               System.out.println(odrezerv + JJ);
           }
           else{
               System.out.println("Na sedadle s číslom "+ cisloSedadla + " nie je rezervacia");
               System.out.println(odrezerv + NN);
           }
       }
   }
}
