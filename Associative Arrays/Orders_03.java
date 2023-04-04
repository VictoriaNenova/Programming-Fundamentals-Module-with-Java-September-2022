package ExerciseAssociativeArrays;
import java.util.*;
public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> orderPrice = new LinkedHashMap<>();
        Map<String, Integer> orderQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals( "buy" )){
            String prodName = input.split( "\\s+" )[0];
            double price = Double.parseDouble(input.split( "\\s+" )[1]);
            int quantity = Integer.parseInt(input.split( "\\s+" )[2]);

            if (!orderPrice.containsKey(prodName)){
                orderPrice.put( prodName, quantity*price);
                orderQuantity.put( prodName, quantity);
            }else{

                orderQuantity.put(prodName, orderQuantity.get(prodName) + quantity);
                orderPrice.put( prodName, orderQuantity.get(prodName) * price );

                
            }
            input = scanner.nextLine();
        }
        orderPrice.forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key, value)));
    }

}
