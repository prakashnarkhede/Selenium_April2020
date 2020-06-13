package conceptStudy_Unused;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo1 {
	WebDriver driver = null;
	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("Executed before class");
	}

	@BeforeMethod
	public void setUpMethod() {
		System.out.println("in before method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtalks.com/");
	}

	@Test (priority = 2, groups = {"SanityCheck", "QuickRegression"})
	public void Test1() {
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Test1 executed");	
		Assert.assertEquals("ddd", "ddddd");
	}

	@Test (priority = 3, groups = {"SanityCheck"}, dependsOnMethods = "Test1", alwaysRun = true)
	public void Test2() {
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Test2 executed");
	}

	@Test (priority = 4, invocationCount = 1, groups = {"SanityCheck", "QuickRegression"})
	public void Test3() {
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Test3 executed");
	}

	@Test(priority = 1, enabled = true, timeOut = 500, description = "User should login successfully by using super user credentials")
	public void Test4() throws InterruptedException {
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Test4 executed");
		//Thread.sleep(6000);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("in after method");
	}

	@AfterClass
	public void afterClassEnd() {
		System.out.println("executed after class");
	}
}
