package TestNG_FrameWork;

import org.testng.annotations.Test;

public class Enabled {

	@Test(enabled = true)
	public void test1() {
		System.out.println("test1");
	}
	@Test(enabled = false)
	public void test2() {
		System.out.println("test2");
	}
	@Test(alwaysRun = false)
	public void test3() {
		System.out.println("test3");
	}
}
