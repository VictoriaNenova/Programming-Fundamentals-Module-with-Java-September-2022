package List;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberstList = Arrays.stream( scanner.nextLine().split( " " ) )
                .map( Integer::parseInt )
                .collect(Collectors.toList());

        numberstList.removeIf(e -> e < 0);

        Collections.reverse(numberstList);

        if(numberstList.size() == 0){
            System.out.println("empty");
        }else{
            System.out.println(numberstList.toString().replaceAll( "[\\[\\],]", "" ));
        }
    }
}
