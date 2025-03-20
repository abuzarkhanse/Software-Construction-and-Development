package scd.lab08.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping
    public EmployeeEntity create(@RequestBody EmployeeEntity employee) {
        return service.createEmployee(employee);
    }

    @PostMapping("/{id}/clone")
    public EmployeeEntity clone(@PathVariable Long id) {
        return service.cloneEmployee(id);
    }
}
