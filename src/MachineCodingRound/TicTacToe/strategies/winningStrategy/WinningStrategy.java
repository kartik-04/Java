package MachineCodingRound.TicTacToe.strategies.winningStrategy;

import MachineCodingRound.TicTacToe.models.Board;
import MachineCodingRound.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean makeMove(Move move, Board board);
}
