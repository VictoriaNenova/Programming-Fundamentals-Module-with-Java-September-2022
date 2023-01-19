package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;
public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.  System.out.println(new StringBuilder(scanner.nextLine()).reverse().toString());
        String input = scanner.nextLine();
        char[] word = input.toCharArray();
        for (int i = word.length -1; i >= 0 ; i--) {
            System.out.print(word[i]);
        }

    }
}
