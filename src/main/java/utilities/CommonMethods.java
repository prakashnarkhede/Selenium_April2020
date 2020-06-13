package utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {


	public void selectDropDownByVisibleText(WebElement dd_webElement, String value) {
		Select os = new Select(dd_webElement);
		os.selectByVisibleText(value);
	}

	public void selectRadioButton(List<WebElement> rdo_isRightHandDrive, String value) {
		for (int i =0; i <rdo_isRightHandDrive.size(); i++) {
			if(rdo_isRightHandDrive.get(i).getText().equalsIgnoreCase(value)){
				rdo_isRightHandDrive.get(i).click();
			}
		}
	}

	public void selectCheckBoxes(List<WebElement> chk_hobbies, String[] hobbies) {
		
		for (String hobby : hobbies) {		
			for(int i = 0; i < chk_hobbies.size(); i++) {	
				if(chk_hobbies.get(i).getText().equalsIgnoreCase(hobby)) {
					chk_hobbies.get(i).click();
					break;
				}
			}		
	}

	}
}
