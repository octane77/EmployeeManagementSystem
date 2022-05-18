package africa.semicolon.employeemanagementsystem.service;

import africa.semicolon.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    boolean deleteEmployee(Long id);

    Employee createEmployee(Employee employee);

    List<Employee> fetchAllEmployees();

    Employee fetchEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
