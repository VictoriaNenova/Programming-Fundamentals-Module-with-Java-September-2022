package MoreExercisesMethods;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        switch (dataType){
            case "int":
                int n = Integer.parseInt(scanner.nextLine());
                System.out.println(multiply( n ));
                break;
            case "real":
                double f = Double.parseDouble(scanner.nextLine());
                System.out.println(new DecimalFormat("##.##").format(multiply( f )));
                break;
            case "string":
                String s = scanner.nextLine();
                System.out.println(surround( s ));
                break;
        }

    }
    static int multiply(int n){
        return n * 2;
    }
    static double multiply ( double f){
        return f * 1.5;
    }
    static String surround(String symbol){
        return "$" + symbol + "$";
    }
}
