package conceptStudy_Unused;

public class EncapsulationDemo {
	
	//define variables
	private String name;
	private int age;
	private String country = "India";  ///should not be modified
	
	
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		name = name.toUpperCase();
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

//	public void setCountry(String country) {
//		this.country = country;
//	}


	
	//use variables in methods
	public void showData() {
		System.out.println("Actual variables are: "+name +"      "+ age+ "   "+ country );
	}

	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.age = 23;
		ed.name = "demo";
		ed.country = "Japan";
		ed.showData();
		
		EncapsulationDemo ed1 = new EncapsulationDemo();
		ed1.age = 44;
		ed1.name = "Prakash";
		ed1.country = "USA";
		ed1.showData();
		
		
		
	}

}
