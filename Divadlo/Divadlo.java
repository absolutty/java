package com.example;

import java.util.ArrayList;
import java.util.List;
import com.example.funkcie.Rozdelenie;

public class Divadlo {
   private final String nazovDivadla;
   private final List<Sedadlo> zoznamSedadiel = new ArrayList<>();

   //písmeno ktorým začína označenie sedadiel
   private static final char PRVE_PISMENO = 'A';

    public Divadlo(String nazovDivadla, int pocetRadov, int pocetSedadielRadu) {
        this.nazovDivadla = nazovDivadla;

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
        boolean najdene = false;

        //cyklus na nájdenie daného sedadla
        for(Sedadlo sedadlo : zoznamSedadiel){
            //ak bolo nájdené
            if(sedadlo.cisloSedadla.equals(cisloSedadla)){
                najdene = true;
                sedadlo.zarezervuj();
            }
        }

        //ak je boolean najdene false, sedadlo nebolo najdene
        if(!najdene){
            Rozdelenie.vypis();
            System.out.println("Sedadlo s číslom " + cisloSedadla + " nebolo nájdené.");
        }
    }

    //funkcia na zrušenie rezervácie sedadla podľa jeho čísla
    public void zrusRezervaciu(String cisloSedadla){
        boolean najdene = false;

        //cyklus na nájdenie daného sedadla
        for(Sedadlo sedadlo : zoznamSedadiel){
            //ak bolo nájdené
            if(sedadlo.cisloSedadla.equals(cisloSedadla)){
                najdene = true;
                sedadlo.odrezervuj();
            }
        }

        //ak je boolean najdene false, sedadlo nebolo najdene
        if(!najdene){
            Rozdelenie.vypis();
            System.out.println("Sedadlo s číslom " + cisloSedadla + " nebolo nájdené.");
        }
    }

    public String getNazovDivadla() {
        return nazovDivadla;
    }

    private static class Sedadlo{
       private final String cisloSedadla;
       private boolean zarezervovane = false;

       private static final String rezerv = "Zarezervovanie ";
       private static final String odrezerv = "Zrušenie rezervácie ";
       private static final String JJ = "úspešné";
       private static final String NN = "neúspešné";

       public Sedadlo(String cisloSedadla) {
           this.cisloSedadla = cisloSedadla;
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
