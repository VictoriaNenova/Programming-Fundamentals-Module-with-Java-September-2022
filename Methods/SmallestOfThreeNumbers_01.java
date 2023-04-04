package MethodsExercise;
import java.util.Scanner;
public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getMin(num1, num2, num3));
        //printSmallestNum(num1,num2,num3);

    }
    public static int getMin (int num1, int num2, int num3){ //този метод връща резултат
        int minNum = 0;
        if (num1 > num2 && num3 > num2){
            minNum = num2;
        }else if(num2 > num1 && num3 > num1){
            minNum = num1;
        }else{
            minNum = num3;
        }
        return minNum;
    }
    //друго решение :

    // public static void printSmallestNum(int n1, int n2, int n3){   //този метод само отпечатва и модифицира , но не връща стойности
    // if (num1 > num2 && num3 > num2){
    //              System.out.println(num2);
    //        }else if(num2 > num1 && num3 > num1){
    //             System.out.println(num1);
    //        }else{
    //             System.out.println(num3);
    //        }
    // }
}
