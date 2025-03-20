package scd.lab08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import scd.lab08.factory.Employee;
import scd.lab08.factory.EmployeeFactory;

@SpringBootApplication
public class Lab08Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab08Application.class, args);

        // Testing Factory Method
        Employee emp1 = EmployeeFactory.createEmployee("full time");
        Employee emp2 = EmployeeFactory.createEmployee("part time");
        Employee emp3 = EmployeeFactory.createEmployee("intern");

        emp1.showEmployeeType();
        emp2.showEmployeeType();
        emp3.showEmployeeType();
    }
}
