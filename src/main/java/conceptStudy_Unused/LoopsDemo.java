package conceptStudy_Unused;

public class LoopsDemo {

	public static void main(String[] args) {
		boolean cond = false;
		
		while (cond) {
			System.out.println("in while loop");
		}
		
		

	//print number 1 to 9
		int num = 1;
		while (num <=9) {
			System.out.println(num);
			num++;
		}
		
		
		
		//do while demo
		int num1 = 1;
		do {
			System.out.println(num1);
			num1++;
		} while (num1<=9);
		
		System.out.println("***************************************");
		
		//for loop
		for(int num2 = 1; num2<=9; num2++) {
			System.out.println(num2);
		}
		
		//for each loop // enhanced for loop
		//it is used only with collections
		// Set, List, Map, Array, String array 
		
		String[] strArr = {"Selenium", "QTP", "TOSCA", "JMeter"};
		
	//	String data = "Selenium,QTP,TOSCA,JMeter";
	//	String[] dataArr = data.split(",");
	
		//iterate over string array using normal for loop
		for(int i=0; i<strArr.length; i++ ) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("************ For each loop ********************");
		
		for(String str:strArr) {
			System.out.println(str);
		}
	}
	

}
