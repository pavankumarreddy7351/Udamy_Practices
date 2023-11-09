package Automation.Udemy_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vegitable_Market {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> a=driver.findElements(By.cssSelector("h4.product-name"));
		String[] items= {"Tomato","Cucumber"};
//		for(WebElement b:a) {
//			System.out.println(b.getText());
//			String product=b.getText();
//			if(product.contains("Cucumber")) {
//				
//				break;
//			}
//		}
//		Thread.sleep(5000);
		for(int i=0;i<a.size();i++) {
			String b=a.get(i).getText();
			
			System.out.println(b);
			if(b.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		//driver.quit();
	}

}
