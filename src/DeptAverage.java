import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class DeptAverage {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("HR", 50000));
        employees.add(new Employee("Engineering", 80000));
        employees.add(new Employee("HR", 60000));
        employees.add(new Employee("Engineering", 100000));


       /* Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy().
                                LinkedHashMap::new,
                        employee::getDepartment,
                        collect(mapToDouble(Collectors.getAverage(employee.getSalary()))));*/

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(result);
    }

}
