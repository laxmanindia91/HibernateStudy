package com.netscript;

public class RolePojo {

	private int id;
	private String rolename;
	private Employee employee;
	
	RolePojo(){}
	//getter and setter
	
	public int getId() {
		return id;
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setId(int roleid) {
		this.id = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) 
	{
		this.rolename = rolename;
	} 

}
