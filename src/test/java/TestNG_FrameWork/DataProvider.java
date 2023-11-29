package TestNG_FrameWork;

import org.testng.annotations.Test;

import BaseClass.BaseClass;


public class DataProvider extends BaseClass {
	@Test(dataProvider = "getData")
	public void test1(String userName, String passWord) {
		System.out.println("1st person "+userName+" "+passWord);
		System.out.println("2nd person "+userName+" "+passWord);
		System.out.println("3rd person "+userName+" "+passWord);
	}
	@Test
	public void test2() {

	}
	
	
	//username and Password we need to validate 3 times so [3][2] here 3 means times and 2 means username,password
	
	@org.testng.annotations.DataProvider
	public Object[][] getData() {
		Object[][] data =new Object[3][2];
		data[0][0] = "pavan";
		data[0][1] = "password";
		data[1][0] = "pavan1";
		data[1][1] = "password1";
		data[2][0] = "pavan2";
		data[2][1] = "password2";
		return data;
		
	}
	
}
