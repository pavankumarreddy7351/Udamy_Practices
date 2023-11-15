package InsecureHTTPS_Plugins_Screenshots;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Take_ScreenShots extends BaseClass{
	@Test
	public void screenshot() throws Exception {
		driver.manage().deleteAllCookies();
		driver.get("https://chromedriver.chromium.org/capabilities");
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\puchha.pavan\\Automation\\Udemy_Practice\\screenshots\\shot.pdf"));
	}

}
