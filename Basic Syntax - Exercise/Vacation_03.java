package ExerciseBasicSyntaxCondStatementsAndLoops;
import java.util.Scanner;
public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
        double discount = 0 ;
        double priceWithDiscount = 0;
        switch (day){
            case "Friday":
                if (group.equals("Students")){
                    price = 8.45;
                    if (people >= 30){
                        totalPrice = (price * people);
                        discount = 0.15 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }else if (group.equals("Business")){
                    price = 10.90;
                    if (people >= 100){
                        totalPrice = (price * people);
                        discount = 0.10 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }else if (group.equals("Regular")) {
                    price = 15;
                    if (people >= 10 && people <= 20){
                        totalPrice = (price * people);
                        discount = 0.05 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }
                break;
            case "Saturday":
                if (group.equals("Students")){
                    price = 9.80;
                    if (people >= 30){
                        totalPrice = (price * people);
                        discount = 0.15 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }else if (group.equals("Business")){
                    price = 15.60;
                    if (people >= 100){
                        totalPrice = (price * people);
                        discount = 0.10 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }else if (group.equals("Regular")) {
                    price = 20;
                    if (people >= 10 && people <= 20){
                        totalPrice = (price * people);
                        discount = 0.05 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }
                break;
            case "Sunday":
                if (group.equals("Students")){
                    price = 10.46;
                    if (people >= 30){
                        totalPrice = (price * people);
                        discount = 0.15 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else{
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }

                }else if (group.equals("Business")){
                    price = 16;
                    if (people >= 100){
                        totalPrice = (price * people);
                        discount = 0.10 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }else if (group.equals("Regular")) {
                    price = 22.50;
                    if (people >= 10 && people <= 20){
                        totalPrice = (price * people);
                        discount = 0.05 * totalPrice;
                        priceWithDiscount = totalPrice - discount;
                        System.out.printf("Total price: %.2f", priceWithDiscount);
                    }else {
                        totalPrice = (price * people);
                        System.out.printf("Total price: %.2f", totalPrice);
                    }
                }
                break;

        }


    }
}
