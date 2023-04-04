package MoreExercisesMethods;
import java.text.DecimalFormat;
import java.util.Scanner;
public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int x1 = Integer.parseInt( scanner.nextLine());
        int y1 = Integer.parseInt( scanner.nextLine());
        int x2 = Integer.parseInt( scanner.nextLine());
        int y2 = Integer.parseInt( scanner.nextLine());
        int x3 = Integer.parseInt( scanner.nextLine());
        int y3 = Integer.parseInt( scanner.nextLine());
        int x4 = Integer.parseInt( scanner.nextLine());
        int y4 = Integer.parseInt( scanner.nextLine());

        System.out.println(longerLineToCenter(x1, y1, x2, y2, x3, y3, x4, y4));
    }

    private static String longerLineToCenter(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        String closest = "";

        int firstPoint = Math.abs(x1) + Math.abs(y1);
        int secondPoint = Math.abs(x2) + Math.abs(y2);
        int thirdPoint = Math.abs(x3) + Math.abs(y3);
        int fourthPoint = Math.abs(x4) + Math.abs(y4);

        if (firstPoint + secondPoint > thirdPoint + fourthPoint){
            if (firstPoint < secondPoint) {
                closest += "(" + x1 + ", " + y1 + ")" + "(" + x2 + ", " + y2 + ")" ;
            }else{
                closest += "(" + x2 + ", " + y2 + ")" + "(" + x1 + ", " + y1 + ")";
            }

        }else if (firstPoint + secondPoint < thirdPoint + fourthPoint) {
            if (thirdPoint < fourthPoint) {
                closest += "(" + x3 + ", " + y3 + ")" + "(" + x4 + ", " + y4 + ")";
            }else{
                closest += "(" + x4 + ", " + y4 + ")" + "(" + x3 + ", " + y3 + ")";
            }
        }else{
            closest += "(" + x1 + ", " + y1 + ")" + "(" + x2 + ", " + y2 + ")" ;
        }
        return closest;
    }
}
