package MoreExerciseArrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> codes = new ArrayList<>();


        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            int sumVow  = 0;
            int sumCon = 0;
            for (int j = 0; j < input.length(); j++) {

                int vowel =0;
                int consonant = 0;
                if ((input.charAt(j) == 'A' || input.charAt(j)== 'E'|| input.charAt(j) == 'I' || input.charAt(j) == 'U'
                        || input.charAt(j) == 'O')
                        || (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i'
                        || input.charAt(j) == 'u' || input.charAt(j) == 'o' )){
                    vowel = input.charAt(j) * input.length();
                   sumVow += vowel;

                }else{
                  consonant = input.charAt(j) / input.length();
                  sumCon += consonant;

                }

            }
            int totalSum = sumVow + sumCon;
            codes.add(totalSum);


        }
        Collections.sort(codes);
        //Collections.reverse(codes);
        for (int element:codes) {
            System.out.println(element);

        }

    }
}
