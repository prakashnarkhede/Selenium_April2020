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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesDemo {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");

	}
	
	@Test
	public void Test1() throws IOException, InterruptedException {
		
		//enter text in topic
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Prakash");
		
		
		//swith to frame
		driver.switchTo().frame("frame3");
		//click on checkbox
		//1. try with wait
		//Thread.sleep(3000);
		driver.findElement(By.id("a")).click();
		
		//swith to parentPage
		driver.switchTo().defaultContent();
		
		String pageTitle = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("pageTitle is: "+pageTitle);
	}
	
	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}

}
