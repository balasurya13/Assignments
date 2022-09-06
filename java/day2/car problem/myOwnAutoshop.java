package com.assignment;
public class myOwnAutoshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car c=new Car(120, 150, "red");
		sedan s1 =new sedan(30,5600.1,"red");
		ford f2 = new ford(1,1.1,"h",1);
		ford f1 = new ford(33,9000,"black",4000);
		System.out.println("Price of sedan Car\t"+s1.getSalePrice(10));
		System.out.println("Price of first ford car\t"+f2.getSalePrice());
		System.out.println("Price of second ford car\t"+f1.getSalePrice());
	}

}
