package com.assignment;

public class Tshirt {
String color;
String material;
String design;

public static void main(String[] args) {
	Tshirt small = new Tshirt();
	small.color="blue";
	small.material = "cotton";
	small.design="round-neck";
	
	Tshirt large = new Tshirt();
	large.color= "orange";
	large.material = "woll";
	large.design="chinese-color";
	
	Tshirt xl = new Tshirt();
	xl.color="maroon";
	xl.material="plastic";
	xl.design="half-sleeve";
	
	System.out.println(small.color+" "+small.design+" "+ small.material);
	System.out.println(large.color+" "+large.design+" "+ large.material);
	System.out.println(xl.color+" "+xl.design+" "+ xl.material);
}
}

