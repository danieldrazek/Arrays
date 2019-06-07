/*
 * 
 */
package array;

import java.util.Arrays;

public class ArrayEx3 {
    
    //deklaracja tablicy board typu Integer
    private Integer[][] board;
    
    //konstruktor ArrayEx3 tworzy instancje tablicy
    public ArrayEx3(Integer[][] board){
        this.board = board;
    }
    
    //tworze metode sampleBoard() typu Integer
    public static Integer[][] sampleBoard(){
        //inicjalizacja tablicy sudokuBoard
        Integer[][] sudokuBoard = {
           {2,    null, 6,    null, 7,    5,    null, null},
           {null, null, null, null, null, null, null, 9,    6},
           {6,    null, 7,    null, null, 1,    3,    null, null},

           {null, 5,    null, 7,    3,    2,    null, null, null},
           {null, 7,    null, null, null, null, null, 2,    null},
           {null, null, null, 1,    8,    9,    null, 7,    null},

           {null, null, 3,    5,    null, null, 6,    null, 4},
           {8,    4,    null, null, null, null, null, null, null},
           {null, null, 5,    2,    null, 6,    null, null, 8}
        };
        return sudokuBoard;
    }
    
    public static void main(String[] args) {
        
        //wywolanie metody sampleBoard i przypisanie jej do instanceBoard typu Integer
        Integer[][] instanceBoard = sampleBoard();
        
        System.err.println("Sudoku layout board:");
        System.out.println(Arrays.deepToString(instanceBoard));
    }
}
