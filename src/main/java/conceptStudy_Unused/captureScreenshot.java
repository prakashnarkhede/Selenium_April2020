package conceptStudy_Unused;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captureScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtalks.com/");
		
		
		//3. Perfrom actions--> get title & print
		String pageTitle = driver.getTitle();
		String currUrl =  driver.getCurrentUrl();	
		System.out.println("pageTitle is: "+pageTitle);
		
		//capture screenshot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\raghu_Feb2020\\demoScreenShot.jpeg");
		FileUtils.copyFile(srcFile, destFile);
		
		//4. close browser
		driver.close();
	}

}
