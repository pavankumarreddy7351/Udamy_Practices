package Automation.Udemy_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignMent3 {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//*[@value='user']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement a=driver.findElement(By.cssSelector("select[class='form-control']"));
		Select select=new Select(a);
		select.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[class='card-title']")));

		System.out.println(driver.findElement(By.cssSelector("h4[class='card-title']")).getText());
		List<WebElement> a1=driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		for(WebElement a2:a1) {
			System.out.println(a2.getText());
		}
		for(int i=0;i<a1.size();i++) {
			a1.get(i).click();
		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		
		
		
		
	}
}