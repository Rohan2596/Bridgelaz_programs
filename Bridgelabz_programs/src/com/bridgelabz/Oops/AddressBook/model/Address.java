package com.bridgelabz.Oops.AddressBook.model;

public class Address {
	private String Streetname;
	private String BuildingName;
	private String ZipCode;

	private String State;
	private String city;
	@Override
	public String toString() {
		return "Address [Streetname=" + Streetname + ", BuildingName=" + BuildingName + ", ZipCode=" + ZipCode
				+ ", State=" + State + ", city=" + city + "]";
	}
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}
	public String getBuildingName() {
		return BuildingName;
	}
	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	


	
}
