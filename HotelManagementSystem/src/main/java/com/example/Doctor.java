package com.example;

public class Doctor {
	
	private String DoctorId;
    private String DoctorName;
    private String Department;
    private int PhoneNumber;
	public String getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(String doctorId) {
		DoctorId = doctorId;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
}
