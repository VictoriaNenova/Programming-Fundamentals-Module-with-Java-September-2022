package ExerciseBasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfPush = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < numbersOfPush ; i++) {
            String digits = scanner.nextLine();
            int digitLength = digits.length();  // we need the length of the digits to find the index of the letter, as shown in the table
            char oneDigit = digits.charAt(0); // we get the digit as char at index 0
            int mainDigit = Character.getNumericValue(oneDigit); //we set the main digit to be the numeric value of the char 'oneDigit'
            int offset = (mainDigit - 2)*3; // we need the offset to find the letter index(see in table from notepad)
            if (mainDigit == 8 || mainDigit == 9){
                offset = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = offset + digitLength -1;
            int letterCode = letterIndex + 97; //we add 97 to the letterIndex to get the letter from the ASCII table

            char letter = (char) letterCode; //we save the char value of the letter
            if (mainDigit == 0){
                letter = (char) (mainDigit + 32);// 'space'
            }
            message += letter;
        }
        System.out.println(message);
    }
}
