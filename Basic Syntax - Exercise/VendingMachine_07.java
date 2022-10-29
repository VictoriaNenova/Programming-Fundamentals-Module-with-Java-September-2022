package ExerciseBasicSyntaxCondStatementsAndLoops;
import java.util.Scanner;
public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитам вх.данни
          //-пари (дробно число);
          //- текст (start,
        // product("Nuts", "Water", "Crisps","Soda","Coke")
        // & end)
        //правя проверка дали парите пуснати в машината отговарят на изискванията:
        // 0.1, 0.2, 0.5, 1, and 2 coin; ако не отг. отпечатвам "Cannot accept {money}", форматирано до 2-рия знак;

        String command = scanner.nextLine();
        double moneyCount = 0;
        while (!command.equals("Start")) {
        double insertedMoney = Double.parseDouble(command);
            if (insertedMoney == 0.1
                    || insertedMoney == 0.2
                    || insertedMoney == 0.5
                    || insertedMoney == 1
                    || insertedMoney == 2) {
                moneyCount = moneyCount + insertedMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", insertedMoney);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        while (!command.equals("End")){
        switch (command) {
            case "Nuts":
                if (moneyCount >= 2){
                moneyCount -= 2.0;
                System.out.printf("Purchased %s%n", command);
                 } else {
                System.out.println("Sorry, not enough money");
                }
                break;
            case "Water":
                if (moneyCount >= 0.7){
                    moneyCount -= 0.7;
                    System.out.printf("Purchased %s%n", command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
                break;
            case "Crisps":
                if (moneyCount >= 1.5){
                    moneyCount -= 1.5;
                    System.out.printf("Purchased %s%n", command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
                break;
            case "Soda":
                if (moneyCount >= 0.8){
                    moneyCount -= 0.8;
                    System.out.printf("Purchased %s%n", command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
                break;
            case "Coke":
                if (moneyCount >= 1){
                    moneyCount -= 1;
                    System.out.printf("Purchased %s%n", command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
                break;
            default:
                System.out.println("Invalid product");
                break;

        }
            command = scanner.nextLine();
        }
        if (moneyCount >= 0) {
            System.out.printf("Change: %.2f", moneyCount);
        }
        //създавам switch-case конструкция , която да отчете цената на всеки продукт:
        // "Nuts" 2.0,
        // "Water" 0.7,
        // "Crisps" 1.5,
        // "Soda" 0.8,
        // "Coke" 1.0
        //2.Създавам променлива в която ще събера всички пуснати пари в машината;
        //- правя проверка дали има достатъчно пари
        // да си закупя въведения продукт: -ако няма достатъчно отпечатвам"Sorry, not enough money";
        //                                 -ако са достатъчно отпеч. "Purchased {product name}".;
        //                                 -след командата "End",отпечатвам "Change: {money left}", форматирано до 2-рата цифра сл.запетаята;


    }
}
