package com.netscript;

public class Employee
{  
private int id;  
private String firstName,lastName,city; 
private RolePojo rp;
 
public RolePojo getRp() {
	return rp;
}
public void setRp(RolePojo rp) {
	this.rp = rp;
}
public Employee() {}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
 
}  