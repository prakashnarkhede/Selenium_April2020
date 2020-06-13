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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemo {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/menu/index.html");

	}
	
	@Test
	public void Test1() throws IOException, InterruptedException {
		//WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
	//	act.moveToElement(doubleClickButton).doubleClick().build().perform();		
	//	act.doubleClick(doubleClickButton).perform();
		
	//	WebElement contextClick = driver.findElement(By.id("rightClickBtn"));
	//	act.contextClick(contextClick).perform();
	
	//	WebElement music = driver.findElement(By.id("ui-id-9"));
		
	//	act.moveToElement(music).perform();
		
		WebElement nextButton = driver.findElement(By.id("nextenterinsurantdata"));
		//act.click(nextButton).perform();
		//act.moveToElement(nextButton).click().build().perform();
		act.moveToElement(nextButton).sendKeys(Keys.TAB);
		
			}
	
	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}

}
