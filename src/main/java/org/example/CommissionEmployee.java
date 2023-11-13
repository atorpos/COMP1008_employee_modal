package org.example;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(boolean employeed, String last_name, String first_name, int ssn, double grossSales, double commissionRate) {
        super(employeed, last_name, first_name, ssn);

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

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double earning() {
        return grossSales*commissionRate;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Employee Info: %nName: %s %s%nSSN: %s%n", getFirst_name(), getLast_name(), getSsn());
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: wage is %s, hours is %s and %s", getCommissionRate(), getGrossSales(), super.toString());
    }
}
