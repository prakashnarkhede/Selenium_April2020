package conceptStudy_Unused;

public class accessModDemo2 extends accessModDemo {
	
	public static void main(String[] args) {
		accessModDemo a = new accessModDemo();
	//	a.DefaulMethod(); // can not access default methods outside package
		a.publicMethod(); 
	//	a.protectedMethod();  // protected methods can not be accessed outside package if not using inheritance
		//a.privateMethod(); --> can not access private methods of other classes
		
		accessModDemo2 a2 = new accessModDemo2();
		a2.publicMethod();
		a2.protectedMethod();
	}

}
