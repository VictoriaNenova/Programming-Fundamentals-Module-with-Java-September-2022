package ExerciseArrays;
import java.util.Scanner;
public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task compare the elements of two arrays : the elements of the secondArray
        // to those of the first. Print common elements

        //1. create two arrays
        String [] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        StringBuilder commonElements = new StringBuilder();

        //2. How to compare them? -> make two nested for-loops
        for (int i = 0; i <secondArray.length ; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i].equals(firstArray[j])){
                    commonElements.append(secondArray[i]).append(" ");
                }
            }
        }
        System.out.println(commonElements);
        //the outer will be the secondArray's length , the inner - the firstArray's length
        //if any elements are equal save them in a string variable


    }
}
