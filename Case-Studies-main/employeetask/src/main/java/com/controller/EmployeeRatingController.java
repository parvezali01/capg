package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.EmployeeRating;
import com.model.EmployeeRatingDAO;

@RestController
public class EmployeeRatingController {
	@Autowired
	EmployeeRatingDAO employeeRatingDAO;
	
	@PostMapping("/addrating")
	public String addRating(@RequestBody EmployeeRating employeeRating) {
		employeeRatingDAO.save(employeeRating);
		return "Rating Added";
	}

}
