package conceptStudy_Unused;

public class accessModDemo {

	//4 diff access modifiers
	//1. public - everywhere
	//2. Default - only within package, if no access mod is given, it is default
	//3. Protected - within package + in subclasses (through inheritance)
	//4. private - class only
	
	public void publicMethod() {
		System.out.println("Public method m1");
	}
	
	void DefaulMethod() {
		System.out.println("Default method m2");
	}
	
	private void privateMethod() {
		System.out.println("Private method called");
	}
	
	protected void protectedMethod() {
		System.out.println("Protected method called");
	}
	
	public static void main(String[] args) {

	}

}
