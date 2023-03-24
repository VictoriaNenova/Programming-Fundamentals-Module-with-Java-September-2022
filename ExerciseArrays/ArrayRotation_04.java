package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1.read the array from console
        //2. read the number of rotations
        //3. do the number of rotations -> the first element goes last
        //example:   51 47 30 , you have to make 1 rotation => result you get is 47 30 51
        //4. print the array after the rotations

        int [] numbersArr = Arrays.stream( scanner.nextLine().split( " " ) )
                .mapToInt( Integer::parseInt ).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {  //iterating numbers of rotations
            int firstNumber = numbersArr[0];  //51
            for (int index = 0; index <numbersArr.length-1 ; index++) {
                numbersArr[index] = numbersArr[index+1];
            }
          numbersArr[numbersArr.length-1]= firstNumber;
        }
        for (int number:numbersArr) {
            System.out.print(number + " ");

        }
    }
}
