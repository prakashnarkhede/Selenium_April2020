package javaBasics;

public class accessModDemo2 {
	
	
	public static void main(String[] args) {
		accessModDemo a = new accessModDemo();
		a.DefaulMethod();
		a.publicMethod();
		a.protectedMethod();
		//a.privateMethod(); --> can not access private methods of other classes
	}

}
