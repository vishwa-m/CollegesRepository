package com.vnath.test;

import com.vnath.Department;

public class DepartmentTest {

	public static void main(String[] args) {
		Department dept = new Department();
		dept.setdeptID("Dept_001");
		dept.setdeptName("Electronics and Communication Engineering Department");
		dept.showDepartmentDetails(); 
	}
}