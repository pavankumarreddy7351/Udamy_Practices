package TestNG_FrameWork;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterized {
	
	
	@Parameters({"URL","url"})
	@Test
	public void mainTest(String url,String value) {
		System.out.println("Test"+url);
		System.out.println("Test"+value);
	}

}
