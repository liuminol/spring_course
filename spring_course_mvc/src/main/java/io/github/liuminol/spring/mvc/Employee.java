package io.github.liuminol.spring.mvc;

import io.github.liuminol.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be minimum two symbols")
    private String name;

    @NotEmpty(message = "surname is required field") // поле не должно быть пустым и null
    @NotBlank(message = "surname is required field") //поле на должно быть заполнено только пробелами
    private String surname;

    @Min(value = 500, message = "value must be greater that 499")
    @Max(value = 1000, message = "value must be less that 1001")
    private int salary;
    private String department;
    private String carBrand;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "abc.com", message = "email must be ends with abs.com")
    private String email;
    private String[] languages;
    private Map<String, String> departments;

    public Employee() {
        this.departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", departments=" + departments +
                '}';
    }
}
