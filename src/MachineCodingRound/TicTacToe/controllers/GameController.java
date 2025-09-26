package MachineCodingRound.TicTacToe.controllers;

import MachineCodingRound.TicTacToe.Exceptions.InvalidMoveException;
import MachineCodingRound.TicTacToe.models.Game;
import MachineCodingRound.TicTacToe.models.GameState;
import MachineCodingRound.TicTacToe.models.Player;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players){
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public GameState getState(Game game) {
        return game.getState();
    }
}
