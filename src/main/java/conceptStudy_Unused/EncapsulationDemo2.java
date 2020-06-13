package conceptStudy_Unused;

public class EncapsulationDemo2 {
	
		public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setAge(23);
	//	ed.setName("Demo");
	//	ed.setCountry("Japan");  --> error because no setter method is created
		ed.showData();
		
		System.out.println("Country data is: "+ed.getCountry());
	}

}
