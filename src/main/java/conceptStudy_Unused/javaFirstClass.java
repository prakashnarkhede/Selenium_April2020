package conceptStudy_Unused;

public class javaFirstClass {

	//Non Static Methods
	public void add() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("Addition is: "+(num1+num2));  //Addition is: 30
	}
	
	
	//parameterized method
	public void add1(int num3, int num4) {
		System.out.println("Addition is: "+(num3+num4));  //Addition is: 30

	}
	
	public int calculate(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}

	public static void mul(int num1, int num2) {
		System.out.println("Mul is: "+ (num1* num2));
	}
	
	
	
	
	//start point
	//special method
	public static void main(String[] args) {
		
		javaFirstClass j1 = new javaFirstClass(); //creating object / instance of the class
		
		j1.add();  //called method
		j1.add1(30, 50);
		j1.add1(50, 50);
		int result = j1.calculate(100, 200);
		System.out.println("result of calc is: "+result);
	
		j1.mul(10, 30); //static methods are class specific , not instance specific
		
		
		javaFirstClass.mul(30, 30);  // calling static method in static way
		
		
		
		//syso ---> it is single line comment
		System.out.println("Hello");
	
		//multiline comment
	/*	line1
		line2
		line3
		line4  */
		
		

		//cntrl + 7
//		line1
//		line3
//		lin4			
		
	}

}
