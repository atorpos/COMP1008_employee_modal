package org.example;

public abstract class InsEmployeeInfo {
    public final String firstname;
    public final String lastname;
    public final String SSN;


    protected InsEmployeeInfo(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.SSN = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSSN() {
        return SSN;
    }

    @Override
    public String toString() {
        return "InsEmployeeInfo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
