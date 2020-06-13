package conceptStudy_Unused;

public class DataBaseOps {
	String DBserverURl = "url1.com";  // fixed --> static
	String 	DBName;  // instance variables or class level variables
	String userName;
	String 	password;
	
	//internal (Default) constructor --> created  by JVM, if no explicit constructor deinfed by user.
	//non parameterized constructor --> initialize values, but could be hardcoded
	
	public DataBaseOps() {
//		DBName = "Name1";
//		userName = "user1";
//		password = "pass1";
	}
	
	//parameterized constructor
	public DataBaseOps(String DBserverurl, String dbName, String uName, String pass) {
		System.out.println("In Constructor");
		DBserverURl = DBserverurl;
		DBName = dbName;
		userName = uName;
		password = pass;
		
	}

	//parameterized constructor
	public DataBaseOps(String dbName, String uName, String pass) {
		System.out.println("In Constructor");
		DBName = dbName;
		userName = uName;
		password = pass;
		
	}
	
	public void createCOnnection() {
		System.out.println("Creating connection, with: "+ DBserverURl + " "+DBName+" "+userName + " "+password);
	}

	public void readDbData() {
		System.out.println("Reading data from DB, with: "+ DBserverURl + " "+DBName+" "+userName + " "+password);
	}
	
	public void executeScrit() {
		System.out.println("Executing script, with: "+ DBserverURl + " "+DBName+" "+userName + " "+password);

	}

}
