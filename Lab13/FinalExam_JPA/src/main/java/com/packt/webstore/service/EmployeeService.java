package com.packt.webstore.service;

import com.packt.webstore.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public Employee findEmployeeByEmployeeNumber(int employeeId);

    public List<Employee> getAllEmployees();
}
