package com.company;

import com.company.players.BaseballPlayer;
import com.company.players.FootballPlayer;
import com.company.players.SoccerPlayer;

public class Main {

    public static void main(String[] args) {
        BaseballPlayer jano = new BaseballPlayer("Jano");
        FootballPlayer peter = new FootballPlayer("Peter");
        FootballPlayer ivan = new FootballPlayer("Ivan");
        SoccerPlayer stevo = new SoccerPlayer("Števo");

        Team<FootballPlayer> fotballTeamPrvy = new Team<>("Fotbalisti 1");
        fotballTeamPrvy.pridajHraca(peter);
        Team<FootballPlayer> fotballTeamDruhy = new Team<>("Fotbalisti 2");
        fotballTeamDruhy.pridajHraca(ivan);

        Team<BaseballPlayer> baseballTeam = new Team<>("Bejzbalisti");
        baseballTeam.pridajHraca(jano);

        Team<SoccerPlayer> soccerTeam = new Team<>("Socceristi");
        soccerTeam.pridajHraca(stevo);

        fotballTeamPrvy.vysledokZapasu(fotballTeamDruhy, 2, 1);

        System.out.println();
        fotballTeamPrvy.vypisStats();

        System.out.println();
        fotballTeamDruhy.vypisStats();

        System.out.println(fotballTeamPrvy.compareTo(fotballTeamDruhy));
    }
}
