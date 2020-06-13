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

public class TestIfAllLinksAreUp {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demowebshop.tricentis.com/");
		
		
		//test all links are up or not
		//1. Extract all links --> get all href from tags - a / img
		//2. check if links are up
		
		List<WebElement> allLinksWebElements = driver.findElements(By.tagName("a"));
		
		//how to check list count
		
		int linksCount = allLinksWebElements.size();
		System.out.println("linksCount is: "+linksCount);
		
		for(int i = 0; i < linksCount; i++) {
			WebElement ele1 = 	allLinksWebElements.get(i);
			String url1 = ele1.getAttribute("href");		
			System.out.println("url1 is: "+url1);

			URL url = new URL(url1);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			int respCode = conn.getResponseCode(); //if response code is not 200, then not working

			if(respCode == 200) {
				System.out.println("Link is up");
			}
		}
		
	
		
	}

}
