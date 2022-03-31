package com.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Attendence {
	@Id
	private int attendenceId;
	@JsonFormat(pattern="dd-MM-yyyy")
	private java.sql.Date attendenceDate;
	@Enumerated(EnumType.STRING)
	private AttendenceType status;
	
	public Attendence() {
		
	}

	public int getAttendenceId() {
		return attendenceId;
	}

	public void setAttendenceId(int attendenceId) {
		this.attendenceId = attendenceId;
	}

	public java.sql.Date getAttendenceDate() {
		return attendenceDate;
	}

	public void setAttendenceDate(java.sql.Date attendenceDate) {
		this.attendenceDate = attendenceDate;
	}

	public AttendenceType getStatus() {
		return status;
	}

	public void setStatus(AttendenceType status) {
		this.status = status;
	}

}
