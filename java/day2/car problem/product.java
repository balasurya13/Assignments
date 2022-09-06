package com.assignment;

public class product {

		int proID;
		String proName;
		double proPrice;

		public double proprice(double proPrice ) {
			double p= proPrice *+ proPrice;
			return p;		
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			product p =new product();
			p.proID=456;
			p.proName="iPhone";
			System.out.println(p.proID);
			System.out.println(p.proName);
			System.out.println("Gst \t"+p.proprice(10));
		}

	}