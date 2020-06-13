package conceptStudy_Unused;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
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

public class windowHandlingDemo {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/automation-practice-switch-windows/index.html");

	}

	@Test
	public void Test1() throws IOException, InterruptedException {
		//click on buttont to open new browser tab
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();

		//jump to new browser tab
		String baseHandle = driver.getWindowHandle(); // return id of current window
		Set<String> setHandle = driver.getWindowHandles(); // return set of all windows opend by driver

		System.out.println("baseHandle is: "+baseHandle);
		System.out.println("setHandle is: "+setHandle);
		String childWindow =null;
		for (String str : setHandle) {
			System.out.println("Value is: "+str);
			if(!str.equalsIgnoreCase(baseHandle)) {
				childWindow = str;
			}
		}
		
		//jump to child window
		driver.switchTo().window(childWindow);
		//on new browser tab, do google search
		driver.findElement(By.name("q")).sendKeys("SearchMe");
		driver.findElement(By.name("btnK")).click();
		
		//driver.close(); // this will close browser tab where current focus is on
		
		//jump back to main window
		driver.switchTo().window(baseHandle);
		
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		driver.quit();
	}

	@AfterMethod
	public void tearDown() {
		//	driver.close();
	}

}
