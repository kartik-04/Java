package MachineCodingRound.TicTacToe.strategies.winningStrategy;

import MachineCodingRound.TicTacToe.models.Board;
import MachineCodingRound.TicTacToe.models.Move;
import MachineCodingRound.TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningPlayingStrategy implements WinningStrategy {
    private final Map<Symbol, Integer> leftDiagMap = new HashMap<>();
    private final Map<Symbol, Integer> RightDiagMap = new HashMap<>();

    @Override
    public boolean makeMove(Move move, Board board) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Symbol symbol = move.getPlayer().getSymbol();

        //Left diagonal
        if(row == col){
            if(!leftDiagMap.containsKey(symbol)){
                leftDiagMap.put(symbol, 0);
            }

            leftDiagMap.put(symbol, leftDiagMap.get(symbol) + 1);

            if(leftDiagMap.get(symbol) == board.getDimension()){
                return true;
            }
        }

        //Right  Diagonal
        if(row+col == board.getDimension()-1){
            if(!RightDiagMap.containsKey(symbol)){
                RightDiagMap.put(symbol, 0);
            }

            RightDiagMap.put(symbol, RightDiagMap.get(symbol) + 1);

            return RightDiagMap.get(symbol) == board.getDimension();
        }
        return false;
    }
}
