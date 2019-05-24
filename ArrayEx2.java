
package array;

    
public class ArrayEx2 {
    
    public int biggestNumber(int[] numbers){   
        
        int biggest = numbers[0];
        if(numbers[1] > biggest){
            biggest = numbers[1];
        }
        else if(numbers[2] > biggest){
            biggest = numbers[2];
        }  
        return biggest;    
    }
    
    public int biggestNumber2(int[] numbers){
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
        
    }
    
    public static void main(String[] args) {
        
            ArrayEx2 excercise2 = new ArrayEx2();
            int[] numbers = new int[]{12, 67, -7};
            
            System.out.println("The bigger number is: " + excercise2.biggestNumber(numbers));
            System.out.println("The bigger number is: " + excercise2.biggestNumber2(numbers));
           
    }
}

    
