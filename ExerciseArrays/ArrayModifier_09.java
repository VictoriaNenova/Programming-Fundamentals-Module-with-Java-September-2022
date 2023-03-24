package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Constraints
        //· Elements of the array will be integer numbers in the range [-231...231].
        //· The count of the array elements will be in the range [2...100].
        //· Indexes will always be in the range of the array.
        int [] numbersArr = Arrays.stream(scanner.nextLine().split( " " )).mapToInt( Integer::parseInt ).toArray();

        String command =  scanner.nextLine();
        while (!command.equals("end")){
            if(command.contains("swap")){
                //"swap {index1} {index2}"
                //with this command you take two elements and swap their places    "swap 0 1"
                // this is the array numbersArr [23 -2 321 87 42 90 -123] => with this command you swap two numbers
                int index1 = Integer.parseInt( command.split( " " )[1] );  //0
                int index2 = Integer.parseInt( command.split( " " )[2] );   //1
                int element1 = numbersArr[index1];  //23
                int element2 = numbersArr[index2];  //-2
                numbersArr[index1] = element2;   //-2
                numbersArr[index2] = element1;   //23
            }else if (command.contains("multiply")){
                //"multiply {index1} {index2}"
               // takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
                int index1 = Integer.parseInt( command.split( " " )[1] );
                int index2 = Integer.parseInt( command.split( " " )[2] );
                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];
                numbersArr[index1] = element1 * element2;
            }else if (command.equals("decrease")){
                //"decrease" decreases all elements in the array with 1
                for (int i = 0; i < numbersArr.length ; i++) {
                    numbersArr[i] = numbersArr[i] - 1;
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numbersArr.length ; i++) {
            if (i == numbersArr.length -1){
                System.out.print(numbersArr[i]);
            }else {
                System.out.print( numbersArr[i] + ", " );
            }
        }
    }
}
