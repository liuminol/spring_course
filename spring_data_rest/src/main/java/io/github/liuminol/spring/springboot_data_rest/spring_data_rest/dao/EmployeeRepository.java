package io.github.liuminol.spring.springboot_data_rest.spring_data_rest.dao;


import io.github.liuminol.spring.springboot_data_rest.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
