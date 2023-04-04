package MethodsExercise;
import java.text.DecimalFormat;
import java.util.Scanner;
public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //1.входни данни
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long fact1 =  calculateFact (num1);
        long fact2 = calculateFact(num2);

        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);
        //2. трябва да намеря факториела на първото число

        //3. намирам факториелана второто число
        //4. разделям фацториела на първото с факториела на второто число
    }


    public static long calculateFact(int number) {
        long fact = 1;
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;

        }
        return fact;
    }

}
