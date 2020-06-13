package conceptStudy_Unused;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractionDemo3 extends AbstractionDemo2 {

	@Override
	public void deposit() {
		System.out.println("Deposit Method");
	}
	
	//By class
	WebDriver driver = new ChromeDriver();
	public void demo() {
		driver.findElement(By.xpath("")).click();
	}
}
