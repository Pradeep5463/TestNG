package Sep14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_BrowserTesting {
	WebDriver driver;
	@Parameters({"Browser"})
	 @BeforeTest
	  public void setup(String brw) {
		 switch (brw) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;

		default:
			Reporter.log("Browser value is not matching",true);
			break;
		}
		 
	  }
	 
 @Test(dataProvider = "dp")
 public void validate_login(String user, String pass) {
	  driver.manage().window().maximize();
	  driver.get("http://orangehrm.qedgetech.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("txtUsername")).sendKeys(user);
	  driver.findElement(By.name("txtPassword")).sendKeys(pass);
	  driver.findElement(By.name("Submit")).click();
	  String expected = "dashboard";
	  String actual = driver.getCurrentUrl();
	  if(actual.contains(expected))
	  {
		  Reporter.log("login success::"+expected+"; "+actual,true);
	  }
	  else
	  {
		  Reporter.log("login fail::"+expected+"; "+actual,true);
	  }
	  
 }

 @DataProvider
 public Object[][] dp() {
	  Object login[][] = new Object[5][2];
	  login[0][0] = "Admin";
	  login[0][1] = "Qedge123!@#";
	  login[1][0] = "Admin";
	  login[1][1] = "Qedge123!@#";
	  login[2][0] = "Admin1";
	  login[2][1] = "Qedge123!@#";
	  login[3][0] = "Admin";
	  login[3][1] = "Qedge123!@#";
	  login[4][0] = "Admin";
	  login[4][1] = "Qedge123!@#";
	return login; 
   
 }


 @AfterTest
 public void afterTest() {
	  driver.quit();
 }

}
