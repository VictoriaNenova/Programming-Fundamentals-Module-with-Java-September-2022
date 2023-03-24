package ExerciseArrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.read the n lines(number of wagons)
        int n = Integer.parseInt(scanner.nextLine());

        //2. make an ArrayList to keep the next wagons, and later to print them out
        ArrayList<Integer> train = new ArrayList<>();
        //3. create a variable sum, to calculate the total people on the train
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int wagon = Integer.parseInt(scanner.nextLine());
            train.add(wagon);
            sum += wagon;
        }
        for (int i = 0; i < train.size(); i++) {
            System.out.print(train.get(i) + " ");
        }
        System.out.println();
        System.out.println(sum);


        //4. add the new wagons to the train(ArrayList)

    }
}
