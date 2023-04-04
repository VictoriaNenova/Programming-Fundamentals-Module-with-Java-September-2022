package ExerciseLists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine().split( " " ))
                .map(Integer::parseInt)
                .collect( Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while(!command.equals("end")){
            if (command.contains("Add")){
                train.add(Integer.parseInt(command.split(" " )[1]));
            }else{
               int passengersToAdd = (int) Integer.parseInt(command);
                for (int index = 0; index < train.size() ; index++) {
                    int currentWagon = train.get(index);
                    if (currentWagon+ passengersToAdd <= maxCapacity){
                        train.set(index, currentWagon + passengersToAdd);
                        break;
                    }
                }

            }

            command = scanner.nextLine();
        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
    }
}


