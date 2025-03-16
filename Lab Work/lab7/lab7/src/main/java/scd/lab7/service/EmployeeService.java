package scd.lab7.service;

import scd.lab7.entities.Employee;
import scd.lab7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        return employeeRepository.findEmployeesWithSalaryGreaterThan(salary);
    }

    public void updateEmployeeSalary(int id, double salary) {
        employeeRepository.updateEmployeeSalary(id, salary);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployeeById(id);
    }

    public List<Employee> searchEmployeesByName(String name) {
        return employeeRepository.searchEmployeesByName(name);
    }
}
