package MethodsExercise;
import java.util.Scanner;
public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(1);
        
        printCharactersInRange(symbol1, symbol2);
    }

    public static void printCharactersInRange(char symbol1, char symbol2) {
        //правимм проверка кой е по-малкия символ
        if (symbol1 < symbol2){  //тук сравняваме аски кодовете на символите
            //започваме от symbol1
            for (char symbol = (char)(symbol1 + 1);symbol < symbol2; symbol++){
                System.out.println(symbol + " ");
            }


        }else {
            //започваме от symbol2
            for (char symbol =(char) (symbol2 + 1); symbol < symbol1; symbol++){
                System.out.println(symbol + " ");
            }
        }
    }
}
