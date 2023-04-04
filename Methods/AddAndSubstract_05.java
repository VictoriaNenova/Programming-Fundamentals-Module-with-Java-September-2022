package MethodsExercise;
import java.util.Scanner;
public class AddAndSubstract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sum(num1, num2);
        int differenceOfNumbers = difference(sumOfNumbers, num3);
        System.out.println(differenceOfNumbers);
    }
    //трябва да направим метод, който приема 2 цели числа и получаваме сбора им
public static int sum(int n1, int n2){
        return n1 + n2;
}

    //след това метод, който приема 2 цели числа и получаваме разлика
    public  static int difference (int n1, int n2){
        return n1 - n2;
    }
}
