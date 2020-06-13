package conceptStudy_Unused;

public class staticKeywordDemo {
	static String BankName;
	static String ReportName;
	String customerName;
	int accountNumer;
	int accountBalance;
	
	//static block --> gets executed at the time of class loading
	static {
		System.out.println("in static block");
		System.out.println(Math.sqrt(44));
	}
	
	public void gernerateReport()
	{
		System.out.println("                    "+BankName + "                      ");
		System.out.println("                    "+ReportName + "                      ");
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Account Numer: "+accountNumer);
		System.out.println("Account Balance: "+accountBalance);
		System.out.println();
		

	}
	
	public static void main(String[] args) {
		staticKeywordDemo.BankName = "XYZ bank";
		staticKeywordDemo.ReportName = "LOC Report";
		
		staticKeywordDemo cust1 = new staticKeywordDemo();
		cust1.customerName = "Robert";
		cust1.accountNumer = 111;
		cust1.accountBalance = 100;
		
		cust1.gernerateReport();
		
		
		staticKeywordDemo cust2 = new staticKeywordDemo();

		cust2.customerName = "Prakash";
		cust2.accountNumer = 222;
		cust2.accountBalance = 200;
		cust2.gernerateReport();

		
	}

}
