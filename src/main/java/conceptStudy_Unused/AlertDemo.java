package conceptStudy_Unused;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/AlertMessage/index.html");

	}
	
	@Test
	public void Test1() throws IOException, InterruptedException {
		
		//click on gernerate alert button --> to gnerate alert folrcefully
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		String alertText = al.getText();
		Assert.assertEquals(alertText, "This is Alert Text here !!!!");
		Thread.sleep(2000);
		al.accept(); // accept the alert / click on ok on alert
		//al.dismiss();
		Thread.sleep(2000);
		Assert.assertEquals(alertText, "This is Alert Text here !!!!!!!");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
