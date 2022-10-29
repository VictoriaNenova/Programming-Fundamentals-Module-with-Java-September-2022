    package ExerciseBasicSyntaxCondStatementsAndLoops;
    import java.util.Scanner;
    public class PadawanEquipment_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                double amountOfMoney = Double.parseDouble(scanner.nextLine());
                int numberOfStudents = Integer.parseInt(scanner.nextLine()); //number of students is equal to number of items
                double lightsaberPrice = Double.parseDouble(scanner.nextLine());
                double robePrice = Double.parseDouble(scanner.nextLine());
                double beltPrice = Double.parseDouble(scanner.nextLine());
                double lightSabers = Math.ceil(numberOfStudents + (numberOfStudents * 0.1));
                int sixthBeltFree = numberOfStudents / 6;
                double totalCost = (lightsaberPrice * lightSabers) + (robePrice * numberOfStudents) + (beltPrice * (numberOfStudents - sixthBeltFree));

                if (amountOfMoney >= totalCost){
                    System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
                }else{
                    System.out.printf("George Lucas will need %.2flv more.", totalCost - amountOfMoney);
                }
        }
    }

