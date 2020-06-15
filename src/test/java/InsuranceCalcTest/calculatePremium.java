package InsuranceCalcTest;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import pageObjects.ChoosePriceOption;
import pageObjects.FillInsurantData;
import pageObjects.FillVehicleData;
import pageObjects.FilleProductData;
import testBase.TestBase;
import utilities.ExcelReader;
import utilities.ObjectFactory;

public class calculatePremium extends ObjectFactory{
	TestBase tb = new TestBase(); 
	FillVehicleData vData;
	FillInsurantData iData;
	FilleProductData pData;
	ChoosePriceOption options;
	ExcelReader er = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/TestData/VehicleInsuranceCalcualator_TestData.xlsx");	 
	
	@BeforeMethod
	public void setUP() throws Exception {
		
		driver = 	tb.openBrowserAndNavigate();
		vData = new FillVehicleData(driver);
		iData = new FillInsurantData(driver);
		pData = new FilleProductData(driver);
		options = new ChoosePriceOption(driver);
	}
	
	@Test
	public void Premium_for_Honda_MotorCycle() throws Exception {
		Map<String, String> testData = er.getTestDataInMap(1);

		//1.fill vehicle data
		vData.enterVehicleData(testData);
		vData.clickNextButton();
		//2. insurant data
		iData.fillActualInsurantData(testData);
		iData.clickOnNextButton();
		//3. product data
		pData.fillActualProductData(testData);
		pData.clickOnNextButton();
		//4. verify and proceed
		options.verifySilverPlanPrice(testData.get("PriceValidation_Silver"));
		options.verifyGoldPlanPrice(testData.get("PriceValidation_Gold"));
		options.verifyPlatinumPlanPrice(testData.get("PriceValidation_Platinum"));
		options.verifyUltimatePlanPrice(testData.get("PriceValidation_Ultimate"));
		
		//select desired option
		String SelectOption = testData.get("SelectOption");
		options.selectPlan(SelectOption);
		options.clickOnNextButton();
	}
	
	@Test
	public void Premium_for_VOLVO_Scooter() throws Exception {
		Map<String, String> testData = er.getTestDataInMap(2);

		//1.fill vehicle data
		vData.enterVehicleData(testData);
		vData.clickNextButton();
		//2. insurant data
		iData.fillActualInsurantData(testData);
		iData.clickOnNextButton();
		//3. product data
		pData.fillActualProductData(testData);
		pData.clickOnNextButton();
		//4. verify and proceed
		
	}
	
	@Test
	public void Premium_for_Ford_Moped() throws Exception {
		Map<String, String> testData = er.getTestDataInMap(3);

		//1.fill vehicle data
		vData.enterVehicleData(testData);
		vData.clickNextButton();
		//2. insurant data
		iData.fillActualInsurantData(testData);
		iData.clickOnNextButton();
		//3. product data
		pData.fillActualProductData(testData);
		pData.clickOnNextButton();
		//4. verify and proceed
		
	}

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
	}

}
