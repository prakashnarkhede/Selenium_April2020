package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentSetup extends ObjectFactory {

	public static ExtentReports setupExtentReport() {
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");  
	    Date date = new Date();  
	    String actualDate = formatter.format(date); 
	    
		 extent = new ExtentReports();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/ExecutionReports/executionReport_"+actualDate+".html");
		extent.attachReporter(sparkReport);
		sparkReport.config().setDocumentTitle("Test Exec report");
		sparkReport.config().setReportName("Test Exec report");
		sparkReport.config().setTheme(Theme.DARK);
		
		return extent;

	}
}
