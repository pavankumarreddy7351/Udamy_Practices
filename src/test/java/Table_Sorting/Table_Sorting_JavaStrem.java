package Table_Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Table_Sorting_JavaStrem extends BaseClass{
	@Test
	public void getTableValues()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[1]")).click();
		//capture all elements in List
		List<WebElement> list=driver.findElements(By.xpath("//tr//td[1]"));
		for(WebElement l:list) {
			System.out.println(l.getText());
			
		}
		
		
	/*	
		//javastream
		//capture all elements into orginal string list
		
	List<String> collectedList=	list.stream().map(s->s.getText()).collect(Collector.toList());
		//sort orginal string list
	List<String> sortedList=collectedList.stream().sorted().collect(Collector.toList());
		//compare sortlist and orginallist
	Assert.assertTrue(collectedList.equals(sortedList));
	
		
		//getting price each product
		 
		 //scan the  name of the coloumn with getText();
		  List<String> price= list.stream().filter(s->s.getText().contains("Rice"))
		  .map(s->getPriceVeggie()).collect(Collector.toList());
		  price.forEach(a->System.out.println(a));
		  
	
	
	
	 public static Object getPriceVeggie(){
		  String priceValue= s.findElements(By.xpath("following-sibiling::td[1]"));
		  return priceValue;
		  }
		  */
		driver.quit();
		
		}
		
	

}
