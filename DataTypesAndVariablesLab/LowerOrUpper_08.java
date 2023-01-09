package DataTypesAndVariablesLab;
import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);

        if (symbol >= 65 && symbol <= 90){          //these numbers we get from the ASCII table
            System.out.println("upper-case");
        }else if (symbol >= 97 && symbol <= 122){
            System.out.println("lower-case");
        }
    }
}
//         Another solution:
//        if (Character.isUpperCase(symbol)){
//            System.out.println("upper-case");
//        }else{
//            System.out.println("lower-case");
//        }
