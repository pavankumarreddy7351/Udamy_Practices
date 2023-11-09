package Automation.Udemy_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parse_String {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text=inter();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		driver.findElement(By.id("autocomplete")).click();
		WebElement d=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(d);
		select.selectByVisibleText("Option1");
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
//driver.findElement(By.id("openwindow")).click();
//driver.getWindowHandle();
		

		Thread.sleep(2000);
		
		
		
		
		driver.close();

	}

	public static String inter() {
		WebElement linkText = driver.findElement(By.cssSelector("a.blinkingText"));
		String text = linkText.getText();
		System.out.println(text);
		String s[] = text.split("/");
		String interview = s[0].split(" ")[3];
		return interview;

	}

}
