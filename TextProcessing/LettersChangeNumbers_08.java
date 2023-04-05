package TextProcessing;
import java.util.Scanner;
public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split( "\\s+" );

        double totalSum = 0; //сума от модифицираните числа на всеки код

        for (String code : codes){

            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);


    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace( firstLetter, ' ' ).replace( secondLetter, ' ' ).trim());

        //1. проверка за firstLetter -> главна или малка буква
        if (Character.isUpperCase(firstLetter)){
            //от аски таблицата главните букви са от 65 до 90
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        }else{
            //lower letter -> [97; 122]
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }
        if (Character.isUpperCase(secondLetter)){
            //от аски таблицата главните букви са от 65 до 90
            int positionUpperLetter = (int) secondLetter - 64;
            number -= positionUpperLetter;
        }else{
            //lower letter -> [97; 122]
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
