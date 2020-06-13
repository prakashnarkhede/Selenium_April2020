package conceptStudy_Unused;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCOmmands {

	public static void main(String[] args) throws InterruptedException {
		//1. open chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//opening url
		//driver.get("");
		driver.navigate().to("http://demo.automationtalks.com/");
		
		Thread.sleep(2000);
		//click on Other web element
		driver.findElement(By.id("nav_truck")).click();
		Thread.sleep(2000);

		driver.navigate().back();  //go back 1 level
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
	}

}
