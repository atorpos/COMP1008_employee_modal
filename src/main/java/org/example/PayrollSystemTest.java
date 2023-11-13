package org.example;

public class PayrollSystemTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee(true, "Wong", "Oskar", 110764864, 1000.00);
        employees[1] = new PieceWorker(true, "Lindors", "Eric", 172831011, 40.0, 100);
        employees[2] = new HourlyEmployee(true, "Sakic", "Joe", 198765673, 20, 140);
        employees[3] = new PieceWorker(true, "Roy", "Patrick", 987656713, 50, 69);

        for(Employee employee: employees) {
            employee.displayInfo();
            System.out.println("Earnings: " + employee.earning());
            System.out.println();
        }
    }
}