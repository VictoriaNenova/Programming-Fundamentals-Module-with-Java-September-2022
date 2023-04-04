package AssociativeArrays;
import java.util.*;
public class Courses_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        //курс -> студенти
        LinkedHashMap<String, List<String>> registeredUsers = new LinkedHashMap<>();

        while(!command.equals("end")){
            String[] array = command.split(" : ");
            String course = array[0];
            String studentName = array[1];
            if (command.contains(course)){
                List<String> students = registeredUsers.get(course);
                if (!command.contains(studentName)){
                    students.add(studentName);
                }
            }else{
                List<String> students = new ArrayList<>();
                students.add(studentName);
                registeredUsers.put(course, students);
            }
            command = scanner.nextLine();
        }
        registeredUsers.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey()+ " : " + entry.getValue().size());
            entry.getValue().forEach( studentName -> System.out.println("-- " + studentName));
        } );

    }
}
