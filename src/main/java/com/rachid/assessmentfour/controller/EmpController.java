package com.rachid.assessmentfour.controller;

import com.rachid.assessmentfour.entity.Employee;
import com.rachid.assessmentfour.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
        return new ResponseEntity(empService.saveEmployee(employee), HttpStatus.OK);
    }

}
