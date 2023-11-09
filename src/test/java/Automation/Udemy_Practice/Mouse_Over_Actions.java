package Automation.Udemy_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Mouse_Over_Actions extends BaseClass{

	@Test
	public void launchingApplication() {
		driver.get("https://www.amazon.in/");
		WebElement a=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		action.moveToElement(a).build().perform();
		}

}
