package TestNG_FrameWork;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Test1 extends BaseClass {
	@Parameters({ "URL" })
	@Test
	public void test1(String Url) {
		System.out.println("Test1"+Url);

	}
	@Test(alwaysRun = true)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(alwaysRun = false, groups = "Smoke")
	public void test3() {
		System.out.println("Test3");
	}

}
