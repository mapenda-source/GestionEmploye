package com.mapenda.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapenda.dev.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
