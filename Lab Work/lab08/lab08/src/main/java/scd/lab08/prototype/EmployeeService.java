package scd.lab08.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return repository.save(employee);
    }

    public EmployeeEntity cloneEmployee(Long id) {
        Optional<EmployeeEntity> existing = repository.findById(id);
        if (existing.isPresent()) {
            EmployeeEntity clonedEmployee = existing.get().clone();
            return repository.save(clonedEmployee);
        }
        throw new RuntimeException("Employee not found");
    }
}
