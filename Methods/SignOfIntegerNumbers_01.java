package Methods;
import java.util.Scanner;
public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());
        signOfInteger(numInput);
    }
    public static void signOfInteger(int num){
        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        }else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }else{
            System.out.printf("The number %d is zero.", num);
        }
    }
}
