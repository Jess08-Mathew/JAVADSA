public class PayrollTest {
    public static void main(String[] args) {
        // Creating instances of each employee type
        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "Alice Johnson", "Laboratory Technician", 25.0, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Bob Smith", "Professor", 6000.0);
        ExecutiveEmployee executiveEmployee = new ExecutiveEmployee(3, "Charlie Brown", "Dean", 8000.0, 15.0);

        // Displaying detailed information for each employee
        System.out.println("Employee Details:");

        // Display details for HourlyEmployee
        System.out.println("Hourly Employee:");
        hourlyEmployee.displayEmployeeInfo();
        System.out.printf("Annual Earnings: %.2f\n", hourlyEmployee.calculateAnnualEarnings());
        System.out.println();

        // Display details for SalariedEmployee
        System.out.println("Salaried Employee:");
        salariedEmployee.displayEmployeeInfo();
        System.out.printf("Annual Earnings: %.2f\n", salariedEmployee.calculateAnnualEarnings());
        System.out.println();

        // Display details for ExecutiveEmployee
        System.out.println("Executive Employee:");
        executiveEmployee.displayEmployeeInfo();
        System.out.printf("Annual Earnings: %.2f\n", executiveEmployee.calculateAnnualEarnings());
        System.out.println();

        // Total payroll calculation
        double totalPayroll = hourlyEmployee.calculateWeeklySalary() + 
                              salariedEmployee.calculateWeeklySalary() + 
                              executiveEmployee.calculateWeeklySalary();
        System.out.printf("Total Payroll (Weekly): %.2f\n", totalPayroll);
    }
}
