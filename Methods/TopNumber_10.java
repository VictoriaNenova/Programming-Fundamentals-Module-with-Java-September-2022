package MethodsExercise;
import java.util.Scanner;

public class TopNumber_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.nextLine() );

        //1. входни данни
        //-целта ни е да намерим всички топ числа и да ги отпечатаме -> void method
        //2. създаваме фор с диапазон от 1 до н -> fori

        for (int number = 1; number <= n; number++) {
            //3. какво е характерно за топ числото:
            // - трябва сумата от цифрите му да се дели на  числото 8
            //- трябва да съдържа поне една нечетна цифра, например 232, 707, 87578
            if (isSumOfDigitsDivisibleBy8(number) && isContainingOddDigit(number)){
                System.out.println(number);
            }
        }
    }

    //метод, който проверява дали сумата от цифрите се дели на 8
    //true -> ако сумата се дели на 8
    //false -> ако сумата не се дели на 8
    public static boolean isSumOfDigitsDivisibleBy8(int number){
        //1.намираме сумата от цифрите

        int sumDigits = 0;
        while (number >0){
            //взимам последната цифра
            int lastDigit = number % 10;
            //сумирам последната цифра
            sumDigits += lastDigit;
            //премахвам оследната цифра
            number = number /10;
        }
        //2. проверка на сумата за деление на 8
        return sumDigits % 8 == 0; // връщаме стойността със булев израз,
        // булев израз е този който съдържа оператор за сравнение и връща true/ false;
        // използваме булев израз вместо if/else проверка
    }

    //метод, който проверява дали имаме поне една нечетна цифра в числото
    //  true ->иам поне една нечетна цифра
    // false ->ако нямам нито една нечетна цифра
    public static boolean isContainingOddDigit(int number){
        //трябва да обходя всяка цифра в числото и да направя проверка дали е нечетна

        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            }else{
                number = number / 10;
            }
        }
        //това false получаваме като стойност когато от всички цифри не сме намерили поне една нечетна
        return false;
    }
}
