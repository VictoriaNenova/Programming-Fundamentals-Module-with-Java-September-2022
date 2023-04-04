package AssociativeArrays;
import java.sql.SQLOutput;
import java.util.*;
public class SoftUniExamResults_10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> userPoints = new LinkedHashMap<>();// username -> pointsMap
        Map<String, Integer> languageCount = new LinkedHashMap<>();//language -> count


        while(!command.equals("exam finished")){
            String[] splitArray = command.split("-");
            String username = splitArray[0];
           if (splitArray.length == 3) {
               String language = splitArray[1];
               int points = Integer.parseInt(splitArray[2]);
            //добавяме username и точки
               if (!userPoints.containsKey(username)){
                   userPoints.put(username, points);
               }else{
                   int currentPoints = userPoints.get(username);
                   if (points > currentPoints){
                       userPoints.put( username, points);
                   }
               }
           //добавяме брой срещания на езика
               if (!languageCount.containsKey(language)){
                    languageCount.put(language, 1);
                }else{
                   languageCount.put( language, languageCount.get(language) + 1 );
               }

           }else{
               userPoints.remove(username);
           }

           command = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().stream()
        .forEach( e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().stream()
        .forEach( e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
