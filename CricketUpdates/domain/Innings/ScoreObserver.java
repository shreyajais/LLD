package LLD.CricketUpdates.domain.Innings;

import LLD.CricketUpdates.domain.Ball;

public interface ScoreObserver {
    void update(Ball recentBall);
}
