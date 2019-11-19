package com.sf.beans;

import java.util.Date;

public class Course {
	
	private String courseName;
	private Date joiningDate;
	private Date completionDate;
	
	public Course(String courseName, Date joiningDate, Date completionDate) {
		this.courseName = courseName;
		this.joiningDate = joiningDate;
		this.completionDate = completionDate;
	}//constructor

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", joiningDate=" + joiningDate + ", completionDate="
				+ completionDate + "]";
	}//toString
}//class
