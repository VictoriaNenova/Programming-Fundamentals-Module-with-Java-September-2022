package LabLists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //sum all numbers in a list in the following order
        // … first + n, last - n / first + last, first + 1 + last - 1, first + 2 + last - 2

        List<Integer> numbers = Arrays.stream( scanner.nextLine().split( " " )).map(Integer::parseInt).collect(Collectors.toList());
        int sizeList = numbers.size();

        for (int i = 0; i < sizeList / 2; i++) {
          int firstNum = numbers.get( i );
          int secondNum = numbers.get(numbers.size()-1);
          numbers.set( i, firstNum +secondNum );
          numbers.remove( numbers.size()-1 );
        }
        for (int n:numbers) {
            System.out.print(n + " ");
        }
    }
}
