package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;

public class FilleProductData{
	
	CommonMethods cm = new CommonMethods();

	@FindBy(id="startdate")
	WebElement date_startdate;
	
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id="meritrating")
	WebElement dd_meritrating;
	
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(xpath="//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chk_optionalProducts;
	
	@FindBy(id="courtesycar")
	WebElement dd_courtesycar;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btn_Next;

	
	public FilleProductData(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
public void fillActualProductData(Map<String, String> m) {
		
		System.out.println(m);
		String date = m.get("Product_startdate");
		date_startdate.sendKeys(m.get("Product_startdate"));
		cm.selectDropDownByVisibleText(dd_insurancesum, m.get("Product_insurancesum"));
		cm.selectDropDownByVisibleText(dd_meritrating, m.get("Product_meritrating"));
		cm.selectDropDownByVisibleText(dd_damageinsurance, m.get("Product_damageinsurance"));
		
		String optionals = m.get("Product_OptionalProducts");
		String[] optionalsArr = optionals.split(",");
		cm.selectCheckBoxes(chk_optionalProducts, optionalsArr);
		
		cm.selectDropDownByVisibleText(dd_courtesycar, m.get("Product_courtesycar"));
	}
	
	public void clickOnNextButton() {
		btn_Next.click();
	}
}
