package Limiting_WebDriver_Scope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation.Udemy_Practice.BaseClass;

public class AssingMent_Not_HardCoded extends BaseClass{
	@Test
	public void hard() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		

		WebElement a=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input"));
		a.click();
		String value=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(value);
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

		Select s=new Select(dropdown);

		s.selectByVisibleText(value);
		driver.findElement(By.name("enter-name")).sendKeys(value);

		driver.findElement(By.id("alertbtn")).click();

		String text=  driver.switchTo().alert().getText();

		if(text.contains(value))

		{
			System.out.println("ok");

		}

		else
			System.out.println("not ok");

	}

}
