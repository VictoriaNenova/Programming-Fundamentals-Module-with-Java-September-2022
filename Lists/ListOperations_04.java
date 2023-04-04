package ExerciseLists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List<Integer> numbers = Arrays.stream( scanner.nextLine().split( " " ))
                .map(Integer::parseInt)
                .collect( Collectors.toList());
        String input = scanner.nextLine();
        while(!input.equals("End")){
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            int number = Integer.parseInt(commandArr[1]);

            switch (command){
                case"Add":
                    numbers.add(number);
                    break;
                case"Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    numbers.set(number, index);
                    break;
                case"Remove":
                    int index1 = Integer.parseInt(commandArr[1]);
                    numbers.remove(index1);
                    break;
                case"Shift":
                    if (commandArr[1].equals( "left" )){

                    }else if (commandArr[1].equals("right")){

                    }
                    break;
            }
        }

    }
}
