package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utilities.CommonMethods;
import utilities.ObjectFactory;

public class FillVehicleData extends ObjectFactory{
	CommonMethods cm = new CommonMethods();
	
	@FindBy(id="make")
	WebElement dd_make;
	
	@FindBy(id="model")
	WebElement dd_model;
	
	@FindBy(xpath="//input[@id='cylindercapacity']")
	WebElement txt_cylindercapacity;
	
	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;
	
	@FindBy(id="numberofseats")
	WebElement dd_numberofseats;
	
	@FindBy(xpath="//input[@name='Right Hand Drive']/parent::label")
	List<WebElement> rdo_isRightHandDrive;
	
	@FindBy(id="numberofseatsmotorcycle")
	WebElement dd_numberofseatsmotorcycle;
	
	@FindBy(id="fuel")
	WebElement dd_fuel;
	
	@FindBy(id="payload")
	WebElement txt_payload;
	
	@FindBy(id="totalweight")
	WebElement txt_totalweight;
	
	@FindBy(id="listprice")
	WebElement txt_listprice;
	
	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_Next;

	///init
	public FillVehicleData(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterVehicleData(Map<String, String> testData) {
		cm.selectDropDownByVisibleText(dd_make, testData.get("Vehicle_Make"));
		cm.selectDropDownByVisibleText(dd_model, testData.get("Vehicle_Model"));
		txt_cylindercapacity.sendKeys(testData.get("Vehicle_CylinderCapacity"));
		txt_engineperformance.sendKeys(testData.get("Vehicle_Enging Performance"));
		date_dateofmanufacture.sendKeys(testData.get("Vehicle_Date of Manufacture"));
		cm.selectDropDownByVisibleText(dd_numberofseatsmotorcycle, testData.get("Vehicle_No of Seats_motorcycle"));
		cm.selectRadioButton(rdo_isRightHandDrive, testData.get("Vehicle_RightHandDrive"));
		cm.selectDropDownByVisibleText(dd_numberofseats, testData.get("Vehicle_No of Seats"));
		cm.selectDropDownByVisibleText(dd_fuel, testData.get("Vehicle_Fuel Type"));
		txt_payload.sendKeys(testData.get("Vehicle_PayLoad"));
		txt_totalweight.sendKeys(testData.get("Vehicle_Total Weight"));
		txt_listprice.sendKeys(testData.get("Vehicle_List Price"));
		txt_annualmileage.sendKeys(testData.get("Vehicle_Annual Mileage"));
	}
	
	public void clickNextButton() {
		btn_Next.click();
		test.log(Status.PASS, "Clicked on Next button on Fill Vehicle Data.");
	}
}
