package africa.semicolon.employeemanagementsystem.controller;

import africa.semicolon.employeemanagementsystem.model.Employee;
import africa.semicolon.employeemanagementsystem.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("ems/api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createemployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/fetchemployees")
    public List<Employee> fetchAllEmployees() {
        return employeeService.fetchAllEmployees();
    }
}
