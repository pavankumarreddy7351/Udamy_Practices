package Automation.Udemy_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//WebDriverManager.edgedriver().setup();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.codehim.com/demo/increment-and-decrement-button-in-html/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		WebElement a=driver.findElement(By.id("increment"));
		//a.click();
		for(int i=1;i<=10;i++) {
			a.click();
			//Thread.sleep(2000);
			System.out.println(i);
		}
		int a1=1;
		while(a1<=10) {
			System.out.println(a);
			a.click();
			a1++;
		}
		
		driver.close();

		

	}

}
