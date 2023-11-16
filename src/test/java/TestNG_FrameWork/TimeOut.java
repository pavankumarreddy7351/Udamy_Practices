package TestNG_FrameWork;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 10000)
	public void test1() throws Exception {
		Thread.sleep(5000);
		System.out.println("test1");
	}
	@Test(enabled = true)
	public void test2() {
		System.out.println("test2");
	}
	@Test(alwaysRun = true)
	public void test3() {
		System.out.println("test3");
	}
}
