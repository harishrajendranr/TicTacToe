package TicTacToe.Validations;

import TicTacToe.Exceptions.DimensionAndPlayerCountMismatch;
import TicTacToe.Exceptions.InvalidPlayerCountException;
import TicTacToe.Models.Player;

import java.util.List;

public class DimensionAndPlayerCount {
    public static void validate(int dimension, List<Player> players) throws InvalidPlayerCountException, DimensionAndPlayerCountMismatch {
        if(players.size() <= 1 ){
            throw new InvalidPlayerCountException("Player count is invalid");
        }else if(players.size() >= dimension){
            throw new DimensionAndPlayerCountMismatch("Player count should be lesser than dimension");
        }
    }
}