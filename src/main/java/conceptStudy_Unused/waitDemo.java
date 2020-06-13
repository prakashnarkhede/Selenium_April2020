package conceptStudy_Unused;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitDemo {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/WebDriverWait%20Demo/practice/wait.html");

	}
	
	@Test
	public void Test1() throws IOException, InterruptedException {
		
		//click on button to generate alert
	//	driver.findElement(By.id("alert")).click();
		
	//	Thread.sleep(6000);
	//Define Explicit Wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
	//	wait.until(ExpectedConditions.alertIsPresent());
		
	//	driver.switchTo().alert().accept();
		WebElement button = driver.findElement(By.id("display-other-button"));
		
		wait.until(ExpectedConditions.visibilityOf(button)).click();

		
		//fluentWait
		//polling freq == 500 ms
		
		FluentWait fw = new FluentWait(driver);
		
		
			}
	
	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}

}
