package conceptStudy_Unused;

//       child class                   //parent class
public class InheritanceDemo2 extends InheritanceDemo1 {

	public void test2() {
		System.out.println("Test2 method from demo2 class");
	}
	
//	public void test1Final() { // final method can not be overridden
//	}
//	
	public void test1() {
		System.out.println("Method overriding  - test1 in demo2 class");
	}
	
	
	public static void main(String[] args) {
		InheritanceDemo2 d2 = new InheritanceDemo2();
		
		d2.test1(); //demo1
		d2.test2(); //demo2
		d2.test1Final();  // final method from demo1
		
	}

}
