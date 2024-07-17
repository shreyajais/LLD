package LLD.CricketUpdates.domain.Innings;

import LLD.CricketUpdates.domain.Ball;

import java.util.ArrayList;
import java.util.List;

public class InningsController {
    Innings innings;
    List<ScoreObserver> scoreObserverList;

    public InningsController(Innings innings, List<ScoreObserver> scoreObserverList) {
        this.innings = innings;
        this.scoreObserverList = new ArrayList<>();
    }

    public void notifyObserver(Ball recentBall){
        scoreObserverList.forEach(scoreObserver -> scoreObserver.update(recentBall));
    }
}
