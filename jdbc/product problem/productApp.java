package com.sonata.productDAO;

public class productApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 product b1 = new product();
		b1.setProductID(3);
		b1.setProductName("ebook");
		b1.setProductPrice(2000);
		
			productImpl p1= new productImpl();
			int a1= p1.save(b1);
			System.out.println(a1);
	}

}
