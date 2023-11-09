package Automation.Udemy_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.testng.annotations.Test;

public class Practice extends BaseClass{
	@Test
	public void multiWindows() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String>t = tabs.iterator();
		String p=t.next();
		String c=t.next();
		driver.switchTo().window(p);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(c);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
