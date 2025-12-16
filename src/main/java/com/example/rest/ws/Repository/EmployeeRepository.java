package com.example.rest.ws.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.rest.ws.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}