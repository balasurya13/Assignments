package com.assignment;


	public class car {
		int speed;
		double regularPrice;  
		String color;
		
		public car(int speed, double regularPrice, String color){
			this.speed=speed;
			this.regularPrice=regularPrice;
			this.color=color;
		}
		
		public double getSalePrice() {
			return regularPrice ;
			}
	}