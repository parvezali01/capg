package com.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int taskId;
	private String taskName;
	private String taskDescription;
	@JsonFormat(pattern="dd-MM-yyyy")
	private java.sql.Date dateOfAllocation;
	@JsonFormat(pattern="dd-MM-yyyy")
	private java.sql.Date deadLine;
	@OneToOne
	private Employee allocatedTo;
	
	
	public Task() {
		
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public java.sql.Date getDateOfAllocation() {
		return dateOfAllocation;
	}

	public void setDateOfAllocation(java.sql.Date dateOfAllocation) {
		this.dateOfAllocation = dateOfAllocation;
	}

	public java.sql.Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(java.sql.Date deadLine) {
		this.deadLine = deadLine;
	}

	public Employee getAllocatedTo() {
		return allocatedTo;
	}

	public void setAllocatedTo(Employee allocatedTo) {
		this.allocatedTo = allocatedTo;
	}

}
