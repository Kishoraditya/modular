package com.example.myproject.service;

import com.example.myproject.model.Employee;
import com.example.myproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
    
    // Other business logic methods as needed
}
