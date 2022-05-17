package africa.semicolon.employeemanagementsystem.service;

import africa.semicolon.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> fetchAllEmployees();
}
