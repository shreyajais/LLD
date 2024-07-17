package LLD.TicTacToe;

import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private final Player p1;
    private final Player p2;

    private final Board board;

    Deque<Player> dq;

    public TicTacToeGame() {
        this.p1 = new Player(PlayingPiece.O);;
        this.p2 = new Player(PlayingPiece.X);
        this.board = new Board(3);
        this.dq.add(p1);
        this.dq.add(p2);
    }

    public static void main(String args[]){
        TicTacToeGame game = new TicTacToeGame();
        Player winner = game.playGame();
    }

    private void playGame() {
        boolean isWinner = false;
        while(!isWinner){
            Player playingPlayer = dq.getFirst();
            List<Cell> emptyCell = getEmptyCell();
            Scanner sc = new Scanner(System.in);
            String place = sc.nextLine();
            String[] piecePlace = place.split(",");
            int rowPlace = Integer.parseInt(piecePlace[0]);
            int colPlace = Integer.parseInt(piecePlace[1]);
            Cell newTurn = new Cell(rowPlace, colPlace);
            if(board.successfullyPlaced(newTurn)){
                boolean isPlayerWinner = checkWinner(playingPlayer);
                if(isPlayerWinner){
                    isWinner = true;
                    System.out.println("Winner is" + playingPlayer);
                }
            } else {
                dq.addFirst(playingPlayer);
                continue;
            }
        }
        if(!isWinner) System.out.println("tie");
    }

    private List<Cell> getEmptyCell() {
    }

    private boolean checkWinner(Player playingPlayer){

    }

}
