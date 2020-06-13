package conceptStudy_Unused;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ExceptionDemo1 {
	
	//exception propagation
	public void navigateToURL1() throws MalformedURLException {
		URL u = new URL("www.google.com");

	}
	
	public void callNavigateMethod() throws MalformedURLException {
		ExceptionDemo1 d1 = new ExceptionDemo1();
		d1.navigateToURL1();
	}
	
	public void callNavigateMethod1() {
		ExceptionDemo1 d1 = new ExceptionDemo1();
		try {
			d1.callNavigateMethod();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	public void navigateToURL() {
		
		try {
			URL u = new URL("www.google.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("after try catch block");
		
	}
	

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 0;
		String str = "Demo";
		
		
		try {
			String[] strArr = {"Demo", "Demo1", "Demo2"};
			String demo = strArr[2];
			
			int len = str.length();
			num3 = num2/num1;	
		} catch(ArithmeticException e) {
			System.out.println("You are trying to devide number by 0, which  is not allowed");		
		} catch(NullPointerException e) {
			System.out.println("Null value is passed and you are trying to perform some operations on it.");
		} catch(Exception e) {
			System.out.println("Some other exception");
		} finally { //optional
			//execute always whether exception occurs or not
			System.out.println("In Finally block");
			
		}
		
		System.out.println("Division is: "+num3);

	}

}
