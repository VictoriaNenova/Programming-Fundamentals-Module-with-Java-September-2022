package Methods;
import java.util.Scanner;
public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        products(input, quantity);
    }

    public static void products(String text, int quantity){

        switch(text){
            case "coffee":
                System.out.printf("%.2f",quantity * 1.5);
              break;
            case "water":
                System.out.printf("%.2f", quantity * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f", quantity * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f", quantity * 2.00);
                break;
        }
    }
}
