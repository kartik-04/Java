package MachineCodingRound.TicTacToe.strategies.botPlayingStrategy;

import MachineCodingRound.TicTacToe.models.*;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        for(int i = 0; i < board.getDimension(); i++){
            for(int j = 0; j < board.getDimension(); j++){
                Cell cell = board.getBoard().get(i).get(j);
                if(cell.getState().equals(CellState.EMPTY)){
                    return new Move(player, cell);
                }
            }
        }
        return null;
    }
}
