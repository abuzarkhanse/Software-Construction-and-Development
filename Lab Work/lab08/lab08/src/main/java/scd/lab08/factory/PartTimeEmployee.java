package scd.lab08.factory;

public class PartTimeEmployee implements Employee {
    @Override
    public void showEmployeeType() {
        System.out.println("I am a Part-Time Employee.");
    }
}
