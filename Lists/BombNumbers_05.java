package ExerciseLists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream( scanner.nextLine().split( "\\s+"))
                .map(Integer :: parseInt).collect( Collectors.toList() );

        String [] input = scanner.nextLine().split( "\\s+" );

        int specialNumber = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

            while (numsList.contains(specialNumber)){
                int indexBomb = numsList.indexOf(specialNumber);
               int left = Math.max(0, indexBomb - power);
                int right = Math.min(numsList.size() - 1, indexBomb + power);

                for (int i = right; i >= left ; i--) {
                    numsList.remove(i);
                }
            }
            int sum = 0;
        for (int number:numsList) {
            sum += number;
        }
        System.out.println(sum);
    }
}
