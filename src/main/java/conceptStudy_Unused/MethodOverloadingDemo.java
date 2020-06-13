package conceptStudy_Unused;

import org.testng.Assert;

public class MethodOverloadingDemo {
	
//	ResultPage
//	   1. Validation success?
//	   2. FATCA status?
//	   3. IGA Status?
//	   4. Rejection reasons?
//	 
//	50 TC --> 10 TC ( verify all 4 details), 20TC --> validation success?
//	20 TC --> Validation status and FATCA Status
//

	public void verifyResultPage(String validationStatus, String FStatus, String IStatus, String rReason){
		Assert.assertEquals("", validationStatus);
		Assert.assertEquals("", FStatus);
		Assert.assertEquals("", IStatus);
		Assert.assertEquals("", rReason);
	}
	
	public void verifyResultPage(String validationStatus, String FStatus){
		Assert.assertEquals("", validationStatus);
		Assert.assertEquals("", FStatus);
	}

	public void verifyResultPage(String validationStatus){
		Assert.assertEquals("", validationStatus);
	}
	
	public void verifyResultPage(int expdate){
		Assert.assertEquals("", expdate);
	}
	
	
	public static void main(String[] args) {
		MethodOverloadingDemo demo = new  MethodOverloadingDemo();
		demo.verifyResultPage("valid");
		demo.verifyResultPage("valid", "COmpliant");
		demo.verifyResultPage("valid", "COmpliant", "IGA1", "Rejected because of so and so reason");
	}

}
