public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(int employeeId, String employeeName, String designation, double monthlySalary) {
        super(employeeId, employeeName, designation);
        setMonthlySalary(monthlySalary);
    }

    // Getters and Setters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) throw new IllegalArgumentException("Monthly salary must be non-negative.");
        this.monthlySalary = monthlySalary;
    }

    public double calculateWeeklySalary() {
        return monthlySalary / 4; // Assuming 4 weeks in a month
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.printf("Weekly Salary: %.2f\n", calculateWeeklySalary());
        System.out.printf("Annual Earnings: %.2f\n", calculateAnnualEarnings());
    }

    @Override
    public double calculateAnnualEarnings() {
        return monthlySalary * 12; // Fixed monthly salary
    }
}
