package BasicSyntaxConditionalStatementsLoops;
import java.util.Scanner;

public class MultiplicationTable_2_0_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int product = 0;
        if (n2 > 10){
            product = n1 * n2;
            System.out.printf( "%d X %d = %d%n", n1, n2, product );
        }else {
            for (int times = n2; times <= 10; times++) {

                product = n1 * times;
                System.out.printf( "%d X %d = %d%n", n1, times, product );

            }
        }
        // another way to solve the problem:
        //         do{
        //            int product = n1 * n2;
        //            System.out.printf("%d X %d = %d%n", n1, n2, product);
        //            n2++;
        //        }while (n2 <=10);
    }

}
