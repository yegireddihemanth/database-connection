package ai.jobiak.databaseConnection;
import java.sql.*;


public class Test_1 {
	
	

	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://localhost:3307//hemanthdb";
		String uname="root";
		String pass="";
		String quary = "select empFirstName  from empinfo where empId=133";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(quary);
		//System.out.println(rs);
		rs.next();
		String name = rs.getString("empFirstName");
		System.out.println(name);
		 
		st.close();
		con.close();
		

	}

}