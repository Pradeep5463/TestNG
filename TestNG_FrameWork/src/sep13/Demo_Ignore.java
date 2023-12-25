package sep13;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil1;

public class Demo_Ignore extends AppUtil1 {
	@Test(enabled = false)
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("55545");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("332");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String addres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(addres+"  "+"Executing Addition Test",true);
	}
	@Test(description = "Validate login test", invocationCount = 3)
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys("45634");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("54365");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String divres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(divres+"  "+"Executing Division Test",true);
	}
	@Test(enabled = false)
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("34");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("12");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String mulres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(mulres+"  "+"Executing Multiplication Test",true);
	}
	}