package week3.day1.assignment.org.student;

import week3.day1.assignment.org.department.Department;

public class Student extends Department {

	public void studentName() {
		// TODO Auto-generated method stub

		System.out.println("Srini");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub

		System.out.println("Mech");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub

		System.out.println("1234");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
