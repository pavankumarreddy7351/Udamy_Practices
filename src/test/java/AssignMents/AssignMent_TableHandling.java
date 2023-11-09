package AssignMents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class AssignMent_TableHandling extends BaseClass {
	@Test
	public void Table() {

		driver.get("http://qaclickacademy.com/practice.php");

		WebElement t = driver.findElement(By.id("product"));

		System.out.println(t.findElements(By.tagName("tr")).size());

		System.out.println(t.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow = t.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());

	}

}
