package org.Department;

import org.college.College;

/* Package   :org.college
Class     :College
Methods   :collegeName(),collegeCode(),collegeRank()

Package   :org.department
Class        :Department
Methods   :deptName()

Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
*/

public class Department extends College {
	
	public void DeptName() {
		System.out.println("computer sceince, bio teh");
	}
public static void main(String[] args) {
	
	College college=new College();
	college.CollegeName();
	college.CollegeCode();
	college.CollegeRank();
	
}
}

