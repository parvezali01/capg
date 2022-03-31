package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.EmployeeDAO;

@RestController
public class EmlployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	@PostMapping("/addemployee")
	public String addemployee(@RequestBody Employee employee) {
		employeeDAO.save(employee);
		return "employee saved";
	}
	
	@PatchMapping("/updateemployee")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeDAO.save(employee);
		return "employee updated";
	}
	

}
