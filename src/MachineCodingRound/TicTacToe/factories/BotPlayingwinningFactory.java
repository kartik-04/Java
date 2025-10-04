package MachineCodingRound.TicTacToe.factories;

import MachineCodingRound.TicTacToe.models.BotDifficultyLevel;
import MachineCodingRound.TicTacToe.strategies.botPlayingStrategy.BotPlayingStrategy;
import MachineCodingRound.TicTacToe.strategies.botPlayingStrategy.EasyBotPlayingStrategy;
import MachineCodingRound.TicTacToe.strategies.botPlayingStrategy.HardBotPlayingStrategy;
import MachineCodingRound.TicTacToe.strategies.botPlayingStrategy.MediumBotPlayingStrategy;

public class BotPlayingwinningFactory {
    public static BotPlayingStrategy getBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
       if(botDifficultyLevel == BotDifficultyLevel.EASY){
           return new EasyBotPlayingStrategy();
       }else if(botDifficultyLevel == BotDifficultyLevel.MEDIUM){
           return new MediumBotPlayingStrategy();
       }else if(botDifficultyLevel == BotDifficultyLevel.HARD){
           return new HardBotPlayingStrategy();
       }
       return null;
    }
}
