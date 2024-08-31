package com.qsp.registration_app.dto;
public class Student {
	private String mail;
	private String name;
	private long phone;
	private String course;
	private String education;
	private String stream;
	private int yearOfPass;
	private String gender;
	private String feesPaid;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getYearOfPass() {
		return yearOfPass;
	}
	public void setYearOfPass(int yearOfPass) {
		this.yearOfPass = yearOfPass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}
	@Override
	public String toString() {
		return "Student [mail=" + mail + ", name=" + name + ", phone=" + phone + ", course=" + course + ", education="
				+ education + ", stream=" + stream + ", yearOfPass=" + yearOfPass + ", gender=" + gender + ", feesPaid="
				+ feesPaid + "]";
	}
	
}
