/*
 * Metoda zwraca niepoprawna wartosc tablicy
 */
package array;

public class ArrayErr {
    
    public int biggestNumberErr(int[] numbers){        
        
        int biggest = numbers[0];
        if(numbers[1] > biggest){
            biggest = numbers[1];
        }
        else if(numbers[2] > biggest){
            biggest = numbers[2];
        }  
        return biggest;    
    }
     
    public static void main(String[] args) {
        
            ArrayErr excercise2 = new ArrayErr();
            int[] numbers = new int[]{1, 2, 3};
            
            System.out.println("The bigger number is: " + excercise2.biggestNumberErr(numbers));            
    }
}
    