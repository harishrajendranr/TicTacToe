package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private final Map<Character, Integer> mainDiagonal;
    private final Map<Character, Integer> secondaryDiagonal;

    public DiagonalWinningStrategy()
    {
        this.mainDiagonal = new HashMap<>();
        this.secondaryDiagonal = new HashMap<>();
    }
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Character symbol = move.getPlayer().getSymbol();

        // Check main diagonal
        if (row == col) {
            mainDiagonal.put(symbol, mainDiagonal.getOrDefault(symbol, 0) + 1);
            if (mainDiagonal.get(symbol) == board.getDimension()) {
                return true;
            }
        }

        // Check secondary diagonal
        if (row + col == board.getDimension() - 1) {
            secondaryDiagonal.put(symbol, secondaryDiagonal.getOrDefault(symbol, 0) + 1);
            if (secondaryDiagonal.get(symbol) == board.getDimension()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void handleUndo(Move move) {
//        int row = move.getCell().getRow();
//        int col = move.getCell().getCol();
//        Character symbol = move.getPlayer().getSymbol();
//
//        HashMap<Character, Integer> countMap;
//        countMap = mainDiagonal.get(row);
//        countMap.put(symbol, countMap.get(symbol)-1);
//        HashMap<Character, Integer> countMap1 = secondaryDiagonal.get(col);
//        countMap.put(symbol, countMap.get(symbol)-1);

    }
}
