package MethodsExercise;
import java.util.Scanner;
public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelCount(text.toLowerCase());
    }
    //метод, който принтира броят на гласните букви
    public static void printVowelCount(String text){

        //!!!приемаме че text е изцяло с малки букви
        //text = "Desislava" ->4 glasni
        int count = 0;   // броим гласните букви

        //първи вариант с foreach
        for (char symbol : text.toCharArray()){
            //проверка дали е гласна буква -> a, e, i, o, u
            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'u' || symbol == 'o'){
                count++;
            }
        }
        //втори вариант с for
//        for (int index = 0; index < text.length() ; index++) {
//            char symbol = text.charAt(index);
//            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
//                    || symbol == 'u' || symbol == 'o'){
//                count++;
//            }
//
//        }
        System.out.println(count);
    }

}
