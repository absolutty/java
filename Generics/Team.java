package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private final String menoTimu;
    private int odohrateHry = 0;
    private int vyhrateHry = 0;
    private int remizovaneHry = 0;
    private int prehrateHry = 0;
    private List<T> zoznamHracov = new ArrayList<>();

    public Team(String menoTimu) {
        this.menoTimu = menoTimu;
    }

    public String getMenoTimu() {
        return menoTimu;
    }

    public void pridajHraca(T hrac){
        if(!zoznamHracov.contains(hrac)){
            zoznamHracov.add(hrac);
            System.out.println("Hráč "+hrac.getMenoHraca()+" úspešne pridaný do tímu s názvom "+this.menoTimu);
        }
        else{
            System.out.println("Hráč "+hrac.getMenoHraca()+" už je v tíme.");
        }
    }

    public void vypisStats(){
        System.out.println(getMenoTimu());
        System.out.println("Body: "+bodyTimu());
        System.out.println("Počet hračov: "+getPocetHracov());
        System.out.println("Odohraté hry: "+getOdohrateHry());
        System.out.println("Vyhraté hry: "+getVyhrateHry());
        System.out.println("Remizované hry: "+getRemizovaneHry());
        System.out.println("Prehraté hry: "+getPrehrateHry());
    }

    public void vypisPocetHracov(){
        System.out.println("Tím: "+getMenoTimu()+", počet hráčov: "+getPocetHracov());
    }

    public void vysledokZapasu(Team<T> oponent, int prveSkore, int druheSkore){
        String vyslednaSprava;

        //výhra
        if(prveSkore>druheSkore){
            this.vyhrateHry++;
            vyslednaSprava = " vyhral nad ";
        }

        //remíza
        else if(prveSkore==druheSkore){
            this.remizovaneHry++;
            vyslednaSprava = " remizoval s ";
        }

        //prehra
        else{
            this.prehrateHry++;
            vyslednaSprava = " prehral nad ";
        }

        //navýši sa počet odohraných hier
        odohrateHry++;

        if(oponent!=null){
            System.out.println(getMenoTimu()+ vyslednaSprava + oponent.getMenoTimu());
            oponent.vysledokZapasu(null, druheSkore, prveSkore);
        }
    }

    private int bodyTimu(){
        return (vyhrateHry*2) + remizovaneHry;
    }

    private int getOdohrateHry() {
        return odohrateHry;
    }

    private int getVyhrateHry() {
        return vyhrateHry;
    }

    private int getRemizovaneHry() {
        return remizovaneHry;
    }

    private int getPrehrateHry() {
        return prehrateHry;
    }

    private int getPocetHracov(){
        return this.zoznamHracov.size();
    }

    @Override
    public int compareTo(Team<T> team) {
        //ak má tento tím viacej bodov
        if(this.bodyTimu() > team.bodyTimu()){
            return -1;
        }

        //ak má tento tím menej bodov
        else if(this.bodyTimu() < team.bodyTimu()){
            return 1;
        }

        //ak majú rovnaký počet bodov
        return 0;
    }


}
