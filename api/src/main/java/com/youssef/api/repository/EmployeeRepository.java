package com.youssef.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youssef.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}