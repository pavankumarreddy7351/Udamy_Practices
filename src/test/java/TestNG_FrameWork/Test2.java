package TestNG_FrameWork;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Test2 extends BaseClass{
	@Test(priority = 1)
	public void test4() {
		System.out.println("Test4");

	}
	@BeforeMethod
	public void methos() {
		System.out.println("i will excute every metho");
	}
	@Test(priority = 2, groups = "Sanity")
	public void test5() {
		System.out.println("Test5");
	}
	@Test(alwaysRun =true)
	public void test6() {
		System.out.println("Test6");
	}

}
