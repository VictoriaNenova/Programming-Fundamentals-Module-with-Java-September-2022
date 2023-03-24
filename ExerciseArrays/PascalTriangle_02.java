package MoreExerciseArrays;
import java.util.Scanner;
public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int number = 1;
            int n = Integer.parseInt(scanner.nextLine());
            int spaces = n;
        for (int i = 0; i < n; i++) {
            //1st nested for loop is for spaces, these spaces are the start of every row
            //example:  " "|" "|" "| 1 |" "|" "|" "
                 //     " "|" "| 1 |   | 1 |" "|" "  etc.
            for (int s = 1; s <=spaces; s++) {
                System.out.print(" ");
            }
            number=1; // we re-initialize the number variable because every row on the pascal table starts with 1,
            // otherwise the number will be incremented and it will not be initialized as 1
            for (int j = 0; j <= i ; j++) {
                System.out.print(number + " ");
                number = number*(i - j)/(1 + j); //this formula calculates the next number
            }
            spaces--; // the spaces should be decremented after each iteration of the number of lines "n"
            System.out.println(); //at the end we need to print the next line
        }
    }
}
