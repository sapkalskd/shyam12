package com.sf.beans;

public class StudentData {

	private String name;
	private int rollNo;
	private int std;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", rollNo=" + rollNo + ", std=" + std + "]";
	}
}//class
