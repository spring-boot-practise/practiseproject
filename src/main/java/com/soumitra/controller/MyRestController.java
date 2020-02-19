package com.soumitra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumitra.model.Employee;

@RestController
@RequestMapping(value = "restservice")
public class MyRestController {
	
	@GetMapping(value = "/allemployees")
	public List<Employee> allEmployee() {
		System.out.println("####### HIT 1 #########");
		final List<Employee> employees = new ArrayList<>();
		Employee emp;
		emp = new Employee("Soumitra", "Dutta", 3200000f);
		employees.add(emp);
		emp = new Employee("John", "Cena", 2000000f);
		employees.add(emp);
		return employees;
	}

}
