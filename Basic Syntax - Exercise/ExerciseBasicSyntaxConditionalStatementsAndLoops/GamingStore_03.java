package ExerciseBasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;
public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        double initialBalance = Double.parseDouble( scanner.nextLine() );
        String input = scanner.nextLine();
        double currentBalance = initialBalance;
        double sumGamePrices = 0;

        while (!input.equals( "Game Time" )) {

            double price = 0;

            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    sumGamePrices += price;

                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= price;
                    }else {
                        System.out.println( "Too Expensive" );
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    sumGamePrices += price;

                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= price;
                    }else {
                        System.out.println( "Too Expensive" );
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    sumGamePrices += price;

                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= price;
                    }else {
                        System.out.println( "Too Expensive" );
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    sumGamePrices += price;

                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= price;
                    }else {
                        System.out.println( "Too Expensive" );
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    sumGamePrices += price;

                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= price;
                    }else {
                        System.out.println( "Too Expensive" );
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    sumGamePrices += price;

                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= price;
                    }else {
                        System.out.println( "Too Expensive" );
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;



            }
            input = scanner.nextLine();
        }

        if (currentBalance == 0) {
            System.out.println( "Out of money!" );
        }else {
            System.out.printf( "Total spent: $%.2f. Remaining: $%.2f", sumGamePrices, currentBalance );
        }
        }
}
