package com.assignment;

public class student {
	int studentid;
	String studentName;
	char studentclass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.studentName="Bala";
		s1.studentid=13;
		s1.studentclass='A';
		
		student s2 = new student();
		s2.studentName="be_yes";
		s2.studentid=1;
		s2.studentclass='B';
		
		System.out.println(s1.studentName+" "+s1.studentid+" "+s1.studentclass);
		System.out.println(s2.studentName+" "+s2.studentid+" "+s2.studentclass);
	}

}
