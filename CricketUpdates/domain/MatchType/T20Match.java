package LLD.CricketUpdates.domain.MatchType;

import LLD.CricketUpdates.domain.Match;

public class T20Match extends Match {

    public int getOvers(){
        return 20;
    }

    public int getNumberOfBowlers(){
        return 4;
    }

    public int maxOverPerBowler(){
        return 5;
    }
}
