package AssociativeArrays;
import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr =scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        //при LinkedHashMap като добавяме нови елементи те се подреждат в реда на въвеждане,
        //само HashMap не ни дава гаранция как ще бъдат подредени всички елементи
        //при TreeMap елементите се сортират автоматично по азбучен ред
        for (String word:inputArr) {
            word = word.toLowerCase();  //обхождам всеки един елемент(всяка една дума) от масива
            // и  присвоявам нова стойност на съответната дума -> всички символи стават малки букви

        //ще използваме LinkedHashMap <String, Integer> вместо иф проверка, за да проверя дали съответната
            // дума се съдържа в листа, ако ли не я добавям като нов ключ <String>
            //със стойността<Integer> ще броя колко пъти се съдържа конкретната дума в inputArr
           // след това използвайки LinkedHashMap-а , ако ключа вече се съдържа в листа ,
            // ще вземем стойността на ключа и ще прибавим една единица
            // (по този начин запазваме ключ със същото име, но със друга стойност)
            wordsMap.putIfAbsent(word, 0);
            wordsMap.put( word, wordsMap.get(word)+1 );
        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) { //<- ако стойността на <Integer> е нечетно число
                // => добавям го към листа resultList
                resultList.add( entry.getKey() );

            }
        }

        System.out.println(String.join(", ", resultList));


    }
}
