package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertyOperations;

public class TestBase {


	public WebDriver openBrowserAndNavigate() throws Exception {
		WebDriver driver = null;
		//check which browser to laucnh
		String browserValue = PropertyOperations.getPropertiesFileData("Browser");
		String url = PropertyOperations.getPropertiesFileData("url");

		//set browser executable & launch browser - chome / ie/ ff

		if(browserValue.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else	
			if(browserValue.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				 driver = new InternetExplorerDriver();
			} else
				if(browserValue.equalsIgnoreCase("ff")) {
					WebDriverManager.firefoxdriver().setup();
					 driver = new FirefoxDriver();
				} else {
					throw new Exception("Browser selected should be Chrome / IE / firefox. Current value is: "+browserValue);
				}

		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//navigate
		driver.get(url);
		
		return driver;
	}


}
