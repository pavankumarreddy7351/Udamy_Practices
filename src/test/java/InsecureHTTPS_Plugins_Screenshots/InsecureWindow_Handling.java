package InsecureHTTPS_Plugins_Screenshots;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class InsecureWindow_Handling extends BaseClass{
	@Test
	public void insecure() {
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
