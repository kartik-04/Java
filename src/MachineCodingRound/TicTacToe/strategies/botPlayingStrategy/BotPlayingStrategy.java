package MachineCodingRound.TicTacToe.strategies.botPlayingStrategy;

import MachineCodingRound.TicTacToe.models.Board;
import MachineCodingRound.TicTacToe.models.Move;
import MachineCodingRound.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
