package MachineCodingRound.TicTacToe.strategies.winningStrategy;

import MachineCodingRound.TicTacToe.models.Board;
import MachineCodingRound.TicTacToe.models.Cell;
import MachineCodingRound.TicTacToe.models.Move;
import MachineCodingRound.TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningPlayingStrategy implements WinningStrategy {
    private final Map<Integer, Map<Symbol, Integer>> colmap = new HashMap<>();

    @Override
    public boolean makeMove(Move move, Board board) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!colmap.containsKey(col)) {
            colmap.put(col, new HashMap<>());
        }

        Map<Symbol, Integer> currColMap = colmap.get(col);

        if(!currColMap.containsKey(symbol)) {
            currColMap.put(symbol, 0);
        }

        currColMap.put(symbol, currColMap.get(symbol) + 1);

        return currColMap.get(symbol) == board.getDimension();
    }
}
