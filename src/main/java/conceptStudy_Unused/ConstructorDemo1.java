package conceptStudy_Unused;

public class ConstructorDemo1 {

	public static void main(String[] args) {

		DataBaseOps db1 = new DataBaseOps("Name1", "user1", "pass1");
		db1.createCOnnection();
		db1.readDbData();
		db1.executeScrit();
		
		System.out.println("*******************************");
		
		DataBaseOps db2 = new DataBaseOps("Name2", "user2", "pass2");
		db2.createCOnnection();
		db2.readDbData();
		db2.executeScrit();
		
		System.out.println("*******************************");

		DataBaseOps db3 = new DataBaseOps();
		db3.createCOnnection();
		db3.readDbData();
		
		DataBaseOps db4 = new DataBaseOps("server1.com", "name3", "user3", "pass3");
	}

}
