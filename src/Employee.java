public class Employee {
    String department;
    int salary;

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }
}
