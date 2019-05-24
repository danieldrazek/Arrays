
package array;

import java.util.Arrays;


public class ArrayEx4 {
    
    //deklaracja zmienych "magic numbers" i przypisanie im numerow
    public static final int EMPTY = 0;
    public static final int B_PAWN = 1;
    public static final int B_ROOK = 2;
    public static final int B_BISHOP = 3;
    public static final int B_KNIGHT = 4;
    public static final int B_QUEEN = 5; 
    public static final int B_KING = 6;
    public static final int W_PAWN = 7;
    public static final int W_ROOK = 8;
    public static final int W_BISHOP = 9;
    public static final int W_KNIGHT = 10;
    public static final int W_QUEEN = 11;
    public static final int W_KING = 12;
    //deklaracja tablicy
    private final int[][] board;
    
    //konstruktor ArrayEx4 tworzy instancje tablicy
    public ArrayEx4(int[][] board) {
        this.board = board;
    }
    
    //metoda
    public static int[][] gameKasparovDeepBlue(){
        //inicjalizacja tablicy
        int[][] boardKasparovDeepBlue = {
            {EMPTY,    EMPTY,    EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
            {B_PAWN,   B_PAWN,   EMPTY,    EMPTY,    EMPTY,   EMPTY,    W_PAWN,   EMPTY},
            {EMPTY,    EMPTY,    EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
            {EMPTY,    EMPTY,    EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
            {EMPTY,    B_KING,   B_PAWN,   EMPTY,    EMPTY,   W_KNIGHT, EMPTY,    EMPTY},
            {EMPTY,    B_KNIGHT, EMPTY,    EMPTY,    W_ROOK,  EMPTY,    W_PAWN,   EMPTY},
            {EMPTY,    EMPTY,    EMPTY,    B_ROOK,   EMPTY,   EMPTY,    EMPTY,    EMPTY},
            {EMPTY,    W_KING,   EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
        };       
        return boardKasparovDeepBlue;             
    }
  
    public static void main(String[] args) {
        
        //wywolanie meotdy gameKasparovDeepBlue i przypisanie jej do instanceBoard
        int[][] instanceBoard = gameKasparovDeepBlue();
        
        System.out.println("Kasparov v Deep Blue final state board:");
        System.out.println(Arrays.deepToString(instanceBoard));
    }
    
}
