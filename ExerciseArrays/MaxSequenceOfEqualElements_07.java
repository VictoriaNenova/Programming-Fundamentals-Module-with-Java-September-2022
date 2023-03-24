package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  - for-loop to iterate the array with the element on the current index
        //  - one variable to mark the start of the longest sequence of elements
        //  - there should be a startIndex variable
        //  - one variable to keep the maxSequence of elements
        //  - one to keep the currentMaxSequence
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startIndex = 0;
        int bestStart = 0;  //with this variable you mark the start of the longest sequence of elements
        int currentMaxSequence = 1;  //the current sequence always has at least one element
        int maxSequence = 0;
        for (int i = 1; i < numberArr.length ; i++) {
            if (numberArr[i] == numberArr[i - 1]){   //compare current number and the previous one
                currentMaxSequence++;
            }else{
                currentMaxSequence = 1;
                startIndex = i;
            }
            if (currentMaxSequence > maxSequence){
                bestStart = startIndex;
                maxSequence = currentMaxSequence;
            }
        }
        for (int j = bestStart; j < bestStart + maxSequence ; j++) {
            System.out.print(numberArr[j] + " ");

        }

    }
}
