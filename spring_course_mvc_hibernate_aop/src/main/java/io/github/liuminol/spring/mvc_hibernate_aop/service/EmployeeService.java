package io.github.liuminol.spring.mvc_hibernate_aop.service;

import io.github.liuminol.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
