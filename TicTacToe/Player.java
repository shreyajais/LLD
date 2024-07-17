package LLD.TicTacToe;

public class Player {
    private final PlayingPiece playingPiece;


    public Player(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }
}
