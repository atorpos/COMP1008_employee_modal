package org.example;

public abstract class Employee_Info {

    public String first_name;

    public String last_name;
    public int ssn;

    public Employee_Info(String first_name, String last_name, int ssn) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ssn = ssn;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public abstract void displayInfo();

    public abstract  double earning();

    @Override
    public String toString() {
        return "Employee_Info{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", ssn=" + ssn +
                '}';
    }
}
