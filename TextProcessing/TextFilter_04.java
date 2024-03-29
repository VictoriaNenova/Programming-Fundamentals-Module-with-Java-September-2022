package TextProcessing;
import java.util.Scanner;
public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWordsArr = scanner.nextLine().split( ", " );
        String text = scanner.nextLine();

        for (String banWord : bannedWordsArr){
            text = text.replace(banWord, repeatString( "*", banWord.length() ));
        }
        System.out.println(text);
    }
    public static String repeatString(String s, int count){
        String result = "";
        for (int i = 0; i < count; i++){
            result += s;
        }
        return result;
    }
}
//public static String repeatString(String s, int count){
//      StringBuilder sb = new StringBuilder();
//      for(int i = 0; i < count; i++){
//      sb.append(s);
// }
//      return sb.toString();
// }
