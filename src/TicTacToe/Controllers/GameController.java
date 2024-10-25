package TicTacToe.Controllers;

import TicTacToe.Exceptions.DimensionAndPlayerCountMismatch;
import TicTacToe.Exceptions.InvalidPlayerCountException;
import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
import TicTacToe.Models.PlayerType;
import TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidPlayerCountException, DimensionAndPlayerCountMismatch {
        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void display(Game game){
        System.out.println("The board view:");
        game.displayBoard();
    }

    public void makeMove(Game game){
        //parsing http req
        game.makeMove();

        //creating http response
    }

    public void undo(Game game){
        game.undo();
    }

    public Player getCurrentPlayer(Game game){
        return game.getCurrentPlayer();
    }
}