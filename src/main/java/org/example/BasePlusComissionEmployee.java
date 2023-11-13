package org.example;

public class BasePlusComissionEmployee extends Employee{
    private double baseSalary;
    private double grossSales;
    private double commissionRate;

    public BasePlusComissionEmployee(boolean employeed, String last_name, String first_name, int ssn, double baseSalary, double grossSales, double commissionRate) {
        super(employeed, last_name, first_name, ssn);
        if (baseSalary <= 0.0) {
            System.err.println("Error: Base salary must be greater than 0.0");
            baseSalary = 0.0;
        }
        this.baseSalary = baseSalary;
        if(commissionRate <= 0.0 || commissionRate > 1.0){
            System.err.println("Error on input the commission rate");
            commissionRate = 0.0;
        }
        this.commissionRate = commissionRate;

        if(grossSales < 0.0) {
            System.err.println("Error on input the Gross sales");
            grossSales = 0.0;
        }
        this.grossSales = grossSales;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double earning() {
        return grossSales*commissionRate + baseSalary;
    }
    @Override
    public void displayInfo() {
        System.out.printf("Employee Info: %nName: %s %s%nSSN: %s%n", getFirst_name(), getLast_name(), getSsn());
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: commission is %s, sales is %s, total salary is %s and %s", getCommissionRate(), getGrossSales(), earning(), super.toString());
    }
}
