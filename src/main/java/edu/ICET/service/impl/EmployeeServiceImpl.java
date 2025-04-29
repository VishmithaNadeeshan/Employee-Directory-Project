package edu.ICET.service.impl;

import edu.ICET.dto.Employee;
import edu.ICET.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public Employee searchEmployee(Integer id) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Integer id) {

    }

    @Override
    public List<Employee> getAll() {
        return List.of();
    }
}
