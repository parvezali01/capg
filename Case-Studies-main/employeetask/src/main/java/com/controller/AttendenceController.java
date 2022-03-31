package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Attendence;
import com.model.AttendenceDAO;

@RestController
public class AttendenceController {
	
	@Autowired
	AttendenceDAO attendenceDAO;
	
	@PostMapping("/addattendence")
	public String addAttendence(@RequestBody Attendence attendence) {
		
		attendenceDAO.save(attendence);
		return "Attendence Saved";
	}

}
