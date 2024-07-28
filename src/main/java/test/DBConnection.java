package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn=null;
	private DBConnection() {
		// empty constructor
	}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.userName,DBInfo.pword);
			System.out.println("Connection established..");
			
		} catch(Exception e) {
			System.out.println("Database Connection failed!!");
			e.printStackTrace();
		}
	} //end of static block
	public static Connection getConn() {
		return conn;
	}
	
//	public static void closeConnection() {
//        try {
//            if (conn != null) {
//                conn.close();
//                System.out.println("Connection closed.");
//            }
//        } catch (Exception e) {
//            System.out.println("Error while closing connection.");
//            e.printStackTrace();
//        }
//    
//	}
}
