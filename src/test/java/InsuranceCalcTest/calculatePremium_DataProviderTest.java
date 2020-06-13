package InsuranceCalcTest;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import pageObjects.FillInsurantData;
import pageObjects.FillVehicleData;
import pageObjects.FilleProductData;
import testBase.TestBase;
import utilities.ExcelReader;
import utilities.ObjectFactory;

public class calculatePremium_DataProviderTest extends ObjectFactory{
	TestBase tb = new TestBase(); 
	FillVehicleData vData;
	FillInsurantData iData;
	FilleProductData pData;
	ExcelReader er = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/TestData/VehicleInsuranceCalcualator_TestData.xlsx");	 
	
	@BeforeMethod
	public void setUP() throws Exception {
		driver = 	tb.openBrowserAndNavigate();
		vData = new FillVehicleData(driver);
		iData = new FillInsurantData(driver);
		pData = new FilleProductData(driver);
	}
	
	@Test (dataProvider = "vehicleData")
	public void Premium_for_Honda_MotorCycle(Object obj1) throws Exception {
		
			Map<String, String> testData = (Map<String, String>) obj1;
			test.log(Status.INFO, "Below test data is used for execution of this test: "+testData);

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
	
	@DataProvider(name="vehicleData")
	public Object[][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[2][1];
		//put map in to object
		for(int i=1; i <3; i++) {
			Map<String, String> testData = er.getTestDataInMap(i);
			obj[i-1][0] = testData;
		}
		return obj;
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
