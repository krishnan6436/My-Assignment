package org.student;

import org.Department.Department;

/*Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()*/

public class Student extends Department  {
	
	public void studentname() {
		System.out.println("ramu");
	}

	public void studentDept() {
		System.out.println("MCA");
	}
	public void studentID() {
		System.out.println("789545");
}

	public static void main(String[] args) {
		
		Student student =new Student();
		student.CollegeName();
		student.CollegeCode();
		student.CollegeRank();
		student.studentname();
		student.studentDept();
		student.studentID();
	}
}

