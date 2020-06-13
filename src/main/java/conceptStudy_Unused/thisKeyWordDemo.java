package conceptStudy_Unused;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class thisKeyWordDemo {

	//Org --> FTE + interns
	//FTE --> paid salary
	//interns --> no salary
	int eNumber;
	String eName;
	String eLocation;
	int eSalary;

	public thisKeyWordDemo() {
		System.out.println("Welcome to org ABC !!!!!!!!!!!!!!!!!!!!!");
	}
	public thisKeyWordDemo(int eNumber, String eName, String eLocation) {
		this();
		this.eNumber = eNumber;
		this.eName = eName;
		this.eLocation = eLocation;
	}
	public thisKeyWordDemo(int eNumber, String eName, String eLocation, int eSalary) {
		this(eNumber, eName, eLocation);
		this.eSalary = eSalary;	
	}


	public void showEployeeData() {
		System.out.println("Employee Number is : "+eNumber);
		System.out.println("Employee Name is : "+eName);
		System.out.println("Employee Location is : "+eLocation);
		if(eSalary>0) {
			System.out.println("Employee Salary is : "+eSalary);			
		}
	}

	public static void main(String[] args) {
		thisKeyWordDemo emp = new thisKeyWordDemo(101, "FTE", "Pune", 100);
		emp.showEployeeData();
		thisKeyWordDemo emp1 = new thisKeyWordDemo(101, "Intern", "Pune");
		emp1.showEployeeData();
		
		thisKeyWordDemo th =  new thisKeyWordDemo();

	}

}
