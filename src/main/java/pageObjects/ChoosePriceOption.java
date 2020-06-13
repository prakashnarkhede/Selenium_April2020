package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChoosePriceOption {
	//Pagefactory
	
		@FindBy(xpath="//table[@id='priceTable']/tbody/tr[1]/td[2]")
		WebElement field_silverPlanPrice;
		
		@FindBy(xpath="//table[@id='priceTable']/tbody/tr[1]/td[3]")
		WebElement field_goldPlanPrice;
		
		@FindBy(xpath="//table[@id='priceTable']/tbody/tr[1]/td[4]")
		WebElement field_platinumPlanPrice;
		
		@FindBy(xpath="//table[@id='priceTable']/tbody/tr[1]/td[5]")
		WebElement field_ultimatePlanPrice;
		
		@FindBy(xpath="//input[@id='selectsilver']/following-sibling::span")
		WebElement btn_selectsilver;

		@FindBy(xpath="//input[@id='selectgold']/following-sibling::span")
		WebElement btn_selectgold;
		
		@FindBy(xpath="//input[@id='selectplatinum']/following-sibling::span")
		WebElement btn_selectplatinum;
		
		@FindBy(xpath="//input[@id='selectultimate']/following-sibling::span")
		WebElement btn_selectultimate;
		
		
		@FindBy(id="nextsendquote")
		WebElement btn_Next;
		
		//inittialize web elements from this page with driver
		//constructor of current Class
		public ChoosePriceOption(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void verifySilverPlanPrice(String value) {
			String actualValue = field_silverPlanPrice.getText();
			Assert.assertEquals(actualValue, value, "Silver plan pricing is not mathching.");
		}
		
		public void verifyGoldPlanPrice(String value) {
			String actualValue = field_goldPlanPrice.getText();
			Assert.assertEquals(actualValue, value, "Gold plan pricing is not mathching.");
		}
		
		public void verifyPlatinumPlanPrice(String value) {
			String actualValue = field_platinumPlanPrice.getText();
			Assert.assertEquals(actualValue, value, "Platinum plan pricing is not mathching.");
		}
		
		public void verifyUltimatePlanPrice(String value) {
			String actualValue = field_ultimatePlanPrice.getText();
			Assert.assertEquals(actualValue, value, "Ultimate plan pricing is not mathching.");
		}
		
		
		public void selectPlan(String plan) {
			switch (plan) {
			case "Silver":
				btn_selectsilver.click();
				break;
			case "Gold":
				btn_selectgold.click();
				break;
			case "Platinum":
				btn_selectplatinum.click();
				break;
			case "Ultimate":
				btn_selectultimate.click();
				break;
			default:
				break;
			}
		}

		
		public void clickOnNextButton() {
			btn_Next.click();
		}
	}
