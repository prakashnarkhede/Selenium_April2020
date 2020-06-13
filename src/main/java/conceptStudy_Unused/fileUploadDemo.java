package conceptStudy_Unused;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUploadDemo {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/keyboard-events/index.html");

	}

	@Test
	public void Test1() throws FindFailed, AWTException {
		
	//	driver.findElement(By.id("browseFile")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\log4j.properties");
		
	//if type=file is not present
		
//		WebElement ele = driver.findElement(By.id("browseFile"));
//		Actions act = new Actions(driver);
//		act.click(ele).perform();
        Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern("C:\\Users\\Lenovo\\Desktop\\chooseFile.PNG");
 s.click(fileInputTextBox);

	
		//1. copy file path to clipbord
	      StringSelection data = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\log4j.properties");
	      Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	      cb.setContents(data, null);

		
	//2. cntrl+v
	      Robot rb  =new Robot();
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_V);
	      
	      rb.keyRelease(KeyEvent.VK_CONTROL);
	      rb.keyRelease(KeyEvent.VK_V);

	
	//3. hit enter
		
	      rb.keyPress(KeyEvent.VK_ENTER);      
	      rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	@AfterMethod
	public void tearDown() {
		//	driver.close();
	}

}
