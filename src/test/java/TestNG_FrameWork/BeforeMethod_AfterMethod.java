package TestNG_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class BeforeMethod_AfterMethod extends BaseClass {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void launchApplication() {
		System.out.println("application launching");
	}
	@AfterMethod
	public void closeApplication() {
		System.out.println("application closing");
	}
	@Test
	public void tes1() {
		System.out.println("Test1");
	}
	@Test
	public void tes2() {
		System.out.println("Test2");
	}
	@Test
	public void tes3() {
		System.out.println("Test3");
	}
	@Test
	public void tes4() {
		System.out.println("Test4");
	}
}
