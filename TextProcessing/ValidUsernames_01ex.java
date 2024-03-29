package TextProcessing;
import java.util.Scanner;
public class ValidUsernames_01ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] usernames = input.split( ", " );

        for (String username: usernames) {
            if (validUserName(username)){
                System.out.println(username);
            }
        }

    }
    private static boolean validUserName(String username){
    if (username.length()  < 3 || username.length() > 16){
            return false;
        }
    for (char symbol : username.toCharArray()){
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
            return false;
            }
        }
    return true;

    }
}
