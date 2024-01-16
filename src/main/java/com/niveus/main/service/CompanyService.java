package com.niveus.main.service;

import com.niveus.main.entity.Company;
import com.niveus.main.exceptionhandler.ResourceNotFoundException;
import com.niveus.main.model.ResponseBody;
import com.niveus.main.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllEmployees() {
        return companyRepository.findAll();
    }

    public Company getEmployeeById(int employeeId) throws ResourceNotFoundException {
        return companyRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
    }

    public List<ResponseBody> createEmployee(Company employee) {
        companyRepository.save(employee);

        List<ResponseBody> responseBody = new ArrayList<>();
        ResponseBody responseStatus = new ResponseBody();
        responseStatus.setStatusCode("200");
        responseStatus.setStatusMessage("Record Inserted");
        responseBody.add(responseStatus);

        return responseBody;
    }

    public List<ResponseBody> updateEmployee(int employeeId, Company employeeDetails) throws ResourceNotFoundException {
        Company employee = companyRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setName(employeeDetails.getName());
        employee.setAge(employeeDetails.getAge());
        employee.setAddress(employeeDetails.getAddress());
        employee.setSalary(employeeDetails.getSalary());
        companyRepository.save(employee);

        List<ResponseBody> responseBody = new ArrayList<>();
        ResponseBody responseStatus = new ResponseBody();
        responseStatus.setStatusCode("200");
        responseStatus.setStatusMessage("UPDATED");
        responseBody.add(responseStatus);

        return responseBody;
    }

    public Map<String, Boolean> deleteEmployee(int employeeId) throws ResourceNotFoundException {
        Company employee = companyRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        companyRepository.delete(employee);

        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);

        return response;
    }
}
