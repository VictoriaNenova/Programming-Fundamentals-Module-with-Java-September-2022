package BasicSyntaxConditionalStatementsLoops;
import java.util.Scanner;
public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int product = 0;
        for (int times = 1; times <= 10; times++) {
            product = n * times;
            System.out.printf("%d X %d = %d%n", n, times, product);
        }
    }
}
