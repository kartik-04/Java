package MachineCodingRound.TicTacToe.models;

public class Bot extends Player {
    private BotDifficultyLevel difficultyLevel;

    public Bot(Symbol symbol, PlayerType playerType,  String name,BotDifficultyLevel difficultyLevel) {
        super(name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
    }

    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}