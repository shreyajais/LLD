package LLD.CricketUpdates.domain;

import java.util.List;

public class Team {
    public String name;
    public boolean isWinner;
    List<Player> playerList;
    Player captain;
    Player wicketkeeper;
    List<Player> bowlers;
    List<Player> batsman;
    List<Player> extras;

}
