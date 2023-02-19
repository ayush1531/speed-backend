package com.rapid.speedbackend.controller;

import com.rapid.speedbackend.model.Employee;
import com.rapid.speedbackend.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRespository employeeRespository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRespository.findAll();
    }
}
