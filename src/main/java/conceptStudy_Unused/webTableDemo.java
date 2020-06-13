package conceptStudy_Unused;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableDemo {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/table-sort-search-demo.html");
		
		String empName = "C. Hurst";
		String salary = driver.findElement(By.xpath("//table[@id='example']/tbody//td[text()='" + empName + "']/following-sibling::td[5]")).getText();
		System.out.println("Salary is: "+salary);
		
		//find total rows
		int totalRows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		System.out.println("totalRows: "+totalRows);
		// total columns
		int totalCols = driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td")).size();
		System.out.println("totalCols: "+totalCols);
	
		
		
		
		
	
		
	}

}
