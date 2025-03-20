package scd.lab08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scd.lab08.model.Employee;
import scd.lab08.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/clone/{id}")
    public Employee cloneEmployee(@PathVariable Long id) {
        return service.cloneEmployee(id);
    }
}
