package com.employeemanager.myapplications.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanager.myapplications.model.Employee;
import com.employeemanager.myapplications.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(value = "/listOfAllEmployees")
	public List<Employee> getAllEmployees() {
		
		System.out.println("Initiated Get /api/v1/listOfAllEmployees");
		List<Employee> listOfAllEmployees = employeeRepository.findAll();
		System.out.println(listOfAllEmployees);
		return listOfAllEmployees;
	}
	
	@GetMapping(value = "/error")
	public String errorPage()	{
		return "Error Page";
	}
}