package scd.lab08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scd.lab08.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
