package sep11;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Apputil;

public class FirstTestNG extends Apputil {
@Test
public void branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing Branches Test",true);
}
@Test
public void roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing Roles Test",true);
}
@Test
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing Users Test",true);
}
}
