package conceptStudy_Unused;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	//read the data from database


	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int compay_id = 17;
		Class.forName("com.mysql.jdbc.Driver");
		
		//1. establish connection with database
		Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/automationtalks", "automationtalks", "automationtalks");
		
		//2. read table data
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM company where COMPANY_ID = '17'");
		//3. verify data
		while(rs.next()) {
			String comp_name = rs.getString("COMPANY_NAME");
			String comp_city = rs.getString("COMPANY_CITY");
			System.out.println("comp_name is : "+comp_name);
			System.out.println("comp_city is : "+comp_city);

		}
	}
}
