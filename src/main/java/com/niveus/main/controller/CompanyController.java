package com.niveus.main.controller;

import com.niveus.main.entity.Company;
import com.niveus.main.exceptionhandler.ResourceNotFoundException;
import com.niveus.main.model.ResponseBody;
import com.niveus.main.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/ping")
    private static String getStatus() {
        return "Assessment 3 Application Running Successfully.........";
    }

    @GetMapping("/employees")
    public List<Company> getAllEmployees() {
        return companyService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Company> getEmployeeById(@PathVariable(value = "id") int employeeId)
            throws ResourceNotFoundException {
        Company employee = companyService.getEmployeeById(employeeId);
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public ResponseEntity<List<ResponseBody>> createEmployee(@Valid @RequestBody Company employee) {
        List<ResponseBody> responseBody = companyService.createEmployee(employee);
        return ResponseEntity.ok(responseBody);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<List<ResponseBody>> updateEmployee(@PathVariable(value = "id") int employeeId,
            @Valid @RequestBody Company employeeDetails) throws ResourceNotFoundException {
        List<ResponseBody> responseBody = companyService.updateEmployee(employeeId, employeeDetails);
        return ResponseEntity.ok(responseBody);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int employeeId)
            throws ResourceNotFoundException {
        return companyService.deleteEmployee(employeeId);
    }
}
