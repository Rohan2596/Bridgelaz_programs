package com.bridgelabz.Oops.ClincalManagement.model;

public class Appointment {
	private String DoctorName;
	private String patientName;
	private  String date;
	private String time;
	public String toString() {
		return "Doctor [name=" + DoctorName + ", Patient=" + patientName + ",Date=" +date+",time="+time+ "]";
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
