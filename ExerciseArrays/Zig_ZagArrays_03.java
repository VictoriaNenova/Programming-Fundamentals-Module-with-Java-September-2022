package ExerciseArrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Zig_ZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //1. on all rows the numbers are at index 0 and 1
        // on the even rows take the numbers at:
        //            -index 0 , add them to the second array
        //            - index 1 , add them to the first array
        // on the odd rows take the numbers at:
        //            - index 0 , add them to the first array
        //            - index 1 , add them to the second array
        //2. to take the rows do a for-loop and check whether the indices are odd or even
        //3. print the first and on the nextLine the second array
        ArrayList<String> firstArr = new ArrayList<>();
        ArrayList<String> secondArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split( " ");
            if (i % 2 == 0){
                firstArr.add(input[0]);
                secondArr.add(input[1]);
            }else{
                secondArr.add(input[0]);
                firstArr.add(input[1]);

            }

        }
        for (int i = 0; i < firstArr.size() ; i++) {
            System.out.print(firstArr.get(i) + " ");
        }
        System.out.println();
        for (String element: secondArr) {
            System.out.print(element + " ");
        }
    }
}
