package testBase;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setPlatform(Platform.LINUX);
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/.m2/repository/webdriver/chromedriver/win32/83.0.4103.39/chromedriver.exe");
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

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
