package ExerciseLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  countCommands= Integer.parseInt(scanner.nextLine());
        List<String> guestNames = new ArrayList<>();
        for (int i = 1; i <= countCommands; i++){
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            if (input.contains("is going!")){
                //1. прибавям човека ако не е в списъка
                if (guestNames.contains( name )){
                    System.out.println(name + " is already in the list!");
                }else{
                    guestNames.add(name);
                }
                //ако е в списъка отпечатвам {name} is already in the list!
            }else if (input.contains("is not going!")){
                //ако човека е в списъка го махам
                if (guestNames.contains(name)){
                    guestNames.remove(name);
                }else{
                    System.out.println(name + " is not in the list!");
                }
                //ако не е в списъка отпечатвам "{name} is not in the list"
            }
        }
        for (String name:guestNames) {
            System.out.println(name);
        }
    }
}
