import java.util.ArrayList;

public class PayrollSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new HourlyEmployee(1, "Alice Johnson", "Laboratory Technician", 20.0, 40));
        employees.add(new SalariedEmployee(2, "Bob Smith", "Professor", 5000.0));
        employees.add(new ExecutiveEmployee(3, "Charlie Brown", "Dean", 7000.0, 10.0));

        // Displaying employee information
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
            System.out.println();
        }

        // Calculating total payroll
        double totalPayroll = 0;
        for (Employee employee : employees) {
            totalPayroll += employee.calculateWeeklySalary(); // Collect weekly salary for payroll
        }
        System.out.printf("Total Payroll (Weekly): %.2f\n", totalPayroll);
        
        // Calculate annual payroll
        double totalAnnualPayroll = 0;
        for (Employee employee : employees) {
            totalAnnualPayroll += employee.calculateAnnualEarnings(); // Collect annual earnings for payroll
        }
        System.out.printf("Total Payroll (Annual): %.2f\n", totalAnnualPayroll);
    }
}

