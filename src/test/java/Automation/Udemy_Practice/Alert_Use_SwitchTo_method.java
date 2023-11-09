package Automation.Udemy_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Use_SwitchTo_method {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("enter-name")).sendKeys("Pavan");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String  a=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(a);
		String[] pa=a.split(" ");
		System.out.println(pa[1]);
		String ap=pa[1];
		String[] pp=ap.split(",");
		String aa=pp[0];
		System.out.println(aa);
		
		if(aa.equalsIgnoreCase("pavan")) {
			System.out.println("Alert msg is correct");
		}
		else {
			System.out.println("Alert msg is not correct");
		}
		Assert.assertEquals(aa, "Pavan", "Alert is not working");
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys("Pavan");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys("Pavan");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
	}



}

