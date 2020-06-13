package conceptStudy_Unused;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSEdemo {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/");

	}
	
	@Test
	public void Test1() throws IOException, InterruptedException {
		
	String title = (String) ((JavascriptExecutor)driver).executeScript("return document.title");
		System.out.println("title is: "+ title);
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('nextenterinsurantdata').click()");	
		Thread.sleep(2000);

		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");	
	}
	
	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}

}
