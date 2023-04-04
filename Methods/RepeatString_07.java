package Methods;
import java.util.Scanner;
public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input,n));
    }

    public static String repeatString(String str, int count){
        String result = "";
        for (int i =0 ; i< count; i++){
            result = result + str;
        }
        return result;

   }
}
