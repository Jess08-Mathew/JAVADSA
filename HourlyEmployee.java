public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(int employeeId, String employeeName, String designation, double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, designation);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    // Getters and Setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("Hourly rate must be non-negative.");
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0 || hoursWorked > 168) throw new IllegalArgumentException("Hours worked must be between 0 and 168.");
        this.hoursWorked = hoursWorked;
    }

    public double calculateWeeklySalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.printf("Weekly Salary: %.2f\n", calculateWeeklySalary());
        System.out.printf("Annual Earnings: %.2f\n", calculateAnnualEarnings());
    }

    @Override
    public double calculateAnnualEarnings() {
        return calculateWeeklySalary() * 52; // Assuming 52 weeks in a year
    }
}

