package DataTypesAndVariablesLab;
import java.util.Scanner;
public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //A number is special when its sum of digits is 5, 7, or 11
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            int sum = 0;
            int currentNum = i;
            while (currentNum > 0){
                sum  += currentNum % 10;
                currentNum = currentNum /10;

            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", i);
            }else{
                System.out.printf("%d -> False%n", i);
            }
        }


    }
}
