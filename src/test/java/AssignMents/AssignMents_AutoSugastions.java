package AssignMents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class AssignMents_AutoSugastions extends BaseClass{
	@Test
	public void auto() throws Exception {
		String c="South Georgia and the South Sandwich Islands";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("South");
		Thread.sleep(3000);
		List<WebElement> drop=driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper']"));
		for(WebElement d:drop) {
			System.out.println(d.getText());
			if(c.equalsIgnoreCase(d.getText())) {
				d.click();
			}
		}
	
	}
}
