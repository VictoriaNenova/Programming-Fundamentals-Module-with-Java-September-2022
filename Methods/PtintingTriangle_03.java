package Methods;
import java.util.Scanner;
public class PtintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        triangle(inputNum);

    }
    public static void triangle(int num){
        for (int i = 1; i <= num; i++){
            printRows(1, i);
        }

        for (int i = num - 1; i >= 1; i--){
            printRows(1, i);
        }
    }

    public  static void printRows(int start, int end){
        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
