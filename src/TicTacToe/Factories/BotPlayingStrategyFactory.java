
package TicTacToe.Factories;

import TicTacToe.Models.BotPlayingDifficulty;
import TicTacToe.Strategies.BotPlayingStrategy;
import TicTacToe.Strategies.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotPlayingDifficulty difficulty){
        if(difficulty.equals(BotPlayingDifficulty.EASY)){
            return new EasyBotPlayingStrategy();
        }
        //rest if and else
        return null;
    }
}
