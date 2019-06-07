/*
 * 
 */
package array;

    
public class ArrayEx2 {

    public int biggestNumber(int[] numbers){
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));     
    }
    
    public static void main(String[] args) {
        
            ArrayEx2 excercise2 = new ArrayEx2();
            int[] numbers = new int[]{1, 2, 3};
                   
            System.out.println("The bigger number is: " + excercise2.biggestNumber(numbers));          
    }
}

    
