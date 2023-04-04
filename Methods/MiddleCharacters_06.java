package MethodsExercise;
import java.util.Scanner;
public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }

    private static void printMiddleCharacters(String text) {
        //нечетна дължина -> 1среден символ
        if (text.length() % 2 == 1){
            int indexOfMidNum = text.length() / 2;
            System.out.println(text.charAt(indexOfMidNum));
        }else {
            //четна дължина -> 2 средни символа
            int indexFirstMidNum = text.length() / 2 - 1;
            int indexSecondMidNum = text.length() /2;

            System.out.println("" + text.charAt(indexFirstMidNum) + text.charAt(indexSecondMidNum));
        }
    }
}
