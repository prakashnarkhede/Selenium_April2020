package conceptStudy_Unused;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverridingDemo2 extends OverridingDemo1 {

	public void demo2Method() {
		System.out.println("Demo2 Method called");
	}
	
	public String navigateToURL() {
		System.out.println("navigate to URL");
		System.out.println("Maximize browser");
		System.out.println("Impicit wait");
		return null;
	}
	
	public static void main(String[] args) {
		OverridingDemo2 demo2 = new OverridingDemo2();
		demo2.getCurrentURL();
		demo2.getTitle();
		demo2.navigateToURL();
		
		demo2.demo2Method();
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("")).sendKeys("");
	}

}
