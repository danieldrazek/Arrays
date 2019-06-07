/*
 * Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
 */
package array;


public class ArrayEx1 {
    
    public int sumNumbers(int[] numbers){
        return numbers[0] + numbers[1];
    }
    
    public static void main(String[] args) {
        
        ArrayEx1 excercise1 = new ArrayEx1();
        int[] numbers = new int[2];
        numbers[0] = 3;
        numbers[1] = -8;
        
        System.out.println("The sum of " + numbers[0] + " and " + numbers[1] + " equals " + excercise1.sumNumbers(numbers));
    }
    
}
