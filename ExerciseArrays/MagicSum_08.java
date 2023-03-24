package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine().split( " " )).mapToInt( Integer::parseInt ).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());
        // - take the current num, add it to the others, one by one
        //example:  you have the array [1 7 6 2 19 23]  and the magic num 8
        // take the first number 1 and add it to the next one. If their sum is == the magic num => print both numbers
        //if their sum doesn't equal the magic number => continue with the same number to add it to the others

        for (int i = 0; i < numbersArr.length ; i++) {
            for (int j = i+1; j < numbersArr.length ; j++) {
                int sum = numbersArr[i] + numbersArr[j];
                if (sum == magicNum) {
                    System.out.println( numbersArr[i] + " " + numbersArr[j] );
                }
            }
        }
    }
}
