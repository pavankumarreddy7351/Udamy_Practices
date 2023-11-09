package Automation.Udemy_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Window_Handling_Tabs extends BaseClass {
@Test
public void window() {
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
	Set <String> windows=driver.getWindowHandles();
	System.out.println(windows);
	Iterator<String> it=windows.iterator();
	System.out.println(it);
	String p=it.next();
	System.out.println(p);
	String c=it.next();
	System.out.println(c);
	driver.switchTo().window(c);
	
	WebElement as=driver.findElement(By.partialLinkText("mentor@rahulshettyacademy.com"));
	wait.until(ExpectedConditions.visibilityOf(as));
	String mailID=as.getText();
	System.out.println(mailID);
	driver.close();
	driver.switchTo().window(p);
	driver.findElement(By.id("username")).sendKeys(mailID);
	
	//driver.quit();
	
	
}

}
