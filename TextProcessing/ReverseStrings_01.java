package TextProcessing;
import java.util.Scanner;
public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("end")){

            StringBuilder reversedSb = new StringBuilder();
            String word = input; //hello = olleh
            String reversedWord = "";
            for (int i = word.length() -1; i >= 0; i--){
                char currentSymbol = word.charAt(i);
                reversedSb.append( currentSymbol );
              //  reversedWord = reversedWord + currentSymbol;

            }
            System.out.printf("%s = %s%n", word, reversedSb);
            input = scanner.nextLine();

        }

    }
}
