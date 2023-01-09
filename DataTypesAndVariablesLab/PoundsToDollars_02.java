package DataTypesAndVariablesLab;
import java.util.Scanner;
public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gbPound = Double.parseDouble(scanner.nextLine());
        //1 British Pound = 1.36 Dollars
        double dollars = gbPound * 1.36;
        System.out.printf( "%.3f", dollars );
    }
}
