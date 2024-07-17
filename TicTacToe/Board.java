package LLD.TicTacToe;

public class Board {
    private final int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean successfullyPlaced(Cell newTurn) {

    }
}
