package com.model;
import javax.persistence.*;
import java.util.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	private String employeeName;
	private String department;
	private String designation;
	private String password;
	@OneToOne
	private Employee superior;
	@OneToMany
	private List<Task> taskList;
	@OneToOne
	private EmployeeRating rating;
	@OneToMany
	private List<Attendence> attendenceList;
	
	public Employee() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getSuperior() {
		return superior;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public EmployeeRating getRating() {
		return rating;
	}

	public void setRating(EmployeeRating rating) {
		this.rating = rating;
	}

	public List<Attendence> getAttendenceList() {
		return attendenceList;
	}

	public void setAttendenceList(List<Attendence> attendenceList) {
		this.attendenceList = attendenceList;
	}
	
}
