package List;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map( Integer::parseInt )
                .collect( Collectors.toList() );

        String inputLine = scanner.nextLine();
        while(!inputLine.equals("end")){
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Contains":
                    int number = Integer.parseInt( commandArr[1] );
                    if (numbersList.contains( number )) {
                        System.out.println( "Yes" );
                    } else {
                        System.out.println( "No such number" );
                    }


                    break;
                case "Print":
                        if (commandArr[1].equals( "even" )) {
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNumber = numbersList.get( i );
                                if (currentNumber % 2 == 0) {
                                    System.out.print( currentNumber + " " );

                                }
                            }
                        }else if (commandArr[1].equals( "odd" )){
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNumber = numbersList.get( i );
                                if (currentNumber % 2 != 0) {
                                    System.out.print( currentNumber + " " );

                                }
                            }
                        }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer aNumbersList : numbersList) {
                        sum += aNumbersList;
                    }

                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandArr[1];
                    int commandNumber = Integer.parseInt(commandArr[2]);
                    if (condition.equals( ">" )){
                        for (Integer num : numbersList) {
                            if (num > commandNumber){
                                System.out.print(num + " ");
                            }
                        }
                    }else if (condition.equals( "<" )){
                        for (Integer num : numbersList) {
                            if (num < commandNumber){
                                System.out.print(num + " ");
                            }
                        }
                    }else if (condition.equals( ">=" )){
                        for (Integer num : numbersList) {
                            if (num >= commandNumber){
                                System.out.print(num + " ");
                            }
                        }
                    }else if (condition.equals( "<=" )){
                        for (Integer num : numbersList) {
                            if (num <= commandNumber){
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }

            inputLine = scanner.nextLine();
        }
    }
}
