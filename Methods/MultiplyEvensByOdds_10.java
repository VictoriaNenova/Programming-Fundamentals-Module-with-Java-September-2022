package Methods;
import java.util.Arrays;
import java.util.Scanner;
public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiply(number));

    }
    public static int multiply(int number){
        int evenSum = evenSum(number);
        int oddSum = oddSum(number);

        return evenSum*oddSum;

    }
    public static int evenSum(int number){
        String intToString = Integer.toString(number);
        int [] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]% 2 == 0){
                sum +=arr[i];
            }

        }
        return sum;
    }
    public static int oddSum(int number){
        String intToString = Integer.toString(number);
        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                sum += arr[i];
            }

        }
        return sum;
    }
}
