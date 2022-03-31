package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Task;
import com.model.TaskDAO;

@RestController
public class TaskController {
	
	
	@Autowired
	TaskDAO taskDAO;
	@PostMapping("/addtask")
	public String addtask(@RequestBody Task task) {
		taskDAO.save(task);
		return "Task saved";
	}

}
