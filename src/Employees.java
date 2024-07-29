import java.util.Arrays;
import java.util.List;

public class Employees {
    
    public static void printEmployees(List<Employee> employees){
        int nameWidth = "name".length();
        int YOJWidth = "year".length();
        int salaryWidth = "salary".length();
        int addressWidth = "address".length();
        for (Employee employee : employees){
            if (employee.getName().length() > nameWidth){
                nameWidth = employee.getName().length();
            }
            if (String.valueOf(employee.getYOJ()).length() > YOJWidth){
                YOJWidth = String.valueOf(employee.getYOJ()).length();
            }
            if (String.valueOf(employee.getSalary()).length() > salaryWidth){
                salaryWidth = String.valueOf(employee.getSalary()).length();
            }
            if (employee.getAddress().length() > addressWidth){
                addressWidth = employee.getAddress().length();
            }
        }
        System.out.printf("%-" + nameWidth + "s %-" + YOJWidth + "s %-" + salaryWidth + "s %-" + addressWidth +"s%n", "Name", "Year", "salary", "Adress");
        System.out.println("");
        for (Employee employee : employees){
            System.out.printf("%-" + nameWidth + "s %-" + YOJWidth + "d %-" + salaryWidth + "d %-" + addressWidth +"s%n", employee.getName(), employee.getYOJ(), employee.getSalary(), employee.getAddress());
        }

    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Robert", 1994, 10000, "234 Dizengoff st. Tel-Aviv"),
            new Employee("Sam", 2000, 8500, "38 Gissin st. Petach-Tiqwa"),
            new Employee("John", 1999, 67000, "1670 5th Av. NYC")
        );
        
        printEmployees(employees);
    }
}
