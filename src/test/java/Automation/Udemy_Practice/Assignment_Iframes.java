package Automation.Udemy_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment_Iframes extends BaseClass{
	@Test
	public void iframes() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");



		driver.switchTo().frame("frame-middle");



		System.out.println(driver.findElement(By.id("content")).getText());



	}


}
