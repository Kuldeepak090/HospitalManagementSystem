package com.example;

public class Receptionists {
private String PatientName;

//DOB=Date of Birth
private int DOB;
private String Gender;
private int PhoneNumber;
private String EmailAddress;
private String Address;
public String getPatientName() {
	return PatientName;
}
public void setPatientName(String patientName) {
	PatientName = patientName;
}
public int getDOB() {
	return DOB;
}
public void setDOB(int dOB) {
	DOB = dOB;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getEmailAddress() {
	return EmailAddress;
}
public void setEmailAddress(String emailAddress) {
	EmailAddress = emailAddress;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
