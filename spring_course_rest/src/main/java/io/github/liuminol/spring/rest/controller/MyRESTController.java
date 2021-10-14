package io.github.liuminol.spring.rest.controller;

import io.github.liuminol.spring.rest.entity.Employee;
import io.github.liuminol.spring.rest.exception_handling.EmployeeIncorrectData;
import io.github.liuminol.spring.rest.exception_handling.NoSuchEmployeeException;
import io.github.liuminol.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if (employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database");
        }

        return employee;
    }


}

