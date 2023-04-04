package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List<Integer> numberstList = Arrays.stream( scanner.nextLine().split( " " ) )
                .map( Integer::parseInt )
                .collect( Collectors.toList() );
        String lineInput = scanner.nextLine();
        while (!lineInput.equals( "end" )) {
            String[] commandArr = lineInput.split( " " );
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt( commandArr[1] );
                    numberstList.add( numToAdd );
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt( commandArr[1] );
                    numberstList.remove( Integer.valueOf( numToRemove ) );//чрез valueOf премахваме числото което има стойност 2 , а не това което е на индекс 2
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt( commandArr[1] );
                    numberstList.remove( indexRemove );
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt( commandArr[1] );
                    int indexToInsert = Integer.parseInt( commandArr[2] );
                    numberstList.add( indexToInsert, numberToInsert );
                    break;
            }
            lineInput = scanner.nextLine();
        }
        System.out.println( numberstList.toString().replaceAll( "[\\[\\],]", "" ) );
    }
}
