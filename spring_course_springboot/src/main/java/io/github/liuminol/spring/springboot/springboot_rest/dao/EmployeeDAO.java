package io.github.liuminol.spring.springboot.springboot_rest.dao;


import io.github.liuminol.spring.springboot.springboot_rest.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
