package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0,0,0};
        for (int i = 0; i <= 2; i++){
            int n = Integer.parseInt(scanner.nextLine());
            array[i] = n * -1;
        }

        Arrays.sort(array);
        for (int x = 0; x <=2; x++){
            System.out.println(array[x]* -1);
        }

    }
}

//another solution to this problem is with ArrayList
//      ArrayList <Integer> numbersArrList = new ArrayList <>();
//      numbersArrList.add(Integer.parseInt(scanner.nextLine);
//      numbersArrList.add(Integer.parseInt(scanner.nextLine);
//      numbersArrList.add(Integer.parseInt(scanner.nextLine);
//
//      Collections.sort(numbersArrList);
//      Collections.reverse(numbersArrList);
//
//      for(int counter : numbersArrList){
//      System.out.println(counter);
//      }

