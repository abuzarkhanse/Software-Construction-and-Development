package scd.lab08.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scd.lab08.model.Employee;
import scd.lab08.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee cloneEmployee(Long id) {
        Employee original = repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        Employee cloned = original.clone();
        return repository.save(cloned);
    }
}
