package com.rachid.assessmentfour.repo;

import com.rachid.assessmentfour.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
