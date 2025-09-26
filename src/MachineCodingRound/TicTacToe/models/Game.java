package MachineCodingRound.TicTacToe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int nextMovePlayerIndex;
    private GameState state;
    private Player winner;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Game(int Dimension, List<Player> players){
        board = new Board(Dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.nextMovePlayerIndex = 0;
        this.state = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void printBoard() {
        board.printBoard();
    }

    private boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || col < 0 || row >= board.getDimension() || col >= board.getDimension()){
            return false;
        }

        if(!board.getBoard().get(row).get(col).getState().equals(CellState.EMPTY)){
            return false;
        }
        return true;
    }

    public void makeMove() throws IllegalArgumentException{
        Player currentPlayer = players.get(nextMovePlayerIndex);

        System.out.println("This is " + currentPlayer.getName() + "'s move");

        // Player will choose where to move on the board
        Move move = currentPlayer.makeMove(board);

        // We will validate the move and check if cell is available or not
        if(!validateMove(move)){
            throw new IllegalArgumentException("Invalid move");
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cell = board.getBoard().get(row).get(col);
        cell.setState(CellState.EMPTY);
        cell.setPlayer(currentPlayer);

        nextMovePlayerIndex = (nextMovePlayerIndex +1) % players.size();

        Move finalMove = new Move(currentPlayer, cell);
        this.moves.add(finalMove);


    }
    public static class Builder{
        private int dimension;
        private List<Player> players;

        private Builder(){
            this.dimension = 0;
            this.players = new ArrayList<>();
        }

        private void validateBotCount() throws IllegalArgumentException{
            int count = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    count++;
                }
            }
            if(count >= players.size()){
                throw new IllegalArgumentException("Bot count cannot exceed number of players");
            }
        }

        private void validateUniqueSymbols() throws IllegalArgumentException{
            Set<Character> uniqueSymbols = new HashSet<>();
            for(Player player : players){
                uniqueSymbols.add(player.getSymbol().getAChar());
            }
            if(uniqueSymbols.size() != players.size()){
                throw new IllegalArgumentException("Unique symbols cannot exceed number of players");
            }
        }

        private void validation(){
            validateBotCount();
            validateUniqueSymbols();
        }

        public Game build() {
            validation();

            return new Game(dimension, players);
        }
        public int getDimension() {
            return dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
    }
}
