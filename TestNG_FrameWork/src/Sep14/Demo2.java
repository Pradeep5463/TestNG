package Sep14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@Test
	public void startTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String Expected = "gmail";
		String Actual = driver.getTitle();
		try {
			Assert.assertTrue(Actual.equalsIgnoreCase(Expected), "Title is Not Matching");
		}catch (Throwable t)
		{
			System.out.println(t.getMessage());
		}
		driver.quit();
	}

}
