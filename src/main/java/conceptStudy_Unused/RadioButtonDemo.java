package conceptStudy_Unused;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/");
		
		//Select Radio Button - Right Hand driver = yes
		String rightHandDrive = "No";

		WebElement RightHandDrive = driver.findElement(By
				.xpath("//input[@name='Right Hand Drive']/parent::label[text()='" + rightHandDrive  + "']"));
		RightHandDrive.click();
		

		
	}

}
