package PayrollSystem;

import java.util.*;

public class EmployeePayrollSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll();

        // Adding Employees via User Input
        for (int i = 0; i < 5; i++) {
            int id;
            int salary;
            
            do {
                System.out.println("Enter Employee ID:");
                id = scanner.nextInt();
                if (id < 0) {
                    System.out.println("Error: Employee ID cannot be negative. Try again.");
                } else if (!payroll.isUniqueId(id)) {
                    System.out.println("Error: Employee ID must be unique. Try again.");
                }
            } while (id < 0 || !payroll.isUniqueId(id));
            
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Employee Name:");
            String name = scanner.nextLine();
            
            do {
                System.out.println("Enter Employee Salary (positive integer only):");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Salary must be a positive integer. Try again.");
                    scanner.next();
                }
                salary = scanner.nextInt();
                if (salary <= 0) {
                    System.out.println("Error: Salary must be a positive integer. Try again.");
                }
            } while (salary <= 0);
            
            System.out.println("Enter Employee Role (MANAGER, DEVELOPER, DESIGNER, TESTER, HR):");
            jobRole role = jobRole.valueOf(scanner.next().toUpperCase());
            
            Employee employee = new Employee(id, name, salary, role);
            payroll.addEmployee(employee);
        }

        // Display All Employees
        payroll.displayAllEmployees();

        // Search Employees by Role
        System.out.println("\nEnter a role to search employees:");
        jobRole searchRole = jobRole.valueOf(scanner.next().toUpperCase());
        payroll.searchByRole(searchRole);
    }

}
