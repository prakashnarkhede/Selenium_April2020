package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;

public class FillInsurantData {
	CommonMethods cm = new CommonMethods();

	@FindBy(id="firstname")
	WebElement txt_firstname;
	
	@FindBy(id="lastname")
	WebElement txt_lastname;
	
	@FindBy(id="birthdate")
	WebElement date_birthdate;
	
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	List<WebElement> rdo_gender;
	
	@FindBy(id="country")
	WebElement dd_country;
	
	
	@FindBy(id="zipcode")
	WebElement txt_zipcode;
	
	@FindBy(id="city")
	WebElement txt_city;
	
	@FindBy(id="occupation")
	WebElement dd_occupation;
	
	@FindBy(xpath="//input[@name='Hobbies']/parent::label")
	List<WebElement> chk_hobbies;
	
	@FindBy(id="website")
	WebElement txt_website;
	
	@FindBy(id="open")
	WebElement btn_PictureOpenButton; 
	
	@FindBy(id="nextenterproductdata")
	WebElement btn_Next;

	public FillInsurantData(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fillActualInsurantData(Map<String, String> m) throws InterruptedException {
		txt_firstname.sendKeys(m.get("Insurant_FirstName"));
		txt_lastname.sendKeys(m.get("Insurant_LastName"));
		date_birthdate.sendKeys(m.get("Insurant_birthdate"));
		
		cm.selectRadioButton(rdo_gender, m.get("Insurant_gender"));

		cm.selectDropDownByVisibleText(dd_country, m.get("Insurant_country"));
		txt_zipcode.sendKeys(m.get("Insurant_zipcode"));
		txt_city.sendKeys("Pune");
		cm.selectDropDownByVisibleText(dd_occupation, m.get("Insurant_occupation"));
		
		String hobboesData = m.get("Insurant_Hobby").toString();
		String[] arr = hobboesData.split(",");
		
		cm.selectCheckBoxes(chk_hobbies, arr);
		txt_website.sendKeys("www.google.com");
	
	}
	
	public void clickOnNextButton() {
		btn_Next.click();
	}

}
