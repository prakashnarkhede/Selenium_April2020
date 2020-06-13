package conceptStudy_Unused;

import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

public class OverridingDemo1 extends RemoteWebDriver {

	public String navigateToURL() {
		System.out.println("navigate to URL");
		return null;
	}
	
	public String getTitle() {
		System.out.println("Getting title of webpage");
		return null;
	}
	
	public void getCurrentURL() {
		System.out.println("getting current URL");
	}
	
	//overridden method from RemoteWebDriver class
	public void sendKeys(String keysToSend) {
		System.out.println("Sending key: "+ keysToSend + " to webelement");
	      if(keysToSend==null) {
	        throw new IllegalArgumentException("Keys to send should be a not null CharSequence");
	      }
	      execute(DriverCommand.SET_ALERT_VALUE, ImmutableMap.of("text", keysToSend));
			System.out.println("Sent key: "+ keysToSend + " to webelement");

   }
	
}
