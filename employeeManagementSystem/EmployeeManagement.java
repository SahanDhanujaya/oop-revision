package employeeManagementSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 60000));
        employees.add(new Employee("Charlie", 103, 55000));

        // Display all employees
        System.out.println("All Employees:");
        for (Employee e : employees) {
            e.displayEmployee();
        }

        // Find employee with highest salary
        Employee highestSalaryEmp = findHighestSalary(employees);
        System.out.println("\nEmployee with Highest Salary:");
        highestSalaryEmp.displayEmployee();

        // Sort employees by name
        sortEmployeesByName(employees);
        System.out.println("\nEmployees Sorted by Name:");
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }

    // Method to find employee with highest salary
    public static Employee findHighestSalary(ArrayList<Employee> list) {
        if (list.isEmpty()) return null;
        Employee max = list.get(0);
        for (Employee e : list) {
            if (e.getSalary() > max.getSalary()) {
                max = e;
            }
        }
        return max;
    }

    // Method to sort employees by name
    public static void sortEmployeesByName(ArrayList<Employee> list) {
        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareToIgnoreCase(e2.getName());
            }
        });
    }
}
