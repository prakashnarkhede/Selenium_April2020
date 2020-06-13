package conceptStudy_Unused;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo2 {
	WebDriver driver = null;

	@BeforeMethod
	@Parameters("browser")                                           
	public void setUpMethod(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();			
		} else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		 driver.navigate().to("http://demowebshop.tricentis.com/");
	}

	@Test ()
	public void Test1() {
		System.out.println("Test1 executed, Page title is: "+driver.getTitle());
	}
	
	//@Test ()
	public void Test2() {
		System.out.println("Test1 executed, Page title is: "+driver.getTitle());

	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
