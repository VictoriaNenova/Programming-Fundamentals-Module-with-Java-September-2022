package AssociativeArrays;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbersArr = Arrays.stream( scanner.nextLine().split( " " ))
                .mapToDouble( Double::parseDouble).toArray();
        TreeMap<Double, Integer> countMap = new TreeMap<>();
        for (double num: numbersArr) {
// 1-ви вариант , по-подробен и опростен
//            if (!countMap.containsKey(num)){
//                countMap.put(num, 1);
//            }else{
//                countMap.put(num, (countMap.get(num))+ 1);  //(countMap.get(num))+ 1 този израз мога
//                // да си го изведа и в отделна променлива
//            }

//  2-ри вариант по-сбит
//               if (!countMap.containsKey(num)){
//                countMap.put(num, 0);
//            }
//                int value = countMap.get(num);
//                     countMap.put( num, value +1);


    //3-ти най-кратък вариант
            countMap.putIfAbsent(num, 0);
            countMap.put(num, countMap.get(num)+1);

        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()){
            System.out.printf( "%.0f -> %d%n", entry.getKey(), entry.getValue() );
        }
    }
}
