package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Mithran");
	}

	public void studentDept() {
		System.out.println("Student Department: CSC");
	}

	public void studentId() {
		System.out.println("Student ID : VT1223455");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n.....Multi Level Inheritance.....");
		Student stObj=new Student();
		stObj.studentName();
		stObj.studentId();
		stObj.collegeName();
		stObj.collegeCode();
		stObj.collegeRank();
		stObj.deptName();
		stObj.studentDept();
		
		
		

	}

}
