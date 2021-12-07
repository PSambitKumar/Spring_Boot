package com.csm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
