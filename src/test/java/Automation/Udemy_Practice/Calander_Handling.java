package Automation.Udemy_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Calander_Handling extends BaseClass{
	@Test
	public void calander() throws Exception {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		List<WebElement> date=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		for(int i=0;i<date.size();i++) {
		System.out.println(driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText());
		String d=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
		if(d.equalsIgnoreCase("31")) {
			driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			break;
			
		}
		}
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		List<WebElement> date2=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		for(int i=0;i<date2.size();i++) {
		System.out.println(driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText());
		String d=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
		if(d.equalsIgnoreCase("30")) {
			driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			break;
			
		}
		}
		
	}

}
