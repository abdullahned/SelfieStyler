package extentreport;

import com.aventstack.extentreports.ExtentReports;

public class ExtentFactory {
	
	public static ExtentReports getinstance()
	{
		
		ExtentReports extent;
		
		String path= "C:\\Users\\m.abdullah\\git\\SelfieStyler\\SelfieStyler\\Reports";
		extent = new ExtentReports();
		
		return extent;
		
		
		
	}
	

}

