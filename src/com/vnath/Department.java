package com.vnath;

public class Department {
	private String deptName=null;
	private String deptID=null;
	
	public void setdeptName(String deptName){
		this.deptName=deptName;
	}
	
	public void setdeptID(String deptID){
		this.deptID=deptID;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public String getDeptID() {
		return deptID;
	}

	public void showDepartmentDetails(){
		System.out.println("DeptName: "+ this.deptName + "\n"
				+ "DeptID: " + this.deptID);
	}
}
