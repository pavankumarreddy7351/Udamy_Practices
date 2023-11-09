package Automation.Udemy_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDrop_Down {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'BLR')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'MAA')])[1]")).click();
//		import org.openqa.selenium.By;
//
//		import org.openqa.selenium.WebDriver;
//
//		import org.openqa.selenium.chrome.ChromeDriver;
//
//		import org.testng.Assert;
//
//
//
//		public class Dropdown {
//
//
//
//		public static void main(String[] args) throws InterruptedException {
//
//		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//
//		WebDriver driver =new ChromeDriver();
//
//		driver.get("http://spicejet.com"); //URL in the browser
//
//		//  //a[@value='MAA']  - Xpath for chennai
//
//		//  //a[@value='BLR']
//
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//
//		Thread.sleep(2000);
//
//		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//
//		}
//
//
//
//		}
//
//
	}

}
