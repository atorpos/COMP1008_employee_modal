package org.example;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(boolean employed, String last_name, String first_name, int ssn, double weeklySalary) {
        super(employed, last_name, first_name, ssn);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        if (weeklySalary <= 0.0) {
            System.err.println("Error: Weekly salary must be greater than 0.0");
            return 0.0; // Return 0.0 as an error indicator
        }

        return weeklySalary;
    }

    @Override
    public double earning() {
        return getWeeklySalary();
    }

    @Override
    public void displayInfo() {
        System.out.printf("Employee Info: %nName: %s %s%nSSN: %d%n", getFirst_name(), getLast_name(), getSsn());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                "} " + super.toString();
    }
}

