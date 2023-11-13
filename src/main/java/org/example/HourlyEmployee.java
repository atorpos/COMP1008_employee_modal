package org.example;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    public HourlyEmployee(boolean employeed, String last_name, String first_name, int ssn, double wage, double hours) {
        super(employeed, last_name, first_name, ssn);

        if(wage < 0.0) {
            System.err.println("Error, wage must be greater than zero");
            wage = 0.0;
        }
        this.wage = wage;

        if(hours < 0.0 || hours > 168.0) {
            System.err.println("Error: Hours must be between 0 to 168");
            hours = 0.0;
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }
    public double getHours() {
        return hours;
    }

    @Override
    public double earning() {
        if (hours <= 40.0) {
            return wage * hours;
        } else {
            double regularPay = wage * 40;
            double overtimePay = (hours - 40) * wage * 1.5;
            return regularPay + overtimePay;
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("Employee Info: %nName: %s %s%nSSN: %s%n", getFirst_name(), getLast_name(), getSsn());
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: wage is %s, hours is %s and %s", getWage(), getHours(), super.toString());
    }
}
