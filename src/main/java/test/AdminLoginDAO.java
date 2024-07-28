package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO {
	public AdminBean ab=null; // bean puts the self address here
	public AdminBean login(String uN,String pW) {
		try {
			Connection conn =DBConnection.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from StoreAdmin62 where UNAME=? and PWORD=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs=ps.executeQuery();
			// rs is used to iterator table data       
			if(rs.next()) {
				ab=new AdminBean();
				ab.setUname(rs.getString(1));
				ab.setPword(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setAdd(rs.getString(5));
				ab.setMail(rs.getString(6));
				ab.setPhno(rs.getLong(7));
			}
		}catch(Exception e) {
			System.out.println("Data not fetching from database");
			e.printStackTrace();
		}
		
		return ab;
	}
}
