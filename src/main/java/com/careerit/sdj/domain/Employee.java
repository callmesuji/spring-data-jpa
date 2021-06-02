package com.careerit.sdj.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
//@Table
@Data
public class Employee {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String country;
	private double salary;
	

}
