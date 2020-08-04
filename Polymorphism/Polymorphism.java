package com.company;

import com.example.funkcie.Rozdelenie;

public class Polymorfizmus {

    public static void main(String[] args) {
        for(int i=0; i<=9; i++){
            Rozdelenie.vypis(30);

            Film film = randomFilm();

            System.out.println("Film #"+i+": "+ film.getNazovFilmu());
            System.out.println("Príbeh: "+ film.pribeh());
        }
    }

    public static Film randomFilm(){
        int randomNum = (int) (Math.random()*4) +1;
        System.out.println("Random vygenerované číslo číslo: "+randomNum);
        switch (randomNum){
            case 1:
                return new Jaws();
            case 2:
                return new IndianaJones();
            case 3:
                return new Cars();
            default:
                return new ZohanKadernik();
        }
    }
}

class Film {
    public String nazovFilmu;

    public Film(String nazovFilmu) {
        this.nazovFilmu = nazovFilmu;
    }
    public String pribeh(){
        return "No plot here";
    }

    public String getNazovFilmu() {
        return nazovFilmu;
    }
}

class Jaws extends Film {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String pribeh() {
        return "ham ham a nemáš nohu";
    }
}

class IndianaJones extends Film {
    public IndianaJones(){
        super("Indiana Jones");
    }

    @Override
    public String pribeh() {
        return "I hate snakes";
    }
}

class Cars extends Film {
    public Cars(){
        super("Cars");
    }

    @Override
    public String pribeh() {
        return "vrm vrm, rozprávka o autách";
    }
}

class ZohanKadernik extends Film {
    public ZohanKadernik(){
        super("Zohan kaderník");
    }

    @Override
    public String pribeh(){
        return "Idk zaspal som pri tom";
    }
}
