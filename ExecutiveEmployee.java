public class ExecutiveEmployee extends SalariedEmployee {
    private double bonusPercentage;

    public ExecutiveEmployee(int employeeId, String employeeName, String designation, double monthlySalary, double bonusPercentage) {
        super(employeeId, employeeName, designation, monthlySalary);
        setBonusPercentage(bonusPercentage);
    }

    // Getters and Setters
    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        if (bonusPercentage < 0) throw new IllegalArgumentException("Bonus percentage must be non-negative.");
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateBonus() {
        return (getMonthlySalary() * 12) * (bonusPercentage / 100);
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.printf("Bonus: %.2f\n", calculateBonus());
    }

    @Override
    public double calculateAnnualEarnings() {
        return super.calculateAnnualEarnings() + calculateBonus(); // Annual salary + bonus
    }
}
