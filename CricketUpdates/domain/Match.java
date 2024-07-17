package LLD.CricketUpdates.domain;

import LLD.CricketUpdates.Enums.MatchType;
import LLD.CricketUpdates.domain.Innings.Innings;

public abstract class Match {

    MatchType matchType;

    Innings firstInnings;
    Innings secondInnings;
    Team teamA;
    Team teamB;


    public Team toss(){
        int x = (int) Math.random();
        if(x%2==0) return teamA;
        else return teamB;
    }

    public void startGame(){
        Team tossWinningTeam = toss();
        firstInnings.startInnings();
        secondInnings.startInnings();
        String winnerTeam = teamA.isWinner ? teamA.name : teamB.name;
        System.out.println("winner of the match is :" + winnerTeam);
    }
}
