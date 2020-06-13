package conceptStudy_Unused;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/");
		
	//next button
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//select checkboxes --> Speeding, Other
		String hobbies = "Speeding;Other;Skydiving";
		String[] hobbiesArray = hobbies.split(";");  // [speeding, other]
		
		
//		for(int i = 0; i < hobbiesArray.length; i++) {
//			driver.findElement(By.
//					xpath("//label[text()='Hobbies']/following-sibling::p/label[text()=' "+ hobbiesArray[i]+"']")).click();	
//		}
	
		//for each loop
		for(String str:hobbiesArray) {
			driver.findElement(By.
					xpath("//label[text()='Hobbies']/following-sibling::p/label[text()=' "+ str+"']")).click();	

		}
		
	}

}
