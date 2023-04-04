package ExerciseAssociativeArrays;
import java.util.*;
public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while(!command.equals("stop")){
    	int quantity = Integer.parseInt(scanner.nextLine());

         if(!resources.containsKey(command)){
         	resources.put(command, quantity);
         }else{
         	int currentQuantity = resources.get(command);
            resources.put(command, currentQuantity + quantity);
        }
        command = scanner.nextLine();
   }
        resources.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
