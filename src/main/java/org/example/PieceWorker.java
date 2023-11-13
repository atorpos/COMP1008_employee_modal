package org.example;

public class PieceWorker  extends Employee{
    private double wage;
    private int pieces;

    public PieceWorker(boolean employeed, String last_name, String first_name, int ssn, double wage, int pieces) {
        super(employeed, last_name, first_name, ssn);

        if(wage < 0.0) {
            System.err.println("Error on input the wage value");
            wage = 0.0;
        }
        this.wage = wage;

        if(pieces < 0) {
            System.err.println("Error on input pieces produeced");
            pieces = 0;
        }
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double earning() {
        return wage * pieces;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Employee Info: %nName: %s %s%nSSN: %d%n", getFirst_name(), getLast_name(), getSsn());
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: wage is %s, who produce %s items, total earning is %s and %s", getWage(), getPieces(), earning(), super.toString());
    }
}
