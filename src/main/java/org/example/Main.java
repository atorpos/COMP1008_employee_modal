package org.example;

public class Main {
    public static void main(String[] args) {
        BasePlusComissionEmployee employee1 = new BasePlusComissionEmployee(true, "Doe", "John", 123456, 5000.0, 10, 0.03);
        BasePlusComissionEmployee employee2 = new BasePlusComissionEmployee(true, "Smith", "Jane", 789012, -2000.0, 20, 0.3);

        employee1.displayInfo();
        System.out.println("Earnings: " + employee1.earning());

        employee2.displayInfo();
        System.out.println("Earnings: " + employee2.earning());

    }
}