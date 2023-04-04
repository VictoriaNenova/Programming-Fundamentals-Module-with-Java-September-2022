package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String text = scanner.nextLine().replaceAll( "\\s+", "" );
        //"text text text".replaceAll -> "texttexttext" заменяме всеки един интервал с нищо

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();  //<- брой на срещанията

        for (char symbol : text.toCharArray()) {
            //1.да не съм срещала такъв символ
            if (!symbolCount.containsKey( symbol )) {
                symbolCount.put( symbol, 1 );
            }
            //2. да съм срещала такъв символ
            else {
                int currentCount = symbolCount.get( symbol ); //текущия брой срещания
                symbolCount.put( symbol, currentCount + 1 );
            }
        }

        symbolCount.entrySet().forEach( entry -> System.out.println( entry.getKey() + " -> " + entry.getValue() ) );


    }
}