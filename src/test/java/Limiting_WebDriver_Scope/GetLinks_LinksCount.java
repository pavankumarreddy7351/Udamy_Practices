package Limiting_WebDriver_Scope;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.Udemy_Practice.BaseClass;

public class GetLinks_LinksCount extends BaseClass{
	@Test
	public void links() throws Exception {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			System.out.println(link.getText());
		
		}
		//count links in footer//limiting webDriver scope
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//count links in 1st row
		
		WebElement firstrow=footer.findElement(By.xpath("//table//tr//td[1]//ul"));
		System.out.println(firstrow.findElements(By.tagName("a")).size());
		
		//count links in 2nd row
		
		WebElement secoundrow=footer.findElement(By.xpath("//table//tr//td[2]//ul"));
		System.out.println(secoundrow.findElements(By.tagName("a")).size());
//		List<WebElement> checking=secoundrow.findElements(By.tagName("a"));
//		for(WebElement a:checking) {
//			a.click();
//			Thread.sleep(2000);
//			Assert.assertTrue(a.isEnabled());
//			driver.navigate().back();
//			Thread.sleep(1000);
//		}
		
		//select all links in 1st row{we get stale element excption
		
//		for(int i=1;i<firstrow.findElements(By.tagName("a")).size();i++) {
//			firstrow.findElements(By.tagName("a")).get(i).click();
//		}
		
		//solution use navigate back button but 100 link we can write 100 back button use CTRL+CLICK it will open new Tab
		for(int i=1;i<firstrow.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			firstrow.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
		
		driver.close();
	}

}
