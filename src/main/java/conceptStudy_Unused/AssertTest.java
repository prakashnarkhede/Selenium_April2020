package conceptStudy_Unused;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTest {

	@Test
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			

		// get title & print
		String pageTitle = driver.getTitle();

		//TestNG --> framework --> organise test, data driven, generate report
		//Junit
		//Assert --> compare 2 things
		// 2 types of Assert
		//1. Hard Assert --> if any assertion failure, Execution gets terminated as same point
		//               --> ex   		Assert.assertEquals(pageTitle, "Fill Vehicle Data1");
		//2. Soft Assert --> use if you have multiple asserts
		 //              --> does not terminate execution if any assert fails
		
		//hard assert
		//Assert.assertEquals(pageTitle, "Fill Vehicle Data1");
		
		String pageUrl = driver.getCurrentUrl();
		//hard assert
		//Assert.assertEquals(pageUrl, "www.google.com");

		
		//soft assert --> create object of class
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(pageTitle, "demo");
		sa.assertEquals(pageUrl, "wwww.google.com");
		sa.assertAll();
		
		
	//	Assert.assertTrue(condition);
		//4. close browser
	//	driver.close();
	}

}
