package TestNG_FrameWork;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Parameterized extends BaseClass{
	
	
	@Parameters({"URL","url"})
	@Test
	public void mainTest(String url,String value) {
		System.out.println("Test"+url);
		System.out.println("Test"+value);
	}

}
