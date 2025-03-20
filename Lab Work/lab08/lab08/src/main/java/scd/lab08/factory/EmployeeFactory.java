package scd.lab08.factory;

public class EmployeeFactory {
    public static Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "full time":
                return new FullTimeEmployee();
            case "part time":
                return new PartTimeEmployee();
            case "intern":
                return new Intern();
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}
