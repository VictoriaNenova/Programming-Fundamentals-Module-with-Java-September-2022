package MethodsExercise;
import java.util.Scanner;
public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String password = scanner.nextLine();

        //1. паролата трябва да съдържа символи от 6 до 10
        boolean isPasswordLengthValid = isValidLength( password );
        //true -> валидна дължина
        //false -> невалидна дължина
        if (!isPasswordLengthValid) {
            System.out.println( "Password must be between 6 and 10 characters" );
        }
        //2.паролата трябва да съдържа само цифри и букви
        boolean isPasswordContentValid = isValidContent( password );
        if (!isPasswordContentValid) {
            System.out.println( "Password must consist only of letters and digits" );
        }

        //3.трябва да съдържа поне 2 цифри
        boolean isPasswordCountDigitsValid = isValidCountDigits( password );
        //true -> digits>= 2
        //false-> digits < 2
        if (!isPasswordCountDigitsValid) {
            System.out.println( "Password must have at least 2 digits" );
        }

        if (isPasswordLengthValid && isPasswordContentValid && isPasswordCountDigitsValid) {
            System.out.println( "Password is valid" );
        }

    }

    //method to validate the length
    //true -> if length is valid
    //false -> if length is not valid
    private static boolean isValidLength(String password) {

//        if (password.length() >= 6 && password.length() <= 10) {
//            return true;
//        } else {
//            return false;
//        }
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent(String password){
        for (char symbol : password.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    //method that validates number of digits
    private  static boolean isValidCountDigits(String password) {
        int countDigits = 0; //броим цифрите
        for (char symbol : password.toCharArray()){
            if (Character.isDigit(symbol)){
            countDigits++;

            }
        }
        return countDigits >= 2;
    }

}