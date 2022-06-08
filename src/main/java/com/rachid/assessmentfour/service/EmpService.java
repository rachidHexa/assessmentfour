package com.rachid.assessmentfour.service;

import com.rachid.assessmentfour.entity.Employee;
import com.rachid.assessmentfour.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public Employee saveEmployee(Employee employee){
        return empRepository.save(employee);
    }
}
