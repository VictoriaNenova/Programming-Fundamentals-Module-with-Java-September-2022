package LabLists;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> inputList = Arrays.stream( scanner.nextLine().split( " " ))
                .map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 1; i < inputList.size(); i++) {
            if (inputList.get(i - 1).equals(inputList.get(i))){
                double sum = inputList.get( i - 1 ) + inputList.get( i );
                inputList.remove( i - 1 );
                 inputList.set( (i - 1), sum);

                 i = 0;
            }
        }
        for (double n:inputList) {
            System.out.print(new DecimalFormat( "0.# " ).format(n));

        }
    }
}
