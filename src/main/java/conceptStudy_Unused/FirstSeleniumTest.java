package conceptStudy_Unused;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		//1. open chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\DriverExecutables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//2. Open url (AUT)
		driver.get("http://demo.automationtalks.com/");
		
		
		//3. Perfrom actions--> get title & print
		String pageTitle = driver.getTitle();
		String currUrl =  driver.getCurrentUrl();	
		System.out.println("pageTitle is: "+pageTitle);
		
		//4. close browser
		driver.close();
	}

}
