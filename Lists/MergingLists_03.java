package LabLists;
import java.util.*;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream( scanner.nextLine().split( " " ) )
                .map( Integer::parseInt).collect( Collectors.toList()); //3 5 2 43 12 3 54 10 23
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split( " " ))
                .map( Integer::parseInt ).collect( Collectors.toList());//76 5 34 2 4 12
        List<Integer> resultList = new ArrayList<>();


        int shorterList = Math.min( firstList.size(), secondList.size());

        for (int i = 0; i < shorterList ; i++) {
            int numFirstList = firstList.get( i );
            int numSecList = secondList.get( i );

            resultList.add( numFirstList );
            resultList.add( numSecList );
        }
        if (firstList.size() > secondList.size()){
            resultList.addAll( firstList.subList( shorterList, firstList.size()));
        }else if (secondList.size()> firstList.size()){
            resultList.addAll( secondList.subList(shorterList, secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll( "[\\[\\],]", "" ));
        System.out.println(resultList);
    }
}
