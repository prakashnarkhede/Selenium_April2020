package conceptStudy_Unused;

public class ConrolStatementDemo {

	public static void main(String[] args) {

		//If /// switch case
		String browser = "ie";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			//code to launch chrome browser
			System.out.println("code to launch chrome browser");
		}else if(browser.equalsIgnoreCase("FF")) {
			//code to launch FF browser
			System.out.println("code to launch FF browser");
		}else if(browser.equalsIgnoreCase("ie")) {
			//code to launch ie browser
			System.out.println("code to launch ie browser");
		} else {
			System.out.println("Please specify correct browser.");
		}
		
		
		//switchCase
		switch (browser) {
		case "Chrome":
			//code to launch chrome browser
			System.out.println("code to launch chrome browser");
			break;
		case "FF":
			//code to launch FF browser
			System.out.println("code to launch FF browser");
			break;
		case "ie":
			//code to launch ie browser
			System.out.println("code to launch ie browser");
			break;

		default:
			System.out.println("Please specify correct browser.");
			break;
		}
		
		
		
	}

}
