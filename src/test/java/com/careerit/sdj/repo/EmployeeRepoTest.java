package com.careerit.sdj.repo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.careerit.sdj.domain.Employee;

@SpringBootTest
public class EmployeeRepoTest {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Test
	public void getAllEmployeeTest() {
	List<Employee> list=	employeeRepo.findAll();
	assertEquals(1000, list.size());
	}

}
