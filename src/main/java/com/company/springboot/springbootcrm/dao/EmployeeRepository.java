package com.company.springboot.springbootcrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.company.springboot.springbootcrm.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// no need to write CRUD methods as they are handled by maven dependency <artifactId>spring-boot-starter-data-rest</artifactId>
}
