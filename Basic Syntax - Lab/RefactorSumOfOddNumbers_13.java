package BasicSyntaxConditionalStatementsLoops;
import java.util.Scanner;
public class RefactorSumOfOddNumbers_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n * 2; i+= 2) {  //we multiply "n * 2", to get five odd numbers
            //for example n = 5; 5*2 = 10 -> the odd numbers from 1 to 10 are : 1,3,5,7,9 => we get our five odd numbers
            if (n % 2 != 0) {
                System.out.println( i );
                sum = sum + i;
            }
        }

        System.out.printf("Sum: %d%n", sum);
    }
}

//The code needed to be fixed:
//Scanner sc = new Scanner(System.in);
//int n = Integer.parseInt(sc.nextLine());
//int sum = 1;
//for (int i = 0; i <= n; i++) {
//System.out.print(2 * i + 1);
//sum += 2 * i;
//}
//System.out.printf("Sum: %d%n", sum);