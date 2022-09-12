package com.sonata.productDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class productImpl implements productIntf{
	Dbconnection db = new Dbconnection();
	int row =0;
	public int save (Object object ) {
		product p1=(product) object;
		try {
			PreparedStatement s1 =db.getConnection().prepareStatement("insert into product values (?,?,?)");		
			s1.setInt(1, p1.getProductID());
			s1.setNString(2, p1.getProductName());
			s1.setDouble(3, p1.getProductPrice());
			row =s1.executeUpdate();
			db.closeconnection();;
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return row;
	}
}