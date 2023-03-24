package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. read an array
        //2. if it is only one element the sum is considered to be 0
        //if there is no such index print "no"

        int [] numbersArr = Arrays.stream( scanner.nextLine().split( " " ))
                .mapToInt( Integer::parseInt ).toArray();
        //1. iterate the array
        boolean isFound = false;

        for (int index = 0; index < numbersArr.length; index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int index1 = 0; index1 < index ; index1++) {
                leftSum += numbersArr[index1];
            }
            for (int index2 = index+1; index2 < numbersArr.length ; index2++) {
                rightSum += numbersArr[index2];
            }
            if (leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
       if (!isFound){
            System.out.println("no");
       }

    }
}

