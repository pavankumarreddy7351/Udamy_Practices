package TestNG_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {
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
	@Test(groups = "Smoke")
	public void tes1() {
		System.out.println("Test1");
	}
	@Test(groups = "Sanity")
	public void tes2() {
		System.out.println("Test2");
	}
	@Test(groups = "Regrastion")
	public void tes3() {
		System.out.println("Test3");
	}
	@Test(groups = "Smoke")
	public void tes4() {
		System.out.println("Test4");
	}
}
