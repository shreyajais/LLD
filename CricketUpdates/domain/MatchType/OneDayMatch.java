package LLD.CricketUpdates.domain.MatchType;

import LLD.CricketUpdates.domain.Match;

public class OneDayMatch extends Match {
    public int getOvers(){
        return 50;
    }

    public int getNumberOfBowlers(){
        return 5;
    }

    public int maxOverPerBowler(){
        return 10;
    }
}
