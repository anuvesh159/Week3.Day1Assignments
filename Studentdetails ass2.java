package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name : ANIVESHU KARANAM");
	}
	public void studentDepartment() {
		System.out.println("Student Department: Computer Science(IT)");
	}
	public void studentID() {
		System.out.println("Student ID: 142451");
	}
	public static void main(String[] args) {
		
		Student data = new Student();
		data.collegeCode();
		data.collegeName();
		data.collegeRank();
		data.departmentName();
		data.studentName();
		data.studentID();
		data.studentDepartment();
		
	}
	
}
