package test;

// DbInfo interface is created for storing our database crendential i.e username,password,database type
//so when we need to change database type we can change easily  

public interface DBInfo {
	// by default variable are public static final
	public static final String dbUrl="jdbc:oracle:thin:@localhost:1521:ORCL1";
	public static final String userName="C##PM";
	public static final String pword="123";
}
