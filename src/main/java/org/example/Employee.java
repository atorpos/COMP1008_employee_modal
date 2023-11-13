package org.example;


public class Employee extends Employee_Info {

    private boolean employeed;

    public Employee( boolean employeed, String last_name, String first_name, int ssn) {
        super(first_name, last_name, ssn);
        this.employeed = employeed;
    }

    public void setEmployeed(boolean employeed) {
        this.employeed = employeed;
    }


    public boolean getEmployeed() {
        return employeed;
    }

    public double getEarning() {
        return 0.0;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Employee Info: %nName: %s %s%nSSN:%s%n",getFirst_name(), getLast_name(), getSsn());

    }

    @Override
    public double earning() {
        return 0;
    }
}
