package ExerciseAssociativeArrays;
import java.util.*;
public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> user = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split( "\\s+" );
            String command = input[0];
            switch (command) {
                case "register":
                String username = input[1];
                String licensePlateNumber = input[2];
                if (!user.containsKey(username)) {
                    user.put( username, licensePlateNumber );
                    System.out.println(username + " registered " + licensePlateNumber + " successfully");
                }else{
                    System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                }
                break;
                case "unregister":
                    username = input[1];
                    if (!user.containsKey( username )){
                        System.out.println("ERROR: user " + username + " not found");
                    }else{
                        System.out.println(username + " unregistered successfully");
                        user.remove(username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry: user.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
