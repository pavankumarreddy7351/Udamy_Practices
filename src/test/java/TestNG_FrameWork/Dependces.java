package TestNG_FrameWork;

import org.testng.annotations.Test;

public class Dependces {
	
		@Test(dependsOnMethods = {"test2","test3"})
		public void test1() {
			
			System.out.println("Test1");

		}
		@Test()
		public void test2() {
			
			System.out.println("Test2");
			
		}
		@Test(groups = "Smoke")
		public void test3() {
			
			System.out.println("Test3");
			
		}
}
