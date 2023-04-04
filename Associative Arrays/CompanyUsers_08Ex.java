package AssociativeArrays;
import java.util.*;
public class CompanyUsers_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //company(String) -> employees(List)
        LinkedHashMap<String, List<String>> companyUsers = new LinkedHashMap<>();

        while(!input.equals("End")){
            String[] commandArr = input.split( " -> " );
            String company = commandArr[0];
            String employeeId = commandArr[1];

            if (companyUsers.containsKey(company)){
                List<String> employees = companyUsers.get(company);
                if (!employees.contains(employeeId)){
                    employees.add(employeeId);
                }
            }else {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                companyUsers.put( company, employees);
            }

            input = scanner.nextLine();

        }
        companyUsers.entrySet().stream().forEach( company ->{
            System.out.println(company.getKey());
            company.getValue().forEach(employee -> System.out.println("-- " + employee));
        } );

    }
}
