public class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;

    public Employee(int employeeId, String employeeName, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Bonus calculation (default implementation)
    public double calculateBonus() {
        return 0; // Base class has no bonus
    }

    // Display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
    }

    // Method to compute annual earnings
    public double calculateAnnualEarnings() {
        return 0; // Base class has no annual earnings
    }

    public double calculateWeeklySalary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateWeeklySalary'");
    }
}

