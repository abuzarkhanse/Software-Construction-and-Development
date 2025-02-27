package com.scd.lab6.repository;

import com.scd.lab6.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Custom query methods can be added here
}
