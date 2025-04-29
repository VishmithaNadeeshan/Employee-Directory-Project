package edu.ICET.controller;

import edu.ICET.dto.Employee;
import edu.ICET.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
    final EmployeeService service;
    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }
    @PutMapping("/update")
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);
    }
    @GetMapping("/searchById/{id}")
    public Employee searchEmployee(@PathVariable Integer id){
       return service.searchEmployee(id);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteEmployee(id);
    }
    @GetMapping("get-All")
    public List<Employee>getAll(){
       return service.getAll();
    }

}
