package sep20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_Reports {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest logger;
	@BeforeTest
	public void generateReport()
	{
		//define path of html
		reports = new ExtentReports("./test-output/Reports/Demo.html");
	}
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	@Test
	public void testpass()
	{
		//test case starts here
		logger = reports.startTest("Pass test case");
		logger.assignAuthor("Pradeep");
		logger.assignCategory("Functional");
		String Expected_Title = "Google";
		String Actual_Title = driver.getTitle();
		if(Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			logger.log(LogStatus.PASS,Expected_Title+"  "+Actual_Title+"  "+"Title is Matching");
		}
		else
		{
			logger.log(LogStatus.FAIL,Expected_Title+"  "+Actual_Title+"  "+"Title is not Matching");
		}
	}
	@Test
	public void testfail()
	{
		//test case starts here
		logger = reports.startTest("Fail test case");
		logger.assignAuthor("Pradeep");
		logger.assignCategory("Functional");
		String Expected_Title = "Yahoo";
		String Actual_Title = driver.getTitle();
		if(Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			logger.log(LogStatus.PASS,Expected_Title+"  "+Actual_Title+"  "+"Title is Matching");
		}
		else
		{
			logger.log(LogStatus.FAIL,Expected_Title+"  "+Actual_Title+"  "+"Title is not Matching");
		}
	}
	@AfterMethod
	public void teardown()
	{
		reports.endTest(logger);
		reports.flush();
		driver.quit();
	}

}
