package DataTypesAndVariablesLab;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TownInfo_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.printf( "Town %s has population of %d and area " + df.format(area) + " square km.", town, population);
    }
}
