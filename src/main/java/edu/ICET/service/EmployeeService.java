package edu.ICET.service;

import edu.ICET.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee searchEmployee(Integer id);
    void updateEmployee(Employee employee);
    void deleteEmployee(Integer id);
    List<Employee>getAll();

}
