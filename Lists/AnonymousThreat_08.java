package ExerciseLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
// You will receive commands in one of the following formats:
//· merge {startIndex} {endIndex} -> merge 4 10
//
//· divide {index} {partitions} -> divide 4 5
        String input = scanner.nextLine();

        while (!input.equals("3:1")){
            String [] commandArr = input.split( "\\s+" );
            String command = commandArr[0];
            if (command.equals( "merge" )){
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                if (startIndex < 0){
                    startIndex = 0 ;
                }
                if (endIndex > strings.size() -1){
                    endIndex = strings.size() -1;
                }
                int counter = startIndex;
                    for (int i = startIndex; i < endIndex; i++){
                        String mergedStrings = strings.get(counter) + strings.get(counter + 1);
                        strings.set( counter, mergedStrings);
                        strings.remove(counter + 1);
                    }

            }else if (command.equals( "divide" )){
                int index = Integer.parseInt(commandArr[1]);
                int partitions = Integer.parseInt(commandArr[2]);

//The index in the divide command will ALWAYS be INSIDE the array.
//The partitions will be in the range [0, 100].
                if (index >= 0 && index < strings.size() && partitions >= 0 && partitions <= 100){
                    String element = strings.get(index);
                    List<String> subList = new ArrayList<>();

                    if (element.length() % partitions == 0){
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            for (int j = 0; j < portionLength ; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                            subList.add(concat);
                        }
                    }else {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";

                            if (i == partitions - 1){
                                for (int j = count; j < element.length(); j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }else {
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }
                            subList.add(concat);
                        }
                    }
                    strings.remove(index);
                    strings.addAll(index, subList);
                }
            }

            input = scanner.nextLine();
        }
        for (String element: strings){
            System.out.print(element + " ");
        }
    }
}
