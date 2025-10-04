package MachineCodingRound.TicTacToe.strategies.winningStrategy;

import MachineCodingRound.TicTacToe.models.Board;
import MachineCodingRound.TicTacToe.models.Move;
import MachineCodingRound.TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningPlayingstrategy implements WinningStrategy {
    private final Map<Integer, Map<Symbol, Integer>> rowMap = new HashMap<>();

    @Override
    public boolean makeMove(Move move, Board board) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!rowMap.containsKey(row)) {
            rowMap.put(row, new HashMap<>());
        }

        Map<Symbol, Integer> currRowMap = rowMap.get(row);

        if(!currRowMap.containsKey(symbol)) {
            currRowMap.put(symbol, 0);
        }

        currRowMap.put(symbol, currRowMap.get(symbol) + 1);

        return currRowMap.get(symbol) == board.getDimension();
    }
}
