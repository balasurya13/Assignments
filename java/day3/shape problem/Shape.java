package com.assignmentday3;

public class Shape {
	int length;
	int width;
	int height;
	Shape(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
		public int calArea() {
			return 0;
			
		}
		public static void main (String args[]) {
			Shape r1 = new Rectangle(10,20,30);
			Shape s1 = new Square(10,20,30);
			Shape t1 = new Triangle(10,20,30);
			
			System.out.println("Area of rectangle"+r1.calArea());
			System.out.println("Area of square"+s1.calArea());
			System.out.println("Area of Triangle"+t1.calArea());
			
		}
}