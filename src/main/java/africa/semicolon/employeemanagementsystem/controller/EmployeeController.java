package africa.semicolon.employeemanagementsystem.controller;

import africa.semicolon.employeemanagementsystem.model.Employee;
import africa.semicolon.employeemanagementsystem.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
@CrossOrigin(origins = {"http://localhost:3000"})
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
    @DeleteMapping("/deleteemployee/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        boolean deleted = false;
        deleted = employeeService.deleteEmployee(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Employee Entry Deleted Successfully", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/fetchemployeebyid/{id}")
    public ResponseEntity<Employee> fetchEmployeeById(@PathVariable Long id) {
        Employee employee = null;
        employee = employeeService.fetchEmployeeById(id);
        return null;
    }
}
