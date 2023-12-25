package sep11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.AppUtil2;

public class ThirdTestNG extends AppUtil2 {
	@Test
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img)[4]")).click();
	}
	@Test
	public void cbanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
	}
	@Test
	public void ibanking()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
	}
	

}
