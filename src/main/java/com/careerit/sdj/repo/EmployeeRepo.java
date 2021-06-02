package com.careerit.sdj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.sdj.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
		

}
