/*
Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/

package Week3.Day1;

public class students {

public   int getstudentinfo_studentid() {
	
	int id=987877;
	return id;
	
}
public String getstudentinfo_studentname() {
	
	String studentname="ramu";
	return studentname;
}
public String getstudentinfo_studentemail()
{
	String mailid="krishnan.ss@gg.com";
	return mailid;
}

public  double  getstudentinfo_studentmobile() {
	
	double mobileno=99999999;
	return mobileno;
	
	}
public static void main(String[] args) {
	
	students student=new students();
	
	student.getstudentinfo_studentid();
	student.getstudentinfo_studentname();
	student.getstudentinfo_studentmobile();
	student.getstudentinfo_studentemail();
	
}

}

