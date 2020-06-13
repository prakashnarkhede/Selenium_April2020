package conceptStudy_Unused;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demowebshop.tricentis.com/");
		
		//get page title
		String pageTitle = driver.getTitle();
		System.out.println("page title on home page is: "+pageTitle);
		
		//locate webELement for Login button
		WebElement LoginLink = driver.findElement(By.className("ico-login"));
		String color = LoginLink.getCssValue("color");
		LoginLink.click();
		System.out.println("color: "+color);
		//locate email field
		WebElement EmailBox = driver.findElement(By.id("Email"));
		EmailBox.sendKeys("demo123@demo123x.com");
		
		//locate password field
		driver.findElement(By.id("Password")).sendKeys("demo123@demo123x.com");
		
		//id > name > xpath
		//lcoate loogin button with xpath
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		//verify if logged in successfully
		
		//get page title
				String pageTitle1 = driver.getTitle();
				System.out.println("page title on Logged in page is: "+pageTitle1);
		
		String myEmail = driver.findElement(By.xpath("//a[@href='/customer/info']")).getText();
		
		if(myEmail.equals("demo123@demo123x.com")) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");
		}
		
		//Assert --> TestNG
		
	}

}
