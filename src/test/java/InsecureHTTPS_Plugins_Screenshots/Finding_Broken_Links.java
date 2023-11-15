package InsecureHTTPS_Plugins_Screenshots;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Finding_Broken_Links extends BaseClass{
	
	@Test
	public void findingBrokenLinks() throws Exception, IOException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.linkText("SoapUI")).getAttribute("href");
		System.out.println(url);
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int response=conn.getResponseCode();
		System.out.println(response);
		
		
		String url2=driver.findElement(By.linkText("Broken Link")).getAttribute("href");
		System.out.println(url2);
		HttpURLConnection conn2=(HttpURLConnection)new URL(url2).openConnection();
		conn2.setRequestMethod("HEAD");
		conn2.connect();
		int response2=conn2.getResponseCode();
		System.out.println(response2);
		driver.quit();
	}

}

