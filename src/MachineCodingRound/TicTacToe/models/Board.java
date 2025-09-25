package MachineCodingRound.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;


    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>();

        for(int i = 0; i < dimension; i++){
            board.add(new ArrayList<>());
            for(int j = 0; j < board.get(i).size(); j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard() {
        for(int i = 0; i < board.size(); i++){
            for(int j = 0; j < board.get(i).size(); j++){
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

}
