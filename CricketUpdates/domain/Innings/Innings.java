package LLD.CricketUpdates.domain.Innings;

import LLD.CricketUpdates.domain.Over;
import LLD.CricketUpdates.domain.Team;

import java.util.List;

public class Innings {
    Team battingTeam;
    Team bowlingTeam;
    List<Over> overs;
    int runsSoFar;
    int wicketSoFar;

    public void startInnings() {
    }
}
