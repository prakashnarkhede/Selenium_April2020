package conceptStudy_Unused;

import org.testng.annotations.Test;

public class StringsDemo {
	
	String name = "Prakash Narkhede"; // using string literal	
	String newName = "Prakash";
	String newName_1 = "John";
	String name_1 = new String("Prakash");  // usign class object
	int age = 30;
	
	@Test
	public void demoString() {
		
		
		String[] spiltName = name.split(" ");
		System.out.println("FirstName: "+spiltName[0]);
		System.out.println("Last Name: "+spiltName[1]);
		
		System.out.println(name.charAt(9));
		System.out.println("Does string contain Prakash? : "+ name.contains("Prakash1"));
		
		String  PaymentSuccessMessage = "Your payment is successfull and ref num is123";
		
		String[] splittedSuccessMessage = PaymentSuccessMessage.split(" ");
		System.out.println("Payment conf number is: "+splittedSuccessMessage[7]);
		
		System.out.println("Payment conf number is: "+PaymentSuccessMessage.substring(42, 45));
		
		
		PaymentSuccessMessage.trim();
		//PaymentSuccessMessage.
		
	//	Prakash
	//	prakash
		name.equals("");
		name.equalsIgnoreCase("");
		
		System.out.println("How long i am? : "+name.length());
		
		
		System.out.println("Hash of name is: "+ name.hashCode());
		System.out.println("Hash of newName is: "+ newName.hashCode());
		System.out.println("Hash of name_1 is: "+ name_1.hashCode());
		
		System.out.println(name == newName); // == compares memory locations
		System.out.println(name == name_1);  
		
		System.out.println(name.equals(name_1));  //.equals ==> gets content out of memory location and then compare
		


		//String is immutable ==> can not be changed
		//name = "DemoName_changed";
		
		//StringBuffer and StringBuilder ==> mutable
	}
	public static void main(String[] args) {
		
	
		

	}

}
