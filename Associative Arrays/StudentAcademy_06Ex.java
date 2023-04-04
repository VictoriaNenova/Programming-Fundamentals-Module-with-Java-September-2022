package AssociativeArrays;
import java.util.*;

public class StudentAcademy_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>>  studentGrade = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= n ; student++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
                //1. да не е записан
            if (!studentGrade.containsKey(name)){
                studentGrade.put(name, new ArrayList<>());
            }
            //2. да е записан
            studentGrade.get(name).add(grade);
        }

            //име на студента -> списък с оценки(studentGrade)
            //записи: име на студента(key) -> средна оценка (value)  от (averageGrades)
        Map<String, Double> averageGradesStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry: studentGrade.entrySet()){

            String studentName = entry.getKey();

            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade >= 4.50){
                averageGradesStudents.put(studentName, averageGrade);
            }
        }
        //отпечатваме : averageGradesStudents
        //entry : name(key) -> av.grade (value)
        averageGradesStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade:listGrades) {
            sumGrades +=grade;
        }
        return sumGrades/listGrades.size();
    }
}
