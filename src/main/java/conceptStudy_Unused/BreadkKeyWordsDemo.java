package conceptStudy_Unused;

public class BreadkKeyWordsDemo {

	public static void main(String[] args) {

		//break keyword -->exit loop
		
		int num=1;
		while(num<=9) {
			System.out.println(num);
			num++;
		
			if(num==6) 
				break;
			
		}
		System.out.println("after while loop");
		
		//continue keyword --> skip current iteration and cotinue the same loop
		// condition is -> i dont want to print 6
		
		System.out.println("************* Contine Keyword Demo *************");
		int num1=1;
		while(num1<=9) {
			if(num1 == 5) {
				num1++;
				continue;
			}
			System.out.println(num1);
			num1++;
		}
		
		System.out.println("after while loop");
		
		
		
		//return --> return control to called
		//throw --> throw an exception explicitly
	}

}
