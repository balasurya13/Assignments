package com.assignmentday3;

public class Square extends Shape {
	Square(int length,int width,int height){
		super(length,width,height);
	}
	public int calArea() {
		return length*width*height;
	}

}
