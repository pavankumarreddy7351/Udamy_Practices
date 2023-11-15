
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Java_Strems {

	public static void main(String[] args) {

		ArrayList name=new ArrayList();
		name.add("hello1");
		name.add("hello2");
		name.add("Aello3");
		name.add("Aello4");
		name.add("Aello5");
		
		Long l=name.stream().filter(s->((String) s).startsWith("A")).count();
		System.out.println(l);
		
		//There is no life for intermediate op is there is no terminal op
		//terminal operation will excute only if inter op (filter) returns ture
		//we can create stream
		//how to use filter in stream API
		Long b=Stream.of("pavan","prakash","ravi","arun","helo").filter(p->
		{
			p.startsWith("p");
			return true;
		}).count();
		System.out.println(b);
		//print all the names arraylist
		name.stream().filter(s->((String) s).length()>4).forEach(s->System.out.println(s));
		
		
		}

}
