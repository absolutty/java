package com.company.hraci;

import com.company.RozdelenieRiadku;
import com.company.Wait;

import java.util.Random;

public class VylepsenyHrac {
    private String menoHraca;
    private int healthPoints;
    private String zbran;

    public VylepsenyHrac() {
        this("Default hráč", 99, "kameň");
    }

    private String[] arrZoznamHracov = new String[999];

    private static final int MIN_HP = 0;
    private static final int MAX_HP = 100;

    public VylepsenyHrac(String menoHraca, int healthPoints, String zbran) {
        pridelovanieMena(menoHraca);
        pridelovanieHP(healthPoints);
        pridelovanieZbrane(zbran);
    }

    private static boolean isInRangeOfHP(int healthPoints){
        return (healthPoints>MIN_HP && healthPoints<=MAX_HP);
    }

    private boolean isNameWritten(String menoHraca){
        if(arrZoznamHracov[0]!=null){
            int dlzkaArrayu = (this.arrZoznamHracov).length;
            if(dlzkaArrayu>0){
                for(int i=0; i<dlzkaArrayu; i++){
                    if(menoHraca.equals(arrZoznamHracov[i])){
                        return true;
                    }
                }
                return false;
            }
        }
        else{
            arrZoznamHracov[0] = menoHraca;
            return true;
        }
        return true;
    }

    private void pridelovanieMena(String menoHraca){
        if(!isNameWritten(menoHraca)){
            RozdelenieRiadku.vypis();
            this.menoHraca = menoHraca;
            System.out.println("Meno hráča: "+this.menoHraca);
        }
        else{
            RozdelenieRiadku.vypis();
            chybaMenoGeneruj(menoHraca);
        }
    }
    private void pridelovanieHP(int healthPoints){
        if(isInRangeOfHP(healthPoints)){
            RozdelenieRiadku.vypis();
            this.healthPoints = healthPoints;
            System.out.println("HP hráča: "+this.healthPoints);
        }
        else{
            RozdelenieRiadku.vypis();
            chybaHPGeneruj();
        }
    }
    private void pridelovanieZbrane(String zbran){
        this.zbran = zbran;
    }

    private static void chybaHPGeneruj(){
        System.out.printf("HP musí byť zadané v rozmedzí %d-%d\n", MIN_HP, MAX_HP);
        Wait.spusti();
        System.out.println("Nastavujem na náhodnú hodnotu!");
        Random random = new Random();
        int randomHP = random.nextInt((MAX_HP - MIN_HP) + 1) + MIN_HP;
        Wait.spusti();
        System.out.println("HP hráča: "+randomHP);
    }
    private void chybaMenoGeneruj(String menoHraca){
        System.out.println("Meno ktoré sa snažíš zadať je obsadené :/");
        Random random = new Random();
        int randomNum = random.nextInt((MAX_HP - MIN_HP) + 1) + MIN_HP;
        this.menoHraca = menoHraca+randomNum;
        Wait.spusti();
        System.out.println("Vygenerované meno hráča: "+ this.menoHraca);
    }
}
