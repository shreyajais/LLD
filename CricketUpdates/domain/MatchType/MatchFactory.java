package LLD.CricketUpdates.domain.MatchType;

import LLD.CricketUpdates.Enums.MatchType;
import LLD.CricketUpdates.domain.Match;

public class MatchFactory {
    
    MatchFactory instance;

    public MatchFactory getInstance(){
        if(instance== null) return new MatchFactory();
        else return instance;
    }
    
    public Match getMatchType(int numberOfOvers){
        switch (numberOfOvers){
            case 50: return new OneDayMatch();
            case 20: return new T20Match();
            default: return new OneDayMatch();
        }
    }

}
