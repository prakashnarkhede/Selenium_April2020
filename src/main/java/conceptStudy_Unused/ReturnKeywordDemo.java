package conceptStudy_Unused;

public class ReturnKeywordDemo {

	public int add(int a, int b) {
		int c = a+b;
		return c;	
	}
	
	
	public static void main(String[] args) {
		ReturnKeywordDemo r  = new  ReturnKeywordDemo();
		int result = r.add(9, 10);
		System.out.println("Addition is: "+result);


	}

}
