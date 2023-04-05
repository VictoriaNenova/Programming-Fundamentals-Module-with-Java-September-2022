package TextProcessing;
import java.util.Scanner;
public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        //int index = text.indexOf(toRemove);
        while(text.contains(toRemove)){ //другият вариант е да дам условие
            // докато ( index != -1 ), тъй като когато думата не се съдържа в текста, от конзолата ми връща като резултат (-1)
            text = text.replace( toRemove, "" ); //заместваме думата със празен стринг

        }
        System.out.println(text);
    }
}

//        while(text.contains(index != -1)){
//            text = text.replace( toRemove, "" ); //заместваме думата със празен стринг
//            index = text.indexOf(toRemove); с този ред ъпдейтвам като намеря новия индекс
//        }
//        System.out.println(text);
//    }