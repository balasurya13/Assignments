package com.assignment;

public class ford extends car {
	int year;
	double manufactureDiscount;
	ford(int speed,double regularPrice,String color,double manufactureDiscount){
		super(speed, regularPrice, color);
		this.manufactureDiscount=manufactureDiscount;
	}
	public double getSalePrice() {
		
		return super.getSalePrice()-manufactureDiscount;
		
	}
}
