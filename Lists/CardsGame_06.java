package ExerciseLists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        List<Integer> firstPlayerHand = Arrays.stream( scanner.nextLine().split( " " ) )
                .map( Integer::parseInt )
                .collect(Collectors.toList());
        List<Integer> secondPlayerHand = Arrays.stream( scanner.nextLine().split( " " ) )
                .map( Integer::parseInt )
                .collect(Collectors.toList());


        while(firstPlayerHand.size() != 0 && secondPlayerHand.size() !=0){
                int secondPlayerCard = secondPlayerHand.get(0);
                int firstPlayerCard = firstPlayerHand.get(0);
                secondPlayerHand.remove(0);
                firstPlayerHand.remove(0);
                if (firstPlayerCard > secondPlayerCard){
                    firstPlayerHand.add(firstPlayerCard);
                    firstPlayerHand.add(secondPlayerCard);

                }else if (firstPlayerCard < secondPlayerCard) {
                    secondPlayerHand.add( secondPlayerCard );
                    secondPlayerHand.add( firstPlayerCard );
                }
        }


                if (firstPlayerHand.size() == 0) {
                    System.out.printf( "Second player wins! Sum: %d", getCardSum(secondPlayerHand) );

                } else if (secondPlayerHand.size() == 0){
                    System.out.printf("First player wins! Sum: %d",getCardSum(firstPlayerHand));
                }
    }

            private  static int getCardSum(List<Integer> listCards){  // с метода вместо два пъти да си търся сумата
        // , я намерих веднъж; освен това метода може да бъде извикан и за повече случаи
                int sum = 0;
                for (int card:listCards) {
                    sum = sum +card;
                }
                return sum;
            }
        }


