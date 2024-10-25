package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.Game;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board);
}