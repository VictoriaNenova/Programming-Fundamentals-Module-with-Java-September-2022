package Methods;
import java.util.Scanner;
public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText, secondText));
                break;
        }
    }
    public static int getMax(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
    public static char getMax(char symbol1, char symbol2){
        if (symbol1 > symbol2){
            return symbol1;
        }else{
            return symbol2;
        }
    }
    public static String getMax(String text, String text2){
        if (text.compareTo(text2) > 0){
            return text;
        }else{
            return text2;
        }
    }
}
