package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream( scanner.nextLine().split( " " ))
                .mapToInt( Integer::parseInt ).toArray();
        //1. iterate the array
        for (int index = 0; index < numbersArr.length; index++) {
            int currentNumber = numbersArr[index]; //save the number at the current index

            //3. our last element is always top number
            if (index == numbersArr.length - 1){
                System.out.print(currentNumber + " ");
                break;  //stop the process if it is the last number
            }

            boolean isTop = false;
            for (int i = index + 1; i < numbersArr.length ; i++) {
                int nextNumber = numbersArr[i];
                if (currentNumber > nextNumber){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }

        }
    }
}
