package conceptStudy_Unused;

//parent class
public class InheritanceDemo1 {

	int age = 10;
	final String companyName = "ABC";
	
	
	public void test1() {
		age =20;
		//companyName = "PQR";   --> final variable can not be reassigned value
		System.out.println("Test1 method from demo1");
	}
	
	public final void test1Final() { // i dont want anyone to modify this method, so final
		System.out.println("Test1 final method from demo1");
		System.out.println("anothe statement");
	}
	
	private void test1Private() {  // private method can not be accessed from child class
		System.out.println("Test1 Private  method from demo1");
	}
	
	public static void main(String[] args) {

	}

}
