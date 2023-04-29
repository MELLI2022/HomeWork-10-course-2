package skypro.homework10course2.Service;

import org.springframework.stereotype.Service;
import skypro.homework10course2.Domane.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class EmployeeService {
    public static final Employee[] employees = new Employee[10];


    EmployeeService() {
        employees[0] = new Employee("Михаил", "Викторович", 1, 6000);
        employees[1] = new Employee("Антонина", "Викторовна", 2, 3000);
        employees[2] = new Employee("Дмитрий", "Викторович", 2, 2000);
        employees[3] = new Employee("Людмила", "Викторовна", 3, 1000);
        employees[4] = new Employee("Анатолий", "Викторович", 4, 4000);
        employees[5] = new Employee("Лилия", "Викторовна", 5, 1500);
        employees[6] = new Employee("Анна", "Викторовна", 3, 2500);
        employees[7] = new Employee("Татьяна", "Викторовна", 4, 3500);
        employees[8] = new Employee("Елена", "Викторовна", 1, 4500);
        employees[9] = new Employee("Николай", "Викторович", 2, 5500);

    }

    public Employee getMaxWage(int department) {
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == department )
                .max(Comparator.comparingInt(Employee::getWage))
                .orElseThrow();
    }


    public static Employee getMinWage(Integer department) {
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == department )
                .min(Comparator.comparingInt(Employee::getWage))
                .orElseThrow();
    }
    public List<Employee> getAllInDepart(){
        return Arrays.stream(employees)
                .sorted(Comparator.comparingInt(Employee::getDepartment))
                .collect(Collectors.toList());

    }

    public List<Employee> getAllByDepart(int id){
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == id )
                .collect(Collectors.toList());
    }
}


